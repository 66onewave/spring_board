package edu.bit.board.controller;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.DataSource;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import edu.bit.board.vo.BoardVO;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({ "file:src/main/webapp/WEB-INF/spring/root-context.xml",
"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml" })

public class BoardControllerTest {

	@Setter(onMethod_ = {@Autowired}) // @Autowired 사용해도 무관
	private WebApplicationContext ctx;
	
	private MockMvc mockMvc;
  
	 @Before // 테스트 실행하기 전에 먼저 실행해야 될 것
	   public void setup() {
		 mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build(); //mockMvc 객체생성
	 
	   }
	 
	 @Test // controller - list 함수 테스트
	   public void testList()  throws Exception  {
	       mockMvc.perform(get("/list"))
	       .andExpect(status().isOk())//응답 검증
	       .andDo(print())
	       .andExpect(forwardedUrl("/WEB-INF/views/list.jsp"));
	   }

}
