import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=a/2000;
        int c=a%2000;
        int d=c/500;
        int e=c%500;
        int f=e/200;
        int g=e%200;
        int h=g/50;
        int i=g%50;
        int j=i/20;
        int k=i%20;
        int l=k/5;
        int m=k%5;
        int n=m/2;
        int o=m%2;
        int p=o/1;
        System.out.printf("2000:%d ",b);
        System.out.printf("500:%d ",d);
        System.out.printf("200:%d ",f);
        System.out.printf("50:%d ",h);
        System.out.printf("20:%d ",j);
        System.out.printf("5:%d ",l);
        
        System.out.printf("2:%d ",n);
    
        System.out.printf("1:%d ",p);
    
    }
}