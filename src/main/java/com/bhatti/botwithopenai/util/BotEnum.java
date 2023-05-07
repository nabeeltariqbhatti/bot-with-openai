package com.bhatti.botwithopenai.util;

public enum BotEnum {
    OLYMPIC_BOT_SYSTEM("system", "You answer questions about the 2022 Winter Olympics.", ""),
    OLYMPIC_BOT_USER("user", " answer the question  %s by using below article \n Article: %s", Artictles.olympicArticles);

    private  final String roleName;
    private final String instruction;
    private final String data;

    BotEnum(String roleName, String instruction, String data) {
        this.roleName = roleName;
        this.instruction = instruction;
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public String getInstruction() {
        return instruction;
    }

    public String getRoleName() {
        return roleName;
    }
}
