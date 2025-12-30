package com.example.designpattern.strategy.login;

import java.util.Map;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WechatLoginStrategy implements LoginStrategy {
    @Override
    public String getLoginType() {
        return "Wechat";
    }

    @Override
    public boolean execute(Map<String, String> params) {
        String authCode = params.get("code");

        if (authCode == null) {
            throw new IllegalArgumentException("NO user found");
        }

        log.info("Wechat strategy executed, authCode: {}", authCode);

        return true;
    }
}
