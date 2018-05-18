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

	//  初始化
		Configuration config;
		SessionFactory sessionFactory;
		Session session;
		Transaction transaction;

	/*	
		
	      //1.加载hibernate.cfg.xml配置
	      config=new Configuration().configure();
	      //2.获取SessionFactory
	      sessionFactory=config.buildSessionFactory(); 
	      //3.获得一个session
	      session=sessionFactory.openSession();
	      //4.开始事务
	      transaction=session.beginTransaction();
	*/	
		
		

		
		/*
		 * 通过id查询返回对象
		 * 1。使用例子 sSelectid(X).getXXX();    X代表动态的值.
		 * 2.改进的地方就是 重复操作多，需要Spring 来Aop操作一下.
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



