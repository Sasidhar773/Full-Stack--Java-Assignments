<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Application</title>
</head>
<body bgcolor="lime">
<br><br><br>
<h1 align="center">Welcome to My Book Application</h1>
<br><br><br>
<h2 align="center">
<a href="profile.jsp">Profile</a>
<a href="add_book.html">Add Book</a>
<a href="view_book.jsp">View Book</a>
<a href="index.html">Logout</a>
</h2>
<br><br><br>
<table border="2" width="400" height="200" cellpadding="30" align="center">
<tr>
<td>Book Id</td><td>Book Name</td><td>Book Price</td><td>Book Author</td><td>Publisher</td><td>Year</td><td>Update</td><td>Delete</td>
</tr>
<%@page import="java.sql.*" %>
<%@page import="com.ex.*" %>
<%
Connection con=DatabaseConnection.getConnection();
PreparedStatement ps=con.prepareStatement("select * from book");
ResultSet rs=ps.executeQuery();
while(rs.next()){
%>
<tr>
<td><%=rs.getInt(1) %></td><td><%=rs.getString(2) %></td><td><%=rs.getInt(3) %></td><td><%=rs.getString(4) %></td>
<td><%=rs.getString(5) %></td><td><%=rs.getString(6) %></td>
<td><a href="update.jsp?id=<%=rs.getInt(1)%>">Update</a></td>
<td><a href="delete.jsp?id=<%=rs.getInt(1)%>">Delete</a></td>
</tr>
<%} %>
</table>
</body>
</html>