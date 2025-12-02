//java  programme  to check whether a given number is  between 25 and 75
import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if((a>25)&&(a<75)){
            System.out.println("True");
           
        }
        else{
            System.out.println("False");
        }
    }
}
