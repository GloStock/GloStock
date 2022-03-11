package com.glostock.mapper;

import com.glostock.model.FollowVO;

import java.sql.ResultSet;
import java.util.ArrayList;

public interface FollowMapper {

    public int follow(FollowVO vo);
    public ResultSet getFollowList(FollowVO vo);
    public int deleteFollow(FollowVO vo);

}

