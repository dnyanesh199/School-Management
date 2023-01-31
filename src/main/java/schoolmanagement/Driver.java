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
@WebServlet("/servlet")
public class Driver extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doPost(req, resp);
	
	int id =Integer.parseInt(req.getParameter("id"));
	String name =req.getParameter("name");
	String email =req.getParameter("email");
	String password=req.getParameter("password");
	long mobno =Long.parseLong(req.getParameter("mobno"));
	
	
	
	EntityManagerFactory emf =Persistence.createEntityManagerFactory("pranav");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	Principal p = new Principal();
	p.setId(id);
	p.setName(name);
	p.setEmail(email);
	
	p.setPassword(password);

	p.setMobno(mobno);
	
	
	et.begin();
	em.persist(p);
	et.commit();
	RequestDispatcher rd = req.getRequestDispatcher("login.html");
	rd.forward(req, resp);
			
	
	
}
}
