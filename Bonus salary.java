import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(b<5){
            System.out.println("No bonus");
        }
        else{
            float c=5/100f*a;
            System.out.printf("%.1f", c);
        }
    }
}