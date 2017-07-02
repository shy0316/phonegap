package com.shy.model;

/**
 * TMusic entity. @author MyEclipse Persistence Tools
 */

public class TMusic implements java.io.Serializable {

	// Fields

	private String id;
	private String mname;
	private String mpath;
	private String mpic;
	private String msinger;

	// Constructors

	/** default constructor */
	public TMusic() {
	}

	/** full constructor */
	

	// Property accessors

	public String getId() {
		return this.id;
	}

	public String getMpic() {
		return mpic;
	}

	public void setMpic(String mpic) {
		this.mpic = mpic;
	}

	public String getMsinger() {
		return msinger;
	}

	public void setMsinger(String msinger) {
		this.msinger = msinger;
	}

	public TMusic(String id, String mname, String mpath, String mpic, String msinger) {
		super();
		this.id = id;
		this.mname = mname;
		this.mpath = mpath;
		this.mpic = mpic;
		this.msinger = msinger;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMname() {
		return this.mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getMpath() {
		return this.mpath;
	}

	public void setMpath(String mpath) {
		this.mpath = mpath;
	}

}