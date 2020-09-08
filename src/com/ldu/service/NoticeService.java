package com.ldu.service;

import java.util.List;

import com.ldu.pojo.Notice;
import com.ldu.pojo.NoticeExtend;
//通知
public interface NoticeService {

	List<Notice> getNoticeList();
	
	public void insertSelective(Notice notice);
	
	



}
