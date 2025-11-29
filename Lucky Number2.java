import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if((a%2==0)&&(a%3==0)&&(a%6==0)){
            System.out.println("Number is divisible by 6");
                }
        else{
            if(a%6==0){
                System.out.println("Number is divisible by 6");
            }
            else if(a%3==0){
                System.out.println("Number is divisible by 3");
            }
            else if(a%2==0){
                System.out.println("Number is divisible by 2");
            }
            else{
                System.out.println("Number is not divisible by 2, 3 or 6");
            }
           
           
        }
    }
}
