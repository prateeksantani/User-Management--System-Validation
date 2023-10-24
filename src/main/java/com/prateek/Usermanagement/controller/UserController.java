package com.prateek.Usermanagement.controller;

import com.prateek.Usermanagement.entity.User;
import com.prateek.Usermanagement.repo.PasswordChanger;
import com.prateek.Usermanagement.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("Users")
    public  List<User> getAllUser()
    {
       return userService.getAllUser();
    }

    @PostMapping("Users")
    public  String addUsers(@RequestBody @Valid List<User> myUser)
    {
         return  userService.addUsers(myUser);
    }

    @PutMapping("user/password")
    public String updatePasswordByUserId(@RequestBody @Valid PasswordChanger passwordChanger)
    {
        return  userService.updatePasswordByUserId(passwordChanger.getId(),passwordChanger.getPassword());
    }
}
