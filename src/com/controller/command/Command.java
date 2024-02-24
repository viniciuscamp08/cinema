package com.controller.command;

import java.util.Map;

public interface Command {

    public void executar(Map<String, Object> params);

}
