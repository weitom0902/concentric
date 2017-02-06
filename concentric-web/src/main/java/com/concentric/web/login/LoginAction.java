package com.concentric.web.login;

import java.sql.SQLException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.concentric.dao.FtUserDao;
import com.concentric.dao.model.FtUser;
import com.ibatis.sqlmap.client.SqlMapClient;

@Controller
public class LoginAction {
	private Log log =LogFactory.getLog(LoginAction.class);
	
//	@Autowired
	private SqlSession sqlSession;
	
	@Autowired
	private FtUserDao ftUserDao;
	
	@RequestMapping(path ="login",method=RequestMethod.GET)
	public String login(){
		log.info("准备登陆");
		String userName = null;
		if(sqlSession != null){
			userName=sqlSession.selectOne("selectUserById", "000000001");
		}else{
			FtUser user = ftUserDao.getUserById("000000001");
			log.info("用户："+user);
			userName=user.getUserName();
		}
		log.info("用户："+userName+"登陆");
		return "login";
	}
	
	
	@RequestMapping(path ="login",method=RequestMethod.POST)
	public String tologin(ModelMap model){
		log.info("登陆成功");
		model.addAttribute("result", "登陆成功");
		return "login";
	}
	@RequestMapping(path = "freemarker" )
	public String freemarker(ModelMap model){
		log.info("freemarker测试");
		 model.addAttribute("hello", "andy");
		return "fm_freemarker";
	}
	
}
