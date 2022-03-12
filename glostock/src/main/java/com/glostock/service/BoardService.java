package com.glostock.service;

import java.util.ArrayList;

import com.glostock.model.BoardVO;
import com.glostock.model.UserVO;

public interface BoardService {

public BoardVO mypage(String email);//마이페이지닉네임가져오기
public void insertfeed(BoardVO vo); //피드삽입
public ArrayList<BoardVO> getfeed(); //피드가져오기
public ArrayList<BoardVO> myfeed(String nickname);//내 게시글가져오기
public void updatefeed(BoardVO vo);      //게시글 수정완료 버튼
public BoardVO feed(int postnum); //단일게시글가져오기
public void deletefeed(int postnum);      //게시글 삭제 버튼

}
