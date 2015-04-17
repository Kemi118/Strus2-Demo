package com.luodexin.struts2.app;

import java.util.Arrays;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class Testi18nAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	private Date date;
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Testi18nAction() {
		
	}
	
	public String execute(){
		//1. �� Action �з��ʹ��ʻ���Դ�ļ��� value ֵ
		String username = getText("username");
		System.out.println(username);
		
		//2. ��ռλ����
		String time = getText("time" , Arrays.asList(new Date()));
		System.out.println(time);
		
		//3. ҳ����ͨ�� OGNL ���� date
		date = new Date();
		
		return SUCCESS;
	}

}
