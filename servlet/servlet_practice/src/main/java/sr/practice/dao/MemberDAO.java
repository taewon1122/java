package sr.practice.dao;

import org.apache.ibatis.annotations.Param;

import sr.practice.model.vo.MemberVO;

public interface MemberDAO {

	boolean insertMember(@Param("member") MemberVO member);

}
