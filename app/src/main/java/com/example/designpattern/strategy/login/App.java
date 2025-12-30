package com.example.designpattern.strategy.login;

import java.util.Map;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
    public static void main(String[] args) {

        LoginStrategy passwordStrategy = new PasswordLoginStrategy();
        LoginStrategy wechatStrategy = new WechatLoginStrategy();

        LoginStrategyFactory factory = new LoginStrategyFactory(
                Map.of(
                        passwordStrategy.getLoginType(), passwordStrategy,
                        wechatStrategy.getLoginType(), wechatStrategy));

        LoginStrategy strategy = factory.getStrategy("Wechat");

        log.info("Executing strategy: {}", strategy.getLoginType());
        strategy.execute(Map.of("code", "AAAAAAA"));
    }
}
