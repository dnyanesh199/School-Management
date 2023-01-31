package schoolmanagement;

import java.io.IOException;

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
@WebServlet("/studentadd")
public class StudentAdd extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doPost(req, resp);
	
	
	int id=Integer.parseInt(req.getParameter("id"));
	String name = req.getParameter("name");
	String stream =req.getParameter("stream");
	double fees = Double.parseDouble(req.getParameter("fees"));
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pranav");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Student s = new Student();
	s.setId(id);
	s.setName(name);
	s.setFees(fees);
	s.setStream(stream);
	et.begin();
	em.persist(s);
	et.commit();
	
	RequestDispatcher rd =req.getRequestDispatcher("Menu.html");
	rd.forward(req, resp);
}
}
