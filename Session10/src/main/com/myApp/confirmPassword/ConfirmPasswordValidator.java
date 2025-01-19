package main.com.myApp.confirmPassword;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import main.com.myApp.confirmPassword.ConfirmPassword;
import main.com.myApp.model.UserModel;

public class ConfirmPasswordValidator implements ConstraintValidator<ConfirmPassword, UserModel> {


    @Override
    public boolean isValid(UserModel userModel, ConstraintValidatorContext context) {
        String password = userModel.getPassword();
        String confirmPassword = userModel.getConfirmPassword();
        return password != null && password.equals(confirmPassword);
    }
}
