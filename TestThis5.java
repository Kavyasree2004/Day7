// this : calling constructor with diff no. of parameters

class StudentCon{
int rollno;
String name,course;
float fee;
StudentCon(int rollno,String name,String course){
this.rollno=rollno;
this.name=name;
this.course=course;
}
StudentCon(int rollno,String name,String course,float fee){
this(rollno,name,course);
this.fee=fee;
}
void display(){
System.out.println(rollno+" "+name+" "+course+" "+fee);
}
}
class TestThis5{
public static void main(String args[]){
StudentCon s1=new StudentCon(11,"Raha","Java");
StudentCon s2=new StudentCon(22,"Alia","Python",5000f);
s1.display();
s2.display();
}
}






