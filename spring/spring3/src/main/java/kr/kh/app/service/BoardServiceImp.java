package kr.kh.app.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.kh.app.dao.BoardDAO;
import kr.kh.app.model.vo.BoardVO;
import kr.kh.app.model.vo.MemberVO;
import kr.kh.app.pagination.Criteria;

@Service
public class BoardServiceImp implements BoardService{
	
	@Autowired BoardDAO boardDao;
	
	private boolean strCheck(String str) {
		if(str == null || str.length() == 0) {
			return false;
		}
		return true;
	}
	
	@Override
	public ArrayList<BoardVO> getBoardList(Criteria cri) {
		if(cri == null)
			cri = new Criteria();
		
		return boardDao.selectBoardList(cri);
	}

	@Override
	public int getBoardTotalCount(Criteria cri) {
		return boardDao.selectBoardTotalCount(cri);
	}

	@Override
	public boolean insertBoard(MemberVO user, BoardVO board) {
		if(user == null) {
			return false;
		}
		if( board == null ||
			!strCheck(board.getBo_content()) ||
			!strCheck(board.getBo_title())) {
			return false;
		}
		board.setBo_me_id(user.getMe_id());
		return boardDao.insertBoard(board);
	}
	
}
