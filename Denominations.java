import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int ab=a/100;
        int b=a%100;
        int c=b/50;
        int e=b%50;
        int s=e/10;
        int d=e%10;
        System.out.printf("100:%d",ab);
        System.out.println();
        System.out.printf("50:%d",c);
        System.out.println();
        System.out.printf("10:%d",s);
        System.out.println();
        System.out.printf("1:%d",d);
        
    }
}
