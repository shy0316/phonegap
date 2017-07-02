package com.shy.service;

import org.apache.log4j.Logger;

import com.shy.dao.IDao;

public class UserServiceImpl implements IService {

	// 创建日志工具对象
	private static Logger log = Logger.getLogger(UserServiceImpl.class);

	private IDao dao;

	public void setDao(IDao dao) {
		this.dao = dao;
	}

	public Object getMusicPath() {
		// TODO Auto-generated method stub
		log.info("UserServiceImpl  is   getMusicPath  start...");
		return this.dao.getMusicPath();
	}

	public Object getVideoPath() {
		// TODO Auto-generated method stub
		return this.dao.getVideoPath();
	}
	public Object getMusicPathByName(String name){
		log.info("UserServiceImpl  is   getMusicPathByName  start...");
		return this.dao.getMusicPathByName(name);
	}

	@Override
	public Object getVideoById(String vid) {
		log.info("UserServiceImpl  is   getVideoById  start...");
		return this.dao.getVideoByPath(vid);
	}

	@Override
	public Object getMusicPathById(String mid) {
		// TODO Auto-generated method stub
		log.info("UserServiceImpl  is   getMusicPathById  start...");
		return this.dao.getMusicPathById(mid);
	}

}
