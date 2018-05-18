package com.qingmu.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.qingmu.hibernate.entities.StudentPojo;


@WebServlet("/Regedit")
public class Regedit extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private long requestUser ;
	private String requestPassword;
	private String requestName;
	private int requestClass;
	Configuration config;
	SessionFactory sessionFactory;
	Session session;
	Transaction transaction; 
	int temporary = 0;  //¿ØÖÆ±éÀúÊä³ö
	
	
    public Regedit() {
        super();
    }

    public void init() {
		
	      config=new Configuration().configure();
	      
	      sessionFactory=config.buildSessionFactory(); 
	      
	      session=sessionFactory.openSession();
	      
	      transaction=session.beginTransaction();
	      
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.sendRedirect("./regedit");
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String RequestUser = request.getParameter("user");
		requestUser = Long.parseLong(RequestUser);
		requestPassword = request.getParameter("password");
		
		String RequestClass = request.getParameter("class").toString();
		requestClass = Integer.parseInt(RequestClass);
		requestName= new String(request.getParameter("name").getBytes("iso-8859-1"),"utf-8");
		
		StudentPojo studentSave = new StudentPojo(requestUser,requestName, requestPassword, requestClass, new Date(new java.util.Date().getTime()));
		
		Query login = session.createQuery("from StudentPojo");
		List<StudentPojo> list = login.list();
		
		int n=0;
		for(StudentPojo studentPojo : list) {
			if(studentPojo.getUser() == requestUser) {
				temporary = 1;
				break;
			}
				temporary = 0;
			n++;
		}
		if(temporary == 1) {
			response.sendRedirect("./regedit?message=1");
		}
		else {
			session.save(studentSave);
			transaction.commit();
			response.sendRedirect("./?message=1");
		}
		
		
	}
	

}
