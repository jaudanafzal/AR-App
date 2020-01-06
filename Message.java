package com.example.testappjava;

public class Message {
    private String text;
    private StartActivity.MemberData memberData;
    private boolean belongsToCurrentUser;

    public Message(String text, StartActivity.MemberData data, boolean belongsToCurrentUser) {
        this.text = text;
        this.memberData = data;
        this.belongsToCurrentUser = belongsToCurrentUser;
    }

    public String getText() {
        return text;
    }

    public StartActivity.MemberData getMemberData() {
        return memberData;
    }

    public boolean isBelongsToCurrentUser() {
        return belongsToCurrentUser;
    }
}
