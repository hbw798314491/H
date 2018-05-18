package com.qingmu.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.qingmu.hibernate.entities.StudentPojo;
import com.qingmu.hibernate.entities.result.ReportPojo;

public class JUnit{

	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;

	@Before
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

	@After
	public void destroy() {

		transaction.commit();

		session.close();

		sessionFactory.close();

	}

	@Test
	public void Demo() {
		StudentPojo student = new StudentPojo();

		ReportPojo report = new ReportPojo();

		student.setReport(report);
		report.setStudent(student);

		student.setStudentName("23");

		session.save(student);
		session.save(report);

	}

	@Test
	public void add() {
   for(int i=0;i<10;i++) {
		ReportPojo rpPojo = new ReportPojo();
		StudentPojo student = new StudentPojo();
 
	   
		rpPojo.setStudent(student);
		rpPojo.setReportChinese(62.2 +i);
		rpPojo.setReportGeneral(25.2 +i);
		rpPojo.setReportLanguages(24.0 + i);
		rpPojo.setReportMathematics(55.2 + i);

		student.setReport(rpPojo);
		student.setUser(206400564l+i);
		student.setStudentName("���»�"+i);
		student.setStudentPassword("a54d1221"+i);
		student.setStudentClass(1);
		student.setStudentDate(null);

		session.save(rpPojo);
		session.save(student);
		
		
}
	}

	@Test
	public void delect() {

		/* ɾ��Ҫ���Ⱥ�
		  * 1.Ҫ��ɾ����Ϊһ��һ��ϵ��report.
		  * 
		  * 2.һ��Ҫtryһ���ع�.
		  * 
		 */
		try {

			ReportPojo report = session.get(ReportPojo.class, 1);

			StudentPojo student = session.get(StudentPojo.class, 1);

			session.delete(report);
			session.delete(student);

		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback(); // ����ع�
		}

	}

	@Test
	public void select() {

		//��ѧ��
		
		Query query = session
				.createQuery("select s.User,s.studentName,r.reportChinese,r.reportMathematics from  StudentPojo s , ReportPojo r where s.oid = r.oid");
//		query.setParameter(0, 150.0); //�����С���㣬��Ȼ�ᱨ��
		List<Object> list = query.list();

		System.out.println("ѧ��"+","+"����"+","+"����"+","+"��ѧ");
		for(int i=0;i< list.size();i++) {
			
			Object[] obj = (Object[])list.get(i);
//			 size()ΪԪ�س��ȣ���ѯ����Ԫ�ء� ���ǿ� select ��������ֶ�.
			System.out.println(obj[0]+","+obj[1]+","+obj[2]+","+obj[3]);
			
			
		}
		
	}

	@Test
	public void select01() {
		
		String hql = "select s.oid ,r from StudentPojo s , ReportPojo r";
		List list = session.createQuery(hql).list();
		
//		for(Object l : list) {
//			
//			System.out.print(l+",");
//			
//		}
		
		for(int i=0;i< list.size();i++) {
			
			Object[] obj = (Object[])list.get(i);
//			 size()ΪԪ�س��ȣ���ѯ����Ԫ�ء� ���ǿ� select ��������ֶ�.
			System.out.println(obj[0]+","+obj[1]);
			
			
		}

		
	}
	
	

	@Test
	public void test1() {
		
		
		
		
	}
	
	@Test
	public void New() {

	}

}