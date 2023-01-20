<%@page import="java.sql.*" %>
<%@page import="com.ex.*" %>
<%
Connection con=DatabaseConnection.getConnection();
int id=Integer.parseInt(request.getParameter("id"));
PreparedStatement ps=con.prepareStatement("delete from book where bkid=?");
ps.setInt(1,id);
int x=ps.executeUpdate();
if(x!=0)
	response.sendRedirect("view_book.jsp?msg=book deleted");
%>