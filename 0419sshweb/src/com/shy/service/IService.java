package com.shy.service;

public interface IService {
	
	public  Object  getMusicPath();
	
	public  Object  getVideoPath();
	
	public Object getMusicPathByName(String name);
	public Object getMusicPathById(String mid);
	
	public  Object  getVideoById(String vid);
}
