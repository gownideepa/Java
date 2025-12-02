import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=a/500;
        int c=a%500;
        int d=c/50;
        int e=c%50;
        int f=e/10;
        int g=e%10
        int h=g/1;
        System.out.printf("500: %d ",b);
        System.out.printf("50: %d ",d);
        System.out.printf("10: %d ",f);
        System.out.printf("1: %d ",h);
    }
}
