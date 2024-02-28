package sr.practice.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sr.practice.model.vo.MemberVO;
import sr.practice.service.MemberService;
import sr.practice.service.MemberServiceImp;
@WebServlet("/signup")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private MemberService memberService = new MemberServiceImp();
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/signup.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//화면에 입력된 정보를 받는다
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String email = request.getParameter("email");
		//객채 생성한다.
		MemberVO member = new MemberVO(id, pw, email, "이용중");
		//서비스한테 시킨다 id, email, state를 db에 넣으라고
		boolean res = memberService.signup(member);
		//성공시에 회원가입을 완료 했습니다. 출력
		if(res) {
			request.setAttribute("msg", "회원가입을 완료 했습니다.");
			request.setAttribute("url", "");
		}
		//실패시 회원가입을 완료하지 못했습니다. 출력
		else {
			request.setAttribute("msg", "회원가입을 완료하지 못했습니다.");
			request.setAttribute("url", "signup");
		}
		request.getRequestDispatcher("/WEB-INF/views/message.jsp").forward(request, response);
	}

}
