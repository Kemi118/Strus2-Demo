package com.luodexin.struts2.getWEBresourse;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.regexp.internal.recompile;

public class Product {
	
	private String id;
	private String name;
	private String desc;
	private String price;
	
	public Product() {	}

	public Product(String id, String name, String desc, String price) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	//action ����
	public String execute() {
		
		ActionContext actionContext = ActionContext.getContext();
		
		//1. ����ServletContext
		Map<String, Object> applicationMap = actionContext.getApplication();
		applicationMap.put("appKey", "appValue");
		
		//2.����session����
		Map<String, Object> sessionMap = actionContext.getSession();
		sessionMap.put("sessionKey", "sessionValue");
		
		//3.����request����
		Map<String, Object> requestMap = (Map<String, Object>) actionContext.get("request");
		requestMap.put("requestKey", "requestValue");
		//������
//		requestMap.get("requestKey");
		//4.��ȡ�������    ���������Mapֻ�ܶ�������д �� д�������ã������ᱨ��
		Map<String, Object> parametersMap = actionContext.getParameters();
		System.out.println(((String [])(parametersMap.get("name")))[0]);
		
		return "success";
	}
}
