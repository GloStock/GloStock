package com.glostock.service;

import com.glostock.model.FollowVO;

import java.util.ArrayList;

public interface FollowService {

    public void follow(FollowVO vo);
    public ArrayList<FollowVO> getFollowList(FollowVO vo);
    public void deleteFollow(FollowVO vo);

}
