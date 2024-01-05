// this : calling parameterized constructor from default

class A{
A(){
this(5);
System.out.println("Hello a");
}
A(int x){
System.out.println(x);
}
}
class TestThis4{
public static void main(String args[]){
A a=new A();
}
}