package com.glostock.service;

import com.glostock.mapper.FollowMapper;
import com.glostock.model.FollowVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.util.ArrayList;

@Service("followService")
public class FollowServiceImpl implements FollowService {

    @Autowired
    private FollowMapper mapper;

    @Override
    public void follow(FollowVO vo) {
        mapper.follow(vo);
    }

    @Override
    public ArrayList<FollowVO> getFollowList(FollowVO vo) {
        ArrayList<FollowVO> resultList = new ArrayList<>();
        ResultSet rs = mapper.getFollowList(vo);
        try {
            while (rs.next()) {
                FollowVO resultVO = new FollowVO();
                resultVO.setTimestamp(rs.getTimestamp("APPENDTIME"));
                resultVO.setNickname(rs.getString("NICKNAME"));
                resultVO.setTicker(rs.getString("TICKER"));
                resultVO.setFollowNum(rs.getInt("FOLLOWID"));
                resultList.add(resultVO);
            }
        } catch (Exception e) {
            System.out.println("Error in ResultSet process");
            e.printStackTrace();
        }

        return resultList;
    }

    @Override
    public void deleteFollow(FollowVO vo) {
        mapper.deleteFollow(vo);
    }
}
