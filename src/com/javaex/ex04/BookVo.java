package com.javaex.ex04;

public class BookVo {

	//필드
	private int bookId;
	private String tiTle;
	private String puBs;
	private String pubsDate;
	private int authorId;
	
	
	public BookVo() {
		super();
	}
	public BookVo(String tiTle, String puBs, String pubsDate, int authorId) {
		super();
		this.tiTle = tiTle;
		this.puBs = puBs;
		this.pubsDate = pubsDate;
		this.authorId = authorId;
	}
	public BookVo(int bookId, String tiTle, String puBs, String pubsDate, int authorId) {
		super();
		this.bookId = bookId;
		this.tiTle = tiTle;
		this.puBs = puBs;
		this.pubsDate = pubsDate;
		this.authorId = authorId;
	}
	
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTiTle() {
		return tiTle;
	}
	public void setTiTle(String tiTle) {
		this.tiTle = tiTle;
	}
	public String getPuBs() {
		return puBs;
	}
	public void setPuBs(String puBs) {
		this.puBs = puBs;
	}
	public String getPubsDate() {
		return pubsDate;
	}
	public void setPubsDate(String pubsDate) {
		this.pubsDate = pubsDate;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	
	
	@Override
	public String toString() {
		return "BookVo [bookId=" + bookId + ", tiTle=" + tiTle + ", puBs=" + puBs + ", pubsDate=" + pubsDate
				+ ", authorId=" + authorId + "]";
	}
	
	
	
	

	
	
	
	
}
