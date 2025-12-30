package com.example.designpattern.strategy.login;

import java.util.Map;

public class LoginStrategyFactory {
    private final Map<String, LoginStrategy> strategyMap;

    public LoginStrategyFactory(Map<String, LoginStrategy> strategy) {
        this.strategyMap = strategy;
    }

    public LoginStrategy getStrategy(String loginType) {
        LoginStrategy strategy = strategyMap.get(loginType);

        if (strategy == null) {
            throw new IllegalArgumentException("Not Support Login Type" + loginType);
        }

        return strategy;
    }
}
