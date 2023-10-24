package com.prateek.Usermanagement.repo;

import com.prateek.Usermanagement.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository                      // Same as Component
public class UserRepo {

    @Autowired
    List<User> userList;

    public  List<User> getUserList(){
        return  userList;
    }
}
