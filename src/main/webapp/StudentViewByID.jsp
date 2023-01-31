<%@page import="schoolmanagement.Student"%>
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
int id1 = Integer.parseInt(id);
EntityManagerFactory emf = Persistence.createEntityManagerFactory("pranav");
EntityManager em = emf.createEntityManager();
Student s=em.find(Student.class, id1);

%>

ID:<%= s.getId() %><br>
Name:<%= s.getName() %><br>
Fees:<%= s.getFees() %><br>
Stream:<%= s.getStream() %><br><br>

<a href="Menu.html">Menu</a>
</body>
</html>