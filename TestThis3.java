// this : calling default constructor from parameterized

class A{
A(){
System.out.println("Hello from default constructor");
}
A(int x){
this();
System.out.println(x);
}
}
class TestThis3{
public static void main(String args[]){
A a=new A(10);
}
}