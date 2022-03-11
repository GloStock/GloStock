package com.glostock.service;

import com.glostock.mapper.FollowMapper;
import com.glostock.model.FollowVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("followService")
public class FollowServiceImpl implements FollowService {

    @Autowired
    private FollowMapper mapper;

    @Override
    public int follow(String nickname, String ticker) {

        int result = mapper.follow(nickname, ticker);

        return result;
    }

    @Override
    public ArrayList<FollowVO> getFollowList(String nickname) {
        return null;
    }

    @Override
    public int delete(String nickname, String ticker) {
        int result = mapper.delete(nickname, ticker);
        return result;
    }
}
