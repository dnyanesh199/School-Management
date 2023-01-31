<%@page import="schoolmanagement.Teacher"%>
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
<body>
<%
String id2 = request.getParameter("id");
int id1 = Integer.parseInt(id2);
EntityManagerFactory emf = Persistence.createEntityManagerFactory("pranav");
EntityManager em= emf.createEntityManager();
Teacher t = em.find(Teacher.class, id1);

%>
ID:<%= t.getId() %><br>
Name:<%= t.getName() %><br>
Salary:<%= t.getSalary() %><br>
Subject:<%=t.getSubject() %><br><br>

<a href="Menu.html">Menu</a>


</body>
</html>