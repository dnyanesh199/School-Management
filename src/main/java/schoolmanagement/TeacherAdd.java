package schoolmanagement;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addteacher")
public class TeacherAdd extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doPost(req, resp);
	int id = Integer.parseInt(req.getParameter("id"));
	String name = req.getParameter("name");
	String subject=req.getParameter("subject");
	double salary=Double.parseDouble(req.getParameter("salary"));
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pranav");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	Teacher t = new Teacher();
	t.setId(id);
	t.setName(name);
	t.setSalary(salary);
	t.setSubject(subject);
	
	et.begin();
	em.persist(t);
	et.commit();
	
	PrintWriter pw = resp.getWriter();
	pw.println("<h3> Data stored sucessfully");
	
	RequestDispatcher rd =req.getRequestDispatcher("Menu.html");
	rd.forward(req, resp);
}
}
