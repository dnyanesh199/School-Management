<%@page import="schoolmanagement.Student"%>
<%@page import="schoolmanagement.Teacher"%>
<%@page import="java.util.List"%>
<%@page import="javax.persistence.Query"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body text="white" bgcolor="black">
    <table bgcolor="violet" border="5px"
    cellspacing="8px" cellpadding="8px" Align="center" bordercolor="blue">

<%EntityManagerFactory emf = Persistence.createEntityManagerFactory("pranav");
EntityManager em = emf.createEntityManager();
Query q = em.createQuery("select b from Student b");
List<Student>t=q.getResultList();


%>
<table cellpadding="20px" border="1">

<th> ID</th>
<th> Name</th>
<th> Fees</th>
<th> Stream</th>
<% for(Student rs:t){ %>
<tr align="center">
<td><%= rs.getId() %></td>
<td> <%= rs.getName() %></td>
<td><%= rs.getFees() %></td>
<td><%=rs.getStream() %></td>
</tr>
<%} %>

<caption>Student Details</caption>



</table>
<br>
<br>

<a href="Menu.html">Menu</a>
</body>
</html>