package org.jy.controller;

import org.jy.domain.SampleVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restex/*")
public class SampleRestContorller {

	private static final Logger logger = LoggerFactory.getLogger(SampleRestContorller.class);
	
	
//	@RequestMapping(value="",method=RequestMethod.GET)
//	public void doget(){
//		
//		logger.info("get로 들어왔다");
//		
//	}
	
	@RequestMapping(value="/{bno}", method=RequestMethod.POST)
	public void doCreate(@PathVariable("bno") int bno, @RequestBody SampleVO vo){
		
		//호출하는 주소 바로 뒤에 /123 이런식으로 호출하는 것. 
		logger.info("create로 들어왔다. 그리고 bno: "+bno);
		logger.info("vo: "+vo.toString());
	}
	
	@RequestMapping(value="",method={RequestMethod.PUT,RequestMethod.POST})
	public void doupdate(){
		
		logger.info("update로 들어왔다");
		
	}
	
	@RequestMapping(value="",method=RequestMethod.DELETE)
	public void doDelete(){
		
		logger.info("delete로 들어왔다 ");
		
	}
	
	
	//화면 개발하기전 포스트맨으로!!
}
