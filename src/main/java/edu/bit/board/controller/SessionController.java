package edu.bit.board.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.bit.board.page.Criteria;
import edu.bit.board.page.PageVO;
import edu.bit.board.service.BoardService;
import edu.bit.board.vo.BoardVO;
import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@RequestMapping("/session/*") // /session 으로 치고 들어오는 모든 것들은 controller가 담당
public class SessionController {

	// /cookie/create
	@RequestMapping("/create")
	public String create(HttpServletRequest request) {
		log.info("/session/create/..");
		
		HttpSession session = request.getSession();
		session.setAttribute("tel", "010-1234-1234");
		session.setAttribute("name", "abcd");
		
		return "/session/get"; // 서버에 바로 올려놓기 때문에 redirect 필요 없음
	}

	
}
