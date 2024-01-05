//Java program to initialize the values from one obj to another obj


class Student3{
int id;
String name;
Student3(int i,String n){
id=i;
name=n;
}
Student3(Student3 s){
id=s.id;                                                 
name=s.name;
}
void display(){
System.out.println(id+" "+name);
}
public static void main(String args[]){
Student3 s1=new Student3(1,"Jerry");
Student3 s2=new Student3(s1);
s1.display();
s2.display();
}
}