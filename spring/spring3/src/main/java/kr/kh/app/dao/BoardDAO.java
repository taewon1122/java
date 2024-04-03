package kr.kh.app.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import kr.kh.app.model.vo.BoardVO;
import kr.kh.app.pagination.Criteria;

public interface BoardDAO {

	ArrayList<BoardVO> selectBoardList(@Param("cri") Criteria cri);

	int selectBoardTotalCount();

}
