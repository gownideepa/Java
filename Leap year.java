import java.util.*;
class Main {
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        if(((y%4==0)||(y%400==0))&&(y%100!=0)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        // Write your code here
    }
}