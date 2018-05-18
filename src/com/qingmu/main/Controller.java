package com.qingmu.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.plaf.synth.SynthSpinnerUI;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

import com.qingmu.hibernate.entities.StudentPojo;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	SessionFactory sessionFactory = null;
	Session session = null;
	Transaction transaction = null;

	long studentUser;
	String studentPassword;
	int temporary = 0; // ���Ʊ������

	public Controller() {
		super();
	}

	public void init() {

		StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder().configure().build();
		Metadata metadata = new MetadataSources(standardRegistry).getMetadataBuilder()
				.applyImplicitNamingStrategy(ImplicitNamingStrategyJpaCompliantImpl.INSTANCE).build();
		sessionFactory = metadata.getSessionFactoryBuilder().build();
		// �Ự����
		session = sessionFactory.openSession();
		// ��������
		transaction = session.beginTransaction();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		// �˴�RequestUser��Ҫת�ͣ�StringתΪlong��.
		String RequestUser = request.getParameter("user");

		long requestUser = 0; // ��ֹlong��Ϊ�յ����쳣!

		String requestPassword = request.getParameter("password");

		if (RequestUser != null) {
			requestUser = Long.parseLong(RequestUser);
		}

		if (RequestUser == null && requestPassword == null) {
			out.println("<meta http-equiv=\"refresh\" content='3; url=/H '>");
			request.getRequestDispatcher("/views/manage/manage.jsp").forward(request, response);
		}

		/*
		 * HQL��ѯ��� ��ѯ��������Ϊ from StudentPojo 1.����StudentPojoΪPOJO������� 2.���ܻ���SQL����еķ���
		 * ��Ϊfrom Student
		 */

		session.flush(); // ˢ�»���
		Query login = session.createQuery("from StudentPojo");
		List<StudentPojo> list = login.list();

		for (StudentPojo student : list) {
			studentUser = student.getUser();
			studentPassword = student.getStudentPassword();
			temporary++;

			if (requestUser == studentUser && requestPassword.equals(studentPassword)) {
				temporary = -1;
				HttpSession session = request.getSession(true);
				session.setAttribute("Name", student.getStudentName());

				request.getRequestDispatcher("/views/manage/manage.jsp").forward(request, response);
				break;
			}
		}

		// �������
		if (temporary == -1) {
			// out.println("<h3 style=\"text-align:center;\">��½�ɹ���</h3>");
		} else {
			out.println("<meta http-equiv=\"refresh\" content='3; url=/H '>");
			out.println("<h3 style=\"text-align:center;\">�˺Ż�������������µ�½��</h3>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	public void destroy() {

		transaction.commit();
		session.close();
		sessionFactory.close();

	}

}
