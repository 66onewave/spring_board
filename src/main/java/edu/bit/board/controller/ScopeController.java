package edu.bit.board.controller;

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
@RequestMapping("/scope/*")
public class ScopeController {
   
   // .../scope/
   @RequestMapping("/")
   public String scope(BoardVO boardVO) {
       log.info("/scope/");
       
       return "/scope/scope";
   } 
   
   @RequestMapping("/result")
   public String result() {
       log.info("/result/");
       
       return "/scope/result";
   }
}
