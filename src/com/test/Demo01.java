package com.test;

import java.lang.reflect.Constructor;
import java.lang.Class;
import com.test.Student;

public class Demo01 {

	
	private static final Class String = null;
	private static final Class Object = null;

	public static void main(String args[])  throws Exception{
		
	//	Demo01 de = new Demo01();
		
	// Class<?> cl =  de.getClass();
		
	/*	Class l = ClassPath.class;		
		
		try {
			
			l = Class.forName("com.test.ClassPath");
			
		}catch(ClassNotFoundException e) {
			
			e.printStackTrace();
			
		}
		
		int modifiers = l.getModifiers();
		
		Object c = l.getMethods();
		
		
		
		System.out.println(c);
	*/
		
	/*	
		Class cl = Class.forName("com.test.Student");
		
		Constructor con = cl.getConstructor(null); 
		
		
		Object obj = cl.newInstance();
		
		con = cl.getDeclaredConstructor(char.class);
		
	
		
		con.setAccessible(true);
				
		obj = con.newInstance(23);
	*/
		
        //1.����Class����  
        Class clazz = Class.forName("com.test.Student");  
          
          
        //2.��ȡ���й��й��췽��  
        System.out.println("**********************���й��й��췽��*********************************");  
        Constructor[] conArray = clazz.getConstructors();  
        for(Constructor c : conArray){  
            System.out.println(c);  
        }  
          
          
        System.out.println("************���еĹ��췽��(������˽�С��ܱ�����Ĭ�ϡ�����)***************");  
        conArray = clazz.getDeclaredConstructors();  
        for(Constructor c : conArray){  
            System.out.println(c);  
        }  
          
        System.out.println("*****************��ȡ���С��޲εĹ��췽��*******************************");  
        Constructor con = clazz.getConstructor(null);  
        //1>����Ϊ���޲εĹ��췽������������һ��null,��дҲ���ԣ�������Ҫ����һ�����������ͣ��м�������  
        //2>�����ص�����������޲ι��캯���������  
      
        System.out.println("con = " + con);  
        //���ù��췽��  
        Object obj = con.newInstance();  
    //  System.out.println("obj = " + obj);  
    //  Student stu = (Student)obj;  
          
        System.out.println("******************��ȡ˽�й��췽����������*******************************");  
        con = clazz.getDeclaredConstructor(char.class);  
        System.out.println(con);  
        //���ù��췽��  
        con.setAccessible(true);//��������(���Ե��������η�)  
        obj = con.newInstance('��');  
    
	}  
		
}
		
		

	

