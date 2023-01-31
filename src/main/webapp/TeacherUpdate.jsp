<%@page import="schoolmanagement.Teacher"%>
<%@page import="javax.persistence.EntityTransaction"%>
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
String id=request.getParameter("id");
int id1 =Integer.parseInt(id);
EntityManagerFactory emf = Persistence.createEntityManagerFactory("pranav");
EntityManager em = emf.createEntityManager();
EntityTransaction et = em.getTransaction();

Teacher t = em.find(Teacher.class, id1);
%>
<form action="updatet1" method="post">
ID:<input type="text" value="<%= t.getId()%>" name="id"><br>
Name:<input type="text" value="<%= t.getName()%>" name="name"><br>
Salary:<input type="text" value="<%= t.getSalary()%>" name ="salary"><br>
Subject:<input type="text" value="<%= t.getSubject()%>" name="subject"><br>
<input type="submit" name="submit">





</form>
</body>
</html>