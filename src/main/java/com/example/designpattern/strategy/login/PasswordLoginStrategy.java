package com.example.designpattern.strategy.login;

import java.util.Map;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PasswordLoginStrategy implements LoginStrategy{
    @Override
    public String getLoginType() {
        return "password";
    }

    @Override
    public boolean execute(Map<String, String> params) {
        String username = params.get("username");
        String password = params.get("password");

        if (!"123456".equals(password)) {
            throw new IllegalArgumentException("Username or password is not correct");
        }

        log.info("User {} login successfully", username);
        
        return true;
    }
}
