class Student{
int id;
String name;
Student(int i,String s){
id=i;
name=s;
}
void display(){
System.out.println(id+" "+name);
}
public static void main(String args[]){
Student s1=new Student(1,"Arya");
Student s2=new Student(2,"Arjun");
s1.display();
s2.display();
}
}