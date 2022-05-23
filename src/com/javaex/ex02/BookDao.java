package com.javaex.ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDao {
	
	public int bookInsert(String title, String pubs, String pubs_date, int author_id) {
		int count = -1;
		
		// 0. import java.sql.*;
		Connection conn = null;
		PreparedStatement pstmt = null;
		//ResultSet rs = null;
		try {
		// 1. JDBC 드라이버 (Oracle) 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		// 2. Connection 얻어오기
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "webdb", "webdb");
			
		// 3. SQL문 준비 / 바인딩 / 실행
		//SQL문 준비
			String query ="";
			query += " insert into book ";
			query += " values(seq_book_id.nextval, ?, ?, ?, ?) ";
			System.out.println(query);
			
		//바인딩	
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, title);
			pstmt.setString(2, pubs);
			pstmt.setString(3, pubs_date);
			pstmt.setInt(4, author_id);
		
		//실행
			count = pstmt.executeUpdate();
			
		// 4.결과처리
			System.out.println(count +"건이 등록되었습니다");
			
		} catch (ClassNotFoundException e) {
		System.out.println("error: 드라이버 로딩 실패 - " + e);
		} catch (SQLException e) {
		System.out.println("error:" + e);
		} finally {
			
		// 5. 자원정리
		try {
			/*
			if (rs != null) {
			rs.close();
			} 
			*/
			if (pstmt != null) {
			pstmt.close();
			}
			if (conn != null) {
			conn.close();
			}
			} catch (SQLException e) {
			System.out.println("error:" + e);
			}
		}
		
		return count;
	}
	
	//작가 삭제 메소드
	public int bookDelete(int book_id) {
		
		int count = -1;
		
		// 0. import java.sql.*;
		Connection conn = null;
		PreparedStatement pstmt = null;
		//ResultSet rs = null;
		try {
		// 1. JDBC 드라이버 (Oracle) 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		// 2. Connection 얻어오기
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "webdb", "webdb");
			
		// 3. SQL문 준비 / 바인딩 / 실행
		//SQL문 준비
			String query ="";
			query += " delete book ";
			query += " where book_id = ? ";
			System.out.println(query);
			
		//바인딩	
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, book_id);
		
		//실행
			count = pstmt.executeUpdate();
			
		// 4.결과처리
			System.out.println(count +"건 삭제 되었습니다");
			
		} catch (ClassNotFoundException e) {
		System.out.println("error: 드라이버 로딩 실패 - " + e);
		} catch (SQLException e) {
		System.out.println("error:" + e);
		} finally {
			
		// 5. 자원정리
		try {
			/*
			if (rs != null) {
			rs.close();
			} 
			*/
			if (pstmt != null) {
			pstmt.close();
			}
			if (conn != null) {
			conn.close();
			}
			} catch (SQLException e) {
			System.out.println("error:" + e);
			}
		}
		
		return count;
	}
		
	//작가 데이터 수정
	public int bookUpdate(String book_id, String title, String pubs, String pubs_date, String author_id) {
		
		int count = -1;
		
		// 0. import java.sql.*;
		Connection conn = null;
		PreparedStatement pstmt = null;
		//ResultSet rs = null;
		try {
		// 1. JDBC 드라이버 (Oracle) 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		// 2. Connection 얻어오기
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "webdb", "webdb");
			
		// 3. SQL문 준비 / 바인딩 / 실행
		//SQL문 준비
			String query ="";
			query += " update book ";
			query += " set book_id = ?, ";
			query += "	   title = ?, ";
			query += " 	   pubs = ?, ";
			query += " 	   pubs_data = ?, ";
			query += " 	   author_id = ? ";
			System.out.println(query);
			
		//바인딩	
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, book_id);
			pstmt.setString(2, title);
			pstmt.setString(3, pubs);
			pstmt.setString(4, pubs_date);
			pstmt.setString(5, author_id);
		//실행
			count = pstmt.executeUpdate();
			
		// 4.결과처리
			System.out.println(count +"건 수정 되었습니다");
			
		} catch (ClassNotFoundException e) {
		System.out.println("error: 드라이버 로딩 실패 - " + e);
		} catch (SQLException e) {
		System.out.println("error:" + e);
		} finally {
			
		// 5. 자원정리
		try {
			/*
			if (rs != null) {
			rs.close();
			} 
			*/
			if (pstmt != null) {
			pstmt.close();
			}
			if (conn != null) {
			conn.close();
			}
			} catch (SQLException e) {
			System.out.println("error:" + e);
			}
		}
		
		return count;
	}
	
	// select
	   public List<BookVo> bookSelect() {
	      
	      //리스트

	      List<BookVo> bookList = new ArrayList<BookVo>();
	      
	      // 0. import java.sql.*;
	      Connection conn = null;
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      try {
	         // 1. JDBC 드라이버(Oracle) 로딩
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         // 2. Connection 얻어오기
	         String url = "jdbc:oracle:thin:@localhost:1521:xe";
	         conn = DriverManager.getConnection(url, "webdb", "webdb");
	         // 3. SQL문준비/ 바인딩/ 실행

	         // SQL 문 준비
	         String query = "";
	         query += " select  book_id, ";
	         query += "         title,";
	         query += "         pubs, ";
	         query += "         pubs_date, ";
	         query += "         author_id ";
	         query += " from book ";

	         // 바인딩
	         pstmt = conn.prepareStatement(query);

	         // 실행***
	         // ResultSet 가져오기
	         rs = pstmt.executeQuery();

	         // 4.결과처리
	         // 리스트로 만들기

	         // 반복문으로 Vo 만들기 list에 추가하기
	         while (rs.next()) {
	            int book_id = rs.getInt("book_id");
	            String title = rs.getString("title");
	            String pubs = rs.getString("pubs");
	            String pubs_date = rs.getString("pubs_date");
	            String author_id = rs.getString("author_id");

	            BookVo bookVo = new BookVo(book_id, title, pubs, pubs_date, author_id);

	            bookList.add(bookVo);
	         }
	         
	         //리스트를 출력해보기
	         //System.out.println(authorList.toString());
	      } catch (ClassNotFoundException e) {
	         System.out.println("error: 드라이버로딩실패-" + e);
	      } catch (SQLException e) {
	         System.out.println("error:" + e);
	      } finally {
	         // 5. 자원정리

	         try {

	            if (rs != null) {
	               rs.close();
	            }
	            if (pstmt != null) {
	               pstmt.close();
	            }
	            if (conn != null) {
	               conn.close();
	            }
	         } catch (SQLException e) {
	            System.out.println("error:" + e);
	         }
	      }
	      return bookList;
	   }

}
