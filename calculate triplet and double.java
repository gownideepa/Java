import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%3==0){
            System.out.println(a*3);
        }
        else{
            System.out.println(a*2);
        }
    }
}
