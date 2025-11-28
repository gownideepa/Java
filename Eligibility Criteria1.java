import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int p=sc.nextInt();
        int c=sc.nextInt();
        if((m>=70)&&(p>=60)&&(c>=60)){
            System.out.println("True");
        }
        else if((m+p+c)>=180){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        // Write your code here
    }
}
