package com.luodexin.conversionapp.convertor;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.util.StrutsTypeConverter;

import com.opensymphony.xwork2.ActionContext;

public class DateConvertor extends StrutsTypeConverter {
	
	private DateFormat dateFormat;
	
	public DateConvertor() {
		System.out.println("DateConvertor Constractor ........");
		//�ഴ��ʵ���� Servlet û��ȫ���أ������ٹ��캯�����ȡ ServletContex
	}

	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {
		if(toClass == Date.class){
			if(values != null && values.length > 0){
				String value = values[0];
				try {
					return getFormate().parseObject(value);
				} catch (ParseException e) {
					System.out.println("����ת���쳣����������");
					e.printStackTrace();
				}
			}
		}
		return values;
	}

	@Override
	public String convertToString(Map context, Object o) {
		if(o instanceof Date){
			Date date = (Date)o;
			return getFormate().format(date);
		}
		return null;
	}

	
	public DateFormat getFormate(){
		ServletContext context = ServletActionContext.getServletContext();
		String pattern = context.getInitParameter("pattern");
		System.out.println(pattern+"......");
		dateFormat = new SimpleDateFormat(pattern);
		return dateFormat;
	}


}
