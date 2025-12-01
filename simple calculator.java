import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(ch=='+'){
            System.out.println(a+b);
        }
        else if(ch=='-'){
            System.out.println(a-b);
        }
        else if(ch=='*'){
            System.out.println(a*b);
        }
        else if(ch=='/'){
            System.out.println((double) a/b);
        }
        else{
            System.out.println(a%b);
        }
    }
}
