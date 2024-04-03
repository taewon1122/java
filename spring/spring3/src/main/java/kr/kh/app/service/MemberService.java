package kr.kh.app.service;

import kr.kh.app.model.vo.MemberVO;

public interface MemberService {

	int getMemberCount();

	boolean signup(MemberVO member);

	MemberVO login(MemberVO member);

}