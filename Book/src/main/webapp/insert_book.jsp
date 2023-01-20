
<%@ page import="java.sql.*"%>
<%@ page import="com.ex.*"%>
<%
Connection con=DatabaseConnection.getConnection();
String book_name=request.getParameter("book_name");
int price=Integer.parseInt(request.getParameter("book_price"));
String book_author=request.getParameter("book_author");
String publisher=request.getParameter("publisher");
String year=request.getParameter("year");
String sql="insert into book(book_name, book_price, book_author,publisher, year) values(?,?,?,?,?)";
PreparedStatement ps=con.prepareStatement(sql);
ps.setString(1,book_name);
ps.setInt(2,price);
ps.setString(3,book_author);
ps.setString(4,publisher);
ps.setString(5,year);
int x=ps.executeUpdate();
if(x!=0)
	response.sendRedirect("view_book.jsp?msg=Book Added");
%>
