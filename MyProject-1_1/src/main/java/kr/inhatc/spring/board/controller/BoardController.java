package kr.inhatc.spring.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import kr.inhatc.spring.board.dto.BoardDto;
import kr.inhatc.spring.board.service.BoardService;


@Controller// 컨트롤러는 이렇게 컨트롤러를 반드시 붙여야한다.(컨트롤러는 웹사이트로 줄때) => index.html을 찾는다.
//@RestController // 이거는 바로 결과물 출력하게 해준다.
public class BoardController {
	
	@Autowired //@Bean과 비슷 자동으로 붙여준다.
	private BoardService boardService;//멤버필드
	
	@RequestMapping("/")// 이렇게 하면 localhost:18080/ 할시 이 페이지 켜진다.
	public String hello() {
		return "index";
	}
	
	@RequestMapping("/board/boardList.do")
	public String boardList(Model model) {
		List<BoardDto> list = boardService.boardList();
		System.out.println("==========>" + list.size());
		model.addAttribute("list", list);
		return "board/boardList";
	}
}
