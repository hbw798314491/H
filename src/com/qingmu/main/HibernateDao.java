package com.qingmu.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.qingmu.hibernate.entities.data.InformationPojo;
import com.qingmu.hibernate.entities.result.ReportPojo;
import com.qingmu.hibernate.entities.student.StudentPojo;
 
public class HibernateDao{
	private static final ThreadLocal<Session> threadLocal=new ThreadLocal<Session>();

	//  ��ʼ��
		Configuration config;
		SessionFactory sessionFactory;
		Session session;
		Transaction transaction;

	/*	
		
	      //1.����hibernate.cfg.xml����
	      config=new Configuration().configure();
	      //2.��ȡSessionFactory
	      sessionFactory=config.buildSessionFactory(); 
	      //3.���һ��session
	      session=sessionFactory.openSession();
	      //4.��ʼ����
	      transaction=session.beginTransaction();
	*/	
		
		

		
		/*
		 * ͨ��id��ѯ���ض���
		 * 1��ʹ������ sSelectid(X).getXXX();    X����̬��ֵ.
		 * 2.�Ľ��ĵط����� �ظ������࣬��ҪSpring ��Aop����һ��.
		 */

	
	  public StudentPojo sSelectid(int sid) {
		  
			
	      config=new Configuration().configure();
	      sessionFactory=config.buildSessionFactory(); 
	      session=sessionFactory.openSession();
	      transaction=session.beginTransaction();
		  
			 StudentPojo student = session.get(StudentPojo.class, sid);
			return student;
		 
	  }
	  
	  public ReportPojo rSelectid(int rid) {
		  
	      config=new Configuration().configure();
	      sessionFactory=config.buildSessionFactory(); 
	      session=sessionFactory.openSession();
	      transaction=session.beginTransaction();
		  
	      ReportPojo report = session.get(ReportPojo.class, rid);
			return report;
		  
	  }

	  
	  public InformationPojo iSelectid(int iid) {
		  
	      config=new Configuration().configure();
	      sessionFactory=config.buildSessionFactory(); 
	      session=sessionFactory.openSession();
	      transaction=session.beginTransaction();
	      
	      InformationPojo information = session.get(InformationPojo.class, iid);
		  return information;
	  }
	  

	  
	
}



