import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=a/100;
        int c=a%100;
        int d=c/50;
        int e=c%50;
        int f=e/20;
        int g=e%20;
        int h=g/10;
        
        System.out.printf("100 Notes: %d",b);
        System.out.println();
        System.out.printf("50 Notes: %d",d);
        System.out.println();
         System.out.printf("20 Notes: %d",f);
        System.out.println();
         System.out.printf("10 Notes: %d",h);
        System.out.println();
    }
}