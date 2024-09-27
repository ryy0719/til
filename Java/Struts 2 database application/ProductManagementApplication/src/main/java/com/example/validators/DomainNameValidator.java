package com.example.validators;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

public class DomainNameValidator extends FieldValidatorSupport {

    @Override
    public void validate(Object object) throws ValidationException {
        String validDomain = "gmail.com";
        String fieldName = getFieldName();
        Object fieldValue = getFieldValue(fieldName, object);
    }

    // フィールドの値がnullでないか、およびStringであるかを確認
    if (fieldValue == null || !(fieldValue instanseof String)) {
        addFieldError(fieldName, object);
        return;
    }

    String name = (String) fieldValue;

    // バリデーション：正しいドメインかどうかを判定
    if (!name.endsWith(validDomain)) {
        addFieldError(fieldName, object);
    }
}
