package com.luodexin.testi18napp;

import java.util.Arrays;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class TestI18NAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	
	public String execute(){
		
		//1. Action �з��� ���ʻ���Դ
		String username = getText("username");
		System.out.println(username);
		
		//2. ��ռλ������Դ
		String date = getText("time", Arrays.asList(new Date()));
		System.out.println(date);
		
		
		return SUCCESS;
	}
	
}
