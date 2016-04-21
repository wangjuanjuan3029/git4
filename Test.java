package com.briup.ch05homework;

public class Test{
    public static void main(String[] args){
  
	Teacher tea1= new Teacher();
    tea1.setId(2000L);
    tea1.setName("terry");
    tea1.setGender('ÄÐ');
    tea1.setSarlary(1000.0D);
	System.out.println(tea1);


	Teacher tea2= new Teacher("larry",1002L,2000,'Å®');
    System.out.println(tea2);
	
  
  }
}


/**
package com.briup.ch06;

public class Test {
	public static void main(String[] args){
		
		Teacher tea1 = new Teacher();
		tea1.setId(1001L);
		tea1.setName("terry");
		tea1.setSalary(20000.0D);
		System.out.println(tea1);

		Teacher tea2 = new Teacher(1002L,"larry",30000.0D,'ÄÐ');
		System.out.println(tea2);
	}
}

 */