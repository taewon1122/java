package kr.kh.app.service;

import java.util.ArrayList;

import kr.kh.app.model.vo.BoardVO;
import kr.kh.app.model.vo.CommunityVO;
import kr.kh.app.model.vo.MemberVO;
import kr.kh.app.pagination.Criteria;

public interface BoardService {

	ArrayList<BoardVO> getBoardList(Criteria cri);

	boolean insertBoard(BoardVO board);

	ArrayList<CommunityVO> getCommunityList();

	int getTotalCount(Criteria cri);

	boolean updateView(int num);

	BoardVO getBoard(int num);

	boolean deleteBoard(int num, MemberVO user);

}
