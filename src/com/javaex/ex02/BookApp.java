package com.javaex.ex02;

public class BookApp {

	public static void main(String[] args) {
		
		BookDao bookDao = new BookDao();
		
		bookDao.bookInsert("우리들의 일그러진 영웅", "다림", "1998-02-22", 1);
		bookDao.bookInsert("삼국지", "민음사", "2002-03-01", 2);
		bookDao.bookInsert("토지", "마로니에북스", "2012-08-15", 3);
		bookDao.bookInsert("유시민의 글쓰기 특강", "생각의길", "2015-04-01", 4);
		bookDao.bookInsert("패션왕", "중앙북스(books)", "2012-02-22", 5);
		bookDao.bookInsert("순정만화", "재미주의", "2011-08-03", 6);
		bookDao.bookInsert("오직두사람", "문학동네", "2017-05-04", 5);
		
		AuthorDao authorDao = new AuthorDao();
		
		
		authorDao.authorInsert("이문열", "경북영양");
		authorDao.authorInsert("박경리", "경상남도 통영");
		authorDao.authorInsert("유시민", "17대 국회의원");
		authorDao.authorInsert("기안84", "기안동에서 산 84년생");
		authorDao.authorInsert("강풀", "온라인 만화가 1세대");
		authorDao.authorInsert("김영하", "안쓸신잡");
		
		
		
	}

}
