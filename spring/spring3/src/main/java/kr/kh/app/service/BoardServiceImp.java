package kr.kh.app.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.kh.app.dao.BoardDAO;
import kr.kh.app.model.vo.BoardVO;
import kr.kh.app.pagination.Criteria;

@Service
public class BoardServiceImp implements BoardService{
	
	@Autowired BoardDAO boardDao;

	@Override
	public ArrayList<BoardVO> getBoardList(Criteria cri) {
		if(cri == null)
			cri = new Criteria();
		
		return boardDao.selectBoardList(cri);
	}

	@Override
	public int getBoardTotalCount() {
		return boardDao.selectBoardTotalCount();
	}
	
}
