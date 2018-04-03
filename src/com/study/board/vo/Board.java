package com.study.board.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Board implements Serializable {

	private static final long seriaVersionID = 1L;

	private int bo_no;
	private String bo_title;
	private String bo_writer;
	private String bo_passwd;
	private String bo_email;
	private String bo_content;
	private String bo_ip;
	private int bo_read_cnt;
	private String bo_reg_date;
	private String bo_mod_date;

	public Board() {
	}

	public Board(int bo_no, String bo_title, String bo_writer, String bo_passwd, String bo_email, String bo_content,
			String bo_ip, int bo_read_cnt, String bo_reg_date, String bo_mod_date) {
		super();

		this.bo_no = bo_no;
		this.bo_title = bo_title;
		this.bo_writer = bo_writer;
		this.bo_passwd = bo_passwd;
		this.bo_email = bo_email;
		this.bo_content = bo_content;
		this.bo_ip = bo_ip;
		this.bo_read_cnt = bo_read_cnt;
		this.bo_reg_date = bo_reg_date;
		this.bo_mod_date = bo_mod_date;
	}

	public String getBo_title() {
		return bo_title;
	}

	public void setBo_title(String bo_title) {
		this.bo_title = bo_title;
	}

	public String getBo_writer() {
		return bo_writer;
	}

	public void setBo_writer(String bo_writer) {
		this.bo_writer = bo_writer;
	}

	public String getBo_passwd() {
		return bo_passwd;
	}

	public void setBo_passwd(String bo_passwd) {
		this.bo_passwd = bo_passwd;
	}

	public String getBo_email() {
		return bo_email;
	}

	public void setBo_email(String bo_email) {
		this.bo_email = bo_email;
	}

	public String getBo_content() {
		return bo_content;
	}

	public void setBo_content(String bo_content) {
		this.bo_content = bo_content;
	}

	public String getBo_ip() {
		return bo_ip;
	}

	public void setBo_ip(String bo_ip) {
		this.bo_ip = bo_ip;
	}

	public int getBo_read_cnt() {
		return bo_read_cnt;
	}

	public void setBo_read_cnt(int bo_read_cnt) {
		this.bo_read_cnt = bo_read_cnt;
	}

	public String getBo_reg_date() {
		return bo_reg_date;
	}

	public void setBo_reg_date(String bo_reg_date) {
		this.bo_reg_date = bo_reg_date;
	}

	public String getBo_mod_date() {
		return bo_mod_date;
	}

	public void setBo_mod_date(String bo_mod_date) {
		this.bo_mod_date = bo_mod_date;
	}

	public static long getSeriaversionid() {
		return seriaVersionID;
	}

	public int getBo_no() {
		return bo_no;
	}

	public void setBo_no(int bo_no) {
		this.bo_no = bo_no;
	}
}