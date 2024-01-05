class Arraysum{
public static void main(String args[]){
int[] num={2,-9,0,5,12,-25,22,9,8,12};
int sum=0;
Double average;
for(int a:num){
sum+=a;
}
int arrlen=num.length;
average=((double)sum/(double)arrlen);
System.out.println("Sum= "+sum);
System.out.println("Average= "+average);
}
}                                                          