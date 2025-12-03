import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if((a==6)||((a+b)==6)||(Math.abs(a-b)==6)||(b==6)){
            System.out.println("Lucky");
        }
        else{
            System.out.println("Not Lucky");
        }
    }
}
