package org.jy.controller;

import java.util.LinkedList;
import java.util.List;

import org.jy.domain.SampleVO;
import org.jy.domain.SampleVOList;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SampleController {

	//레스트 턴크롤러의 리턴타입은 무존거 데이터.
	
	@RequestMapping("/sayHello")
	public String sayHello(){
		return "HELLO";
	}
	
	@RequestMapping("/votest")
	public SampleVO getSampleVO(){
		SampleVO vo = new SampleVO();
		vo.setFirstName("최");
		vo.setLastName("지영");
		vo.setMno(100);
		
		return vo;
	}
	
	@RequestMapping("/volist")
//	public List<SampleVO> getList(){
	//이렇게 클래스 하나 더 만들어서 해야 오류 안난다 . 
	public SampleVOList getList(){

		List<SampleVO> list = new LinkedList<SampleVO>();
		for (int i = 0; i < 10; i++) {
			SampleVO vo = new SampleVO();
			vo.setMno(i);
			vo.setFirstName(i+"지");
			vo.setLastName(i+"영");
			list.add(vo);
		}
		SampleVOList volist = new SampleVOList();
		volist.setList(list);
		return volist;
		
	}
	
}
