package com.shy.model;

/**
 * TVideoinfo entity. @author MyEclipse Persistence Tools
 */

public class TVideoinfo implements java.io.Serializable {

	// Fields

	private String id;
	private String vname;
	private String vpath;

	// Constructors

	/** default constructor */
	public TVideoinfo() {
	}

	/** full constructor */
	public TVideoinfo(String vname, String vpath) {
		this.vname = vname;
		this.vpath = vpath;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVname() {
		return this.vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public String getVpath() {
		return this.vpath;
	}

	public void setVpath(String vpath) {
		this.vpath = vpath;
	}

}