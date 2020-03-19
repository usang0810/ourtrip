package com.kh.ourtrip.admin.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class AdminDAO {

	@Autowired
	public SqlSessionTemplate sqlSession;
	
	/** 방문자 정보 조회용 DAO
	 * @return vList
	 * @throws Exception
	 */
	public List<String> getVisitLog() throws Exception{
		return sqlSession.selectList("adminMapper.getVisitLog");
	}

}
