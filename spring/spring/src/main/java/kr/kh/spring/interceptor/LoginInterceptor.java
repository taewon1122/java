package kr.kh.spring.interceptor;

import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import kr.kh.spring.model.vo.MemberVO;
import kr.kh.spring.service.MemberService;

public class LoginInterceptor extends HandlerInterceptorAdapter{
	//디스패쳐서블릿에서 컨트롤러로 가기 전 작업할 내용 : 컨트롤러 실행 전 동작
	//멤버필터, 게스트 필터 구현할 수 있다
	/*
	@Override
	public boolean preHandle(HttpServletRequest request,
	HttpServletResponse response,
	Object handler)
		throws Exception {
		return true;
	}
	*/
	
	@Autowired
	MemberService memberService;
	
	//컨트롤러에서 디스패처서블릿으로 가기전 작업할 내용 : 컨트롤러 실행 후 동작
	//로그인
	@Override
	public void postHandle(
		HttpServletRequest request,
		HttpServletResponse response,
		Object handler,
		ModelAndView modelAndView)
		throws Exception {
		//ModelAndView 객체엥서 model 객체에 넣어준 user를 가져오는 코드
		MemberVO user = (MemberVO) modelAndView.getModel().get("user");
		//회원 정보가 있으면
		if(user != null) {
			//세선에 회원 정보를 추가
			request.getSession().setAttribute("user", user);
			
			//자동 로그인을 체크했으면
			if(user.isAutoLogin()) {
				//쿠키를 생성해서 
				String value = request.getSession().getId();
				Cookie cookie = new Cookie("loginCookie", value);
				cookie.setPath("/");
				//1주일
				int time = 7 * 24 * 60 * 60; //7일을 초로 환산
				cookie.setMaxAge(time);
				//화면에 전송
				response.addCookie(cookie);
				//DB에 관련 정보를 추가
				//세션 아이디와 만료시간
				user.setMe_cookie(value);
				Date date = new Date(System.currentTimeMillis() + time * 1000);
				user.setMe_cookie_limit(date);
				memberService.updateMemberCookie(user);
			}
		}
	}
}
