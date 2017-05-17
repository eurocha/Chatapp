package com.interpretertap.interpretertap;

import java.util.Date;

/**
 * Created by JinsooWorld on 5/16/17.
 */

public class Chatapp {
    private String text;
    private String textUser;
    private long textTime;

    public Chatapp (String text, String textUser)
    {
        this.text = text;
        this.textUser = textUser;
        textTime = new Date().getTime();
    }

    public Chatapp()
    {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTextUser() {
        return textUser;
    }

    public void setTextUser(String textUser) {
        this.textUser = textUser;
    }

    public long getTextTime() {
        return textTime;
    }

    public void setTextTime(long textTime) {
        this.textTime = textTime;
    }
}
