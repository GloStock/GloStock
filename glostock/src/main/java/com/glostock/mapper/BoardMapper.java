package com.glostock.mapper;

import java.util.ArrayList;

import com.glostock.model.BoardVO;
import com.glostock.model.UserVO;

public interface BoardMapper {

	public BoardVO mypage(String email); //닉네임 가젹오기
	public void insertfeed(BoardVO vo); //게시물 등록
	public ArrayList<BoardVO> getfeed();//게시물 가져오기
	public ArrayList<BoardVO> myfeed(String nickname);//내 게시글가져오기
	public boolean updatefeed(BoardVO vo); //게시물 수정 완료버튼 클릭시
	public BoardVO feed(int postnum);//게시물 1개 가져오기
	public void deletefeed(int postnum); //게시물 삭제
}
