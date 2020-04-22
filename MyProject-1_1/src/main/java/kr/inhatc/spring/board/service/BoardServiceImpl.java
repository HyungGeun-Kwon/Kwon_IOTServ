package kr.inhatc.spring.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.inhatc.spring.board.dto.BoardDto;
import kr.inhatc.spring.board.mapper.BoardMapper;

@Service //메모리 올리기 Impl 종류는 무조건 사용한다고 생각. 
public class BoardServiceImpl implements BoardService {

	@Autowired // 메모리 올리기
	private BoardMapper boardMapper;
	
	@Override
	public List<BoardDto> boardList() {
		return boardMapper.boardList();
	}
	
}
