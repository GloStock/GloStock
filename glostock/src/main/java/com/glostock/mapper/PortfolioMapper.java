package com.glostock.mapper;

import java.util.ArrayList;

import com.glostock.model.PortfolioVO;

public interface PortfolioMapper {
	public int insert(PortfolioVO vo);
	public ArrayList<PortfolioVO> select(String pfname);
	public void delete(String pfname);
}
