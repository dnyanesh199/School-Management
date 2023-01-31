<%@page import="schoolmanagement.Student"%>
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
String id = request.getParameter("id");
int id1 =Integer.parseInt(id);
EntityManagerFactory emf =Persistence.createEntityManagerFactory("pranav");
EntityManager em = emf.createEntityManager();
EntityTransaction et = em.getTransaction();
Student s = em.find(Student.class, id1);



%>

<form action="studentupdate" method="post">
id:
<input type="text" value="<%=s.getId() %>" name="id"><br>
name:
<input type="text" value="<%=s.getName()%>" name="name"><br>
fees:
<input type="text" value="<%=s.getFees()%>" name="fees"><br>
stream:
<input type="text" value="<%=s.getStream() %>" name="stream"><br>
<input type="submit" name="submit">







</form>
</body>
</html>