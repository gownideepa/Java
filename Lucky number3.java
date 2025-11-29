import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int d1=a/10;
        int d2=a%10;
        if((d1==9)||(d2==9)||(a%9==0)){
            System.out.println("Lucky Number");
        }
        else{
            System.out.println("Unlucky Number");
        }
    }
}