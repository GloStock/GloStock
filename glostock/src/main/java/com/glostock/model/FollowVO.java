package com.glostock.model;

import java.sql.Timestamp;

public class FollowVO {
    private int followNum;
    private String ticker;
    private String nickname;
    private Timestamp timestamp;

    public FollowVO() {
    }

    public FollowVO(int followNum, String ticker, String nickname, Timestamp timestamp) {
        this.followNum = followNum;
        this.ticker = ticker;
        this.nickname = nickname;
        this.timestamp = timestamp;
    }

    public int getFollowNum() {
        return followNum;
    }

    public void setFollowNum(int followNum) {
        this.followNum = followNum;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
