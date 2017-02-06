package com.concentric.dao;

import com.concentric.dao.model.FtUser;

public interface FtUserDao {
	/**
	 * 根据Id 查询会员
	 * @param userId
	 * @return
	 */
	public FtUser getUserById(String userId);
	
}
