package com.shy.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.orm.toplink.SessionFactory;


public class UserDaoImpl extends HibernateDaoSupport implements IDao {

	private static Logger log = Logger.getLogger(UserDaoImpl.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {

		this.sessionFactory = sessionFactory;

	}

	public Object getMusicPath() {
		// TODO Auto-generated method stub
		log.info("UserDaoImpl  is  getMusicPath  start... ");

		log.info("--->" + this.getHibernateTemplate());

		List list = this.getHibernateTemplate().find("from TMusic");
		log.info(list.size());
		// this.getHibernateTemplate().update(entity);
		// this.getHibernateTemplate().delete(entity);

		return list;
	}
	
	public Object getMusicPathByName(String name) {
		log.info("UserDaoImpl  is  getMusicPath  start... ");
		log.info("--->" + this.getHibernateTemplate());
		log.info("mname--->"+name);
		List list = this.getHibernateTemplate().find("from TMusic where mname=?",name);
		log.info(list.size());
		return list;
	}

	public Object getVideoPath() {
		// TODO Auto-generated method stub
		log.info("UserDaoImpl  is  getVideoPath  start... ");

		List list = this.getHibernateTemplate().find("from TVideoinfo");

		// this.getHibernateTemplate().update(entity);
		// this.getHibernateTemplate().delete(entity);

		return list;
	}

	@Override
	public Object getVideoByPath(String vid) {
		// TODO Auto-generated method stub
		log.info("UserDaoImpl  is  getVideoPath  start... ");

		List list = this.getHibernateTemplate().find("from TVideoinfo where id=?",vid);
		return list;
	}

	@Override
	public Object getMusicPathById(String mid) {
		log.info("UserDaoImpl  is  getMusicPath  start... ");
		log.info("--->" + this.getHibernateTemplate());
		log.info("mid--->"+mid);
		List list = this.getHibernateTemplate().find("from TMusic where id=?",mid);
		log.info(list.size());
		return list;
	}

}
