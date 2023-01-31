package schoolmanagement;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class Validation extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doPost(req, resp);
	
	
	String email= (req.getParameter("email"));
	String password = req.getParameter("password");
	
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("pranav");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Query q = em.createQuery("select b from Principal b where b.email=?1 and password=?2");
	q.setParameter(1, email);
	q.setParameter(2, password);
	List<Principal>prin=q.getResultList();
	
	if(prin.size()>0)
	{
		RequestDispatcher rd =req.getRequestDispatcher("Menu.html");
		rd.forward(req, resp);
	}
}

}
