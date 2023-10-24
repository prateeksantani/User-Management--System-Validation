package com.prateek.Usermanagement.repo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PasswordChanger {

    private  Integer id;
    private String password;
}
