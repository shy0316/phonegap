package com.shy.dao;

public interface IDao {
	
	public  Object  getMusicPath();
	
	public Object getMusicPathByName(String name);
	
	public Object getMusicPathById(String mid);
	
	public  Object  getVideoPath();
	
	public  Object  getVideoByPath(String vid);

}
