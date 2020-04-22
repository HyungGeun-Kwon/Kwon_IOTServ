package kr.inhatc.spring.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.inhatc.spring.board.dto.BoardDto;

@Mapper //얘가 매퍼다 하고 알려줌 
public interface BoardMapper {

	// 메소드의 이름과 쿼리의 이름을 동일하게 처리
	// boardList라는애를 xml파일에서 호출. 리스트로  불러오고 그것을 리스트를 담아서 서비스 impl에서 불러올 수 있고 리턴함  -> 컨트롤러에서 받아서 컨트롤러의 리스트가 받음.
	List<BoardDto> boardList();

}
