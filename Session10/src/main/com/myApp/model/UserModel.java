package main.com.myApp.model;

import lombok.Getter;
import lombok.Setter;
import main.com.myApp.confirmPassword.ConfirmPassword;
import org.springframework.stereotype.Component;

import javax.crypto.MacSpi;
import javax.swing.*;
import javax.validation.constraints.*;

@Component
@Setter
@Getter
@ConfirmPassword
public class UserModel
{
   /* @NotNull(message = "is requird")
    @Size(min = 1,message = "this field is required")*/
    @NotBlank(message = "field is required")
    private String userName;

    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$",message = "not valid email")
    private String email;

    @Size(min = 4,max = 10,message = "enter a valid password")
    @NotBlank(message = "confrim the password")
    private String confirmPassword;


    @NotBlank(message = "must enter to confirm the password")
    @Size(min = 4,max = 10,message = "enter a valid password")
    private String password;
}
