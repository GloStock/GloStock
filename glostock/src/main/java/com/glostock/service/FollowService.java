package com.glostock.service;

import com.glostock.model.FollowVO;

import java.util.ArrayList;

public interface FollowService {

    public int follow(String nickname, String ticker);
    public ArrayList<FollowVO> getFollowList(String nickname);
    public int delete(String nickname, String ticker);

}
