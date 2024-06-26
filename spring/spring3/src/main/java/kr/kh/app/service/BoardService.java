package kr.kh.app.service;

import java.util.ArrayList;

import kr.kh.app.model.vo.BoardVO;
import kr.kh.app.model.vo.MemberVO;
import kr.kh.app.pagination.Criteria;

public interface BoardService {

	ArrayList<BoardVO> getBoardList(Criteria cri);

	int getBoardTotalCount(Criteria cri);

	boolean insertBoard(MemberVO user, BoardVO board);

	BoardVO getBoard(int num);

	void updateView(int num);

}
