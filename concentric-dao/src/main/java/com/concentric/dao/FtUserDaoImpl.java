package com.concentric.dao;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

import com.concentric.dao.model.FtUser;

@Repository
public class FtUserDaoImpl extends SqlMapClientDaoSupport implements FtUserDao {

	public FtUser getUserById(String userId) {
		return (FtUser) this.getSqlMapClientTemplate().queryForObject("selectUserById", userId);
		
	}

}
