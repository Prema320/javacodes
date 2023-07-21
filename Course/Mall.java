class Mall{
String name;
String ownerName;
int age;
double profit;
float noOfjobs;
double salary;
int noOffloor;

Mall(String name)
{
System.out.println("invoking string cost in mall"); 

}
Mall(String name,String ownerName)
{
this(name);
this.ownerName=ownerName;
System.out.println("invoking string,ownerName cost in mall"); 

}
Mall(String name,String ownerName,int age)
{
this(name,ownerName);
this.age=age;
System.out.println("invoking string,ownerName,age cost in mall"); 

}
Mall(String name,String ownerName,int age,double profit)
{
this(name,ownerName,age);
this.profit=profit;
System.out.println("invoking string,ownerName,age,profit cost in mall"); 

}
Mall(String name,String ownerName,int age,double profit,float noOfjobs)
{
this(name,ownerName,age,profit);
this.noOfjobs=noOfjobs;
System.out.println("invoking string,ownerName,age,profit,noOfjobs cost in mall"); 

}
Mall(String name,String ownerName,int age,double profit,float noOfjobs,double salary)
{
this(name,ownerName,age,profit,noOfjobs);
this.salary=salary;
System.out.println("invoking string,ownerName,age,profit,noOfjobs,salary cost in mall"); 

}
Mall(String name,String ownerName,int age,double profit,float noOfjobs,double salary,int noOffloor)
{
this(name,ownerName,age,profit,noOfjobs);
this.noOffloor=noOffloor;
System.out.println("invoking string,ownerName,age,profit,noOfjobs,salary cost in mall"); 

}








}