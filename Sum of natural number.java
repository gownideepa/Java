import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        long sum=0;
        for(int i=1;i<=a;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}