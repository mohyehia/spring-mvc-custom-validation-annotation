package com.mohyehia.customvalidation.entity;

import com.mohyehia.customvalidation.validator.EmailConfirmation;
import com.mohyehia.customvalidation.validator.PasswordConfirmation;
import com.mohyehia.customvalidation.validator.PhoneNumber;
import lombok.Data;

@Data
@PasswordConfirmation(
        password = "password",
        confirmPassword = "confirmPassword",
        message = "Password and confirmation password must be the same!"
)
@EmailConfirmation(
        email = "email",
        confirmEmail = "confirmEmail"
)
public class User {
    private String firstName;
    private String lastName;
    @PhoneNumber(message = "This phone number is not valid")
    private String phoneNumber;
    private String password;
    private String confirmPassword;
    private String email;
    private String confirmEmail;
}