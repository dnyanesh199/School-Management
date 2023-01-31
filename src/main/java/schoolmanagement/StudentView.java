package schoolmanagement;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/viewstud")
public class StudentView extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doPost(req, resp);
	
	int id =Integer.parseInt(req.getParameter("id"));
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pranav");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Student s=em.find(Student.class, id);
	System.out.println("ID     -->"+s.getId());
	System.out.println("Name   -->"+s.getName());
	System.out.println("Stream -->"+s.getStream());
	System.out.println("Fees   -->"+s.getFees());
	
	PrintWriter pw = resp.getWriter();
	pw.println("<h1> Student Infomation");
	pw.println("<h3>NAME--->"+s.getName());
	pw.println("<h3>Stream--->"+s.getStream());
	pw.println("<h3>Fees--->"+s.getFees());
	pw.close();
	
}
}
