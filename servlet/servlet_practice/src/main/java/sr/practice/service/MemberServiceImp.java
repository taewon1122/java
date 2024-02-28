package sr.practice.service;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import sr.practice.dao.MemberDAO;
import sr.practice.model.vo.MemberVO;

public class MemberServiceImp implements MemberService{
	
	MemberDAO memberDao;
	public MemberServiceImp() {
		String resource = "sr/practice/config/mybatis-config.xml";
		InputStream inputStream;
		SqlSession session;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			session = sessionFactory.openSession(true);
			memberDao = session.getMapper(MemberDAO.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean signup(MemberVO member) {
		if(member == null) {
			return false;
		}
		if( member.getMe_id() == null ||
			member.getMe_pw() == null ||
			member.getMe_email() == null) {
			return false;
		}
		return memberDao.insertMember(member);
	}
	
	
}
