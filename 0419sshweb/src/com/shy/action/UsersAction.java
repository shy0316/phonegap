package com.shy.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.alibaba.fastjson.JSONArray;
import com.shy.model.TVideoinfo;
import com.shy.service.IService;

import net.sf.json.JSONObject;



public class UsersAction {
	private static Logger log = Logger.getLogger(UsersAction.class);

	private IService service;
	//getMusicByName
	private String name;
	
	private String mid;
	
	
	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	private String type;

	private String vid;
	

	// set注入
	// public void setService(IService service) {
	// this.service = service;
	// }

	// 构造注入

	public String getVid() {
		return vid;
	}

	public void setVid(String vid) {
		this.vid = vid;
	}

	public UsersAction(IService service) {
		this.service = service;

	}

	public String getMuisc() {
		
		log.info("UsersAction  is   getMuisc  start...");

		List lists = (List) this.service.getMusicPath();

		JSONArray array = (JSONArray) JSONArray.toJSON(lists);

		// 取出来 是[{"mname":"速8","id":"1","mpath":"m2.mp3"}]
		log.info(array.toString());

		HttpServletResponse response = ServletActionContext.getResponse();
		
		response.setCharacterEncoding("UTF-8");

		PrintWriter pw = null;
		try {
			log.info(1);
			pw = response.getWriter();
			log.info(2);
			pw.println(array.toString());
			log.info(3);
			pw.flush();
			log.info(4);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (null != pw) {
				pw.close();
			}
		}

		return null;
	}
	
	
	public String getMuiscName(){
		log.info("UsersAction  is   getMuiscByName  start...");
		log.info(name+"----------------");
		List lists = (List) this.service.getMusicPathByName(name);

		JSONArray array = (JSONArray) JSONArray.toJSON(lists);

		// 取出来 是[{"mname":"速8","id":"1","mpath":"m2.mp3"}]
		log.info(array.toString());

		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("UTF-8");

		PrintWriter pw = null;
		try {
			pw = response.getWriter();
			pw.println(array.toString());
			pw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (null != pw) {
				pw.close();
			}
		}
		
		return null;
		
	}
	
	//根据id获取歌
	public String getMusicById(){
		log.info("UsersAction  is   getMusicById  start...");
		log.info(mid+"----------------");
		List lists = (List) this.service.getMusicPathById(mid);

		JSONArray array = (JSONArray) JSONArray.toJSON(lists);

		// 取出来 是[{"mname":"速8","id":"1","mpath":"m2.mp3"}]
		log.info(array.toString());

		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("UTF-8");

		PrintWriter pw = null;
		try {
			pw = response.getWriter();
			pw.println(array.toString());
			pw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (null != pw) {
				pw.close();
			}
		}
		
		return null;
		
	}
	
	public String getVideo() {
		log.info("UsersAction  is   getVideo  start...");
		log.info("-----------");
		List lists = (List) this.service.getVideoPath();
		log.info(lists);
		JSONObject obj = new JSONObject();

		TVideoinfo tinfo = (TVideoinfo) lists.get(0);
		
		log.info(tinfo.getVpath());
		
		obj.put("videopath", "http://172.20.10.13:8080/0419sshweb/res/"+tinfo.getVpath());

		log.info(obj.toString());

		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("UTF-8");

		PrintWriter pw = null;
		try {
			pw = response.getWriter();
			pw.println(obj.toString());
			pw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (null != pw) {
				pw.close();
			}
		}

		return null;
	}

	
	public String getVideoById() {
		log.info("UsersAction  is   getVideoById  start...");
		log.info("-----------");
		List lists = (List) this.service.getVideoById(vid);
		
		log.info(lists);
		JSONObject obj = new JSONObject();

		TVideoinfo tinfo = (TVideoinfo) lists.get(0);
		
		log.info(tinfo.getVpath());
		
		obj.put("videopath", "http://172.16.16.221:8080/0419sshweb/res/"+tinfo.getVpath());

		log.info(obj.toString());

		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("UTF-8");

		PrintWriter pw = null;
		try {
			pw = response.getWriter();
			pw.println(obj.toString());
			pw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (null != pw) {
				pw.close();
			}
		}

		return null;
	}

}
