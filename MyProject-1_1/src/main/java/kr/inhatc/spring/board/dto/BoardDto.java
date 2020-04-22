package kr.inhatc.spring.board.dto;

//DTO : Data Transfer Object

import lombok.Data;

//@Getter
//@Setter
//@ToString 이 세가지 다 알아서 생성 다됨
@Data // 이거만 붙이면 get set 됨. 단, lombok 설치시
public class BoardDto {
	
	private int boardIdx;
	private String title;
	private String contents;
	private int hitCnt;
	private String creatorId;
	private String createDatetime;
	
	
	
}
