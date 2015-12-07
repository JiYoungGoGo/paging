package org.jy.domain;

import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="volist")
public class SampleVOList {

	
	@XmlElement(name="vodate")
	private List<SampleVO> listData;
	
	public SampleVOList(){
		listData = new LinkedList<SampleVO>();
	}

	public List<SampleVO> getList() {
		return listData;
	}

	public void setList(List<SampleVO> listData) {
		this.listData = listData;
	}

	@Override
	public String toString() {
		return "SampleVOList [list=" + listData + "]";
	}
	
	
}
