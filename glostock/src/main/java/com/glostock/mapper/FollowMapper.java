package com.glostock.mapper;

public interface FollowMapper {

    public int follow(String nickname, String ticker); // 팔로우 등록
    public int delete(String nickname, String ticker); // 팔로우 삭제
    public int select(String nickname);

}

