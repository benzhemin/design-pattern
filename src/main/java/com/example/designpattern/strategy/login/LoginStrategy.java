package com.example.designpattern.strategy.login;

import java.util.Map;

public interface LoginStrategy {
    String getLoginType();

    boolean execute(Map<String, String> params);
}
