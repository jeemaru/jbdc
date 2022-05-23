package com.javaex.ex02;

public class BookVo {

	//필드
	private int book_id;
	private String title;
	private String pubs;
	private String pubs_date;
	private String author_id;
	
	//생성자
	public BookVo() {
	}
	public BookVo(int book_id, String title, String pubs, String pubs_date, String authorId) {
		this.book_id = book_id;
		this.title = title;
		this.pubs = pubs;
		this.pubs_date = pubs_date;
		this.author_id = authorId;
	}
	
	//메소드 gs
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPubs() {
		return pubs;
	}
	public void setPubs(String pubs) {
		this.pubs = pubs;
	}
	public String getPubs_date() {
		return pubs_date;
	}
	public void setPubs_date(String pubs_date) {
		this.pubs_date = pubs_date;
	}
	public String getAuthorId() {
		return author_id;
	}
	public void setAuthorId(String authorId) {
		this.author_id = authorId;
	}
	
	//메소드
	@Override
	public String toString() {
		return "BookVo [book_id=" + book_id + ", title=" + title + ", pubs=" + pubs + ", pubs_date=" + pubs_date
				+ ", authorId=" + author_id + "]";
	}
	
	
	
}
