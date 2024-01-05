import java.util.*;
class Sort{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,i;
System.out.println("Enter the size of array: ");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter the elements: ");
for(i=0;i<n;i++){
a[i]=sc.nextInt();
}
for(i=0;i<a.length;i++){
for(int j=i+1;j<a.length;j++){
if(a[i]>a[j]){
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for(int x:a)
System.out.print(x+" ");
}
}