package com.luodexin.struts2.testIDCard;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

public class IDCardValidator extends FieldValidatorSupport {

	@Override
	public void validate(Object object) throws ValidationException {
		//1.��ȡ �ֶ��� �� ֵ
		String fielName = getFieldName();
		Object value = this.getFieldValue(fielName, object);
		//2.��֤
		IDCard card = new IDCard();
		boolean isValidate = card.Verify((String)value);
		//3.�����֤��ͨ������Ӵ�����Ϣ
		if(!isValidate){
			addFieldError(fielName , object);
		}
		
	}

}
