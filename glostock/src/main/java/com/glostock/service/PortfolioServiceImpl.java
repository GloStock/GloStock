package com.glostock.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glostock.mapper.PortfolioMapper;
import com.glostock.model.PortfolioVO;
@Service
public class PortfolioServiceImpl implements PortfolioService {
	
	@Autowired
	private PortfolioMapper mapper;
	
	@Override
	public ArrayList<PortfolioVO> getList(String pfname) {
		ArrayList<PortfolioVO> list = mapper.select(pfname);
		
		return list;
	}

	@Override
	public void delete(String pfname) {
		mapper.delete(pfname);

	}
	
	@Override
	public void insertPort(PortfolioVO vo) {
		mapper.insert(vo);
	}
	
	@Override
	public ArrayList<PortfolioVO> getList_nick(String nickname) {
		ArrayList<PortfolioVO> list = mapper.select_nick(nickname);
		return list;
	}
}
