package com.example.savepassword.controller;


import com.example.savepassword.entity.SaveUser;
import com.example.savepassword.service.SaveUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserSaveController {


    @Autowired
    private SaveUserService  saveUserService;

    @PostMapping("/newUser")
    public SaveUser addUser(@RequestBody SaveUser saveUser){
        return  saveUserService.addSaveUser(saveUser);
    }

}
