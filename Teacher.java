package com.briup.ch05homework;

public class Teacher {


private String name;
private long id;
private double sarlary;
private char gender;


public  Teacher()
{this.gender = '��';
}

public Teacher(String name,long id,double sarlary,char gender) {
this.name=name;
this.id=id;
this.gender=gender;
this.sarlary=sarlary;


}


public void setName (String name)
	{this.id = id;}
public String getName()
	{return this.name;}

public void setId(long id )
	{this.id = id;}
public long getId()
	{return this.id;}

public void setGender(char gender)
	{this.gender = gender;}
public char getGender()
	{return this.gender;}

public void setSarlary (double sarlar)
	{this.sarlary=sarlary;}
public double getSarlry()
	{return this.sarlary;}



public String toString() { 

return"teacher [name:"+this.name+
	            ",gender :"+this.gender+
	            ",id:"+this.id+",sarlar:"+this.sarlary+"]";


}


}


/**
package com.briup.ch06;

/**
	JavaBean��
	��ʦ��������������ʦ�����ģ�壬��ʦ���������������ʦ��Ϣ��
 */

 /**
public class Teacher {
	//1. ˽������
	private long id;
	private String name;
	private double salary;
	private char gender;	//�Ա�

	//4. ���캯��
	public Teacher(){
		this.gender = '��';
	}
	public Teacher(long id,String name,double salary,char gender){
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}

	//2. ������setter,getter����
	public void setId(long id){
		this.id = id;
	}
	public long getId(){
		return this.id;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setSalary(double salary){
		this.salary = salary;
	}
	public double getSalary(){
		return this.salary;
	}
	public void setGender(char gender){
		this.gender = gender;
	}
	public char getGender(){
		return this.gender;
	}
	/**
	  3. ��д�����е�toString����
	  ���ض�����ַ�������
	*/
	/**public String toString(){
		return "Teacher{id:"+this.id
					+",name:"+this.name
					+",gender:"+this.gender
					+",salary:"+this.salary+"}";
	}
}

*/



