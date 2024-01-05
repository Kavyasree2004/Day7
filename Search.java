import java.util.*;
class Search{
public static void main(String args[]){
int flag=0;int i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array: ");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter the elements: ");
for(i=0;i<n;i++){
a[i]=sc.nextInt();
}
System.out.println("Enter the element to be searched: ");
int x=sc.nextInt();
for(i=0;i<n;i++){
if(a[i]==x){
flag=1;
break;
}
}
if(flag==1){
System.out.println("Element found at position: "+(i+1));
}
else{
System.out.println("Element not found");
}
}
}