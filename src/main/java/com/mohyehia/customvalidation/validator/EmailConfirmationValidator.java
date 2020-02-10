package com.mohyehia.customvalidation.validator;

import com.mohyehia.customvalidation.entity.User;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailConfirmationValidator implements ConstraintValidator<EmailConfirmation, User> {
    @Override
    public boolean isValid(User user, ConstraintValidatorContext constraintValidatorContext) {
        if(user.getEmail() != null){
            return user.getEmail().equals(user.getConfirmEmail());
        }else{
            return false;
        }
    }
}
