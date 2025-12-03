import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int p=sc.nextInt();
        int c=sc.nextInt();
        if((((m+p)>=100)||((p+c)>=100)||((m+c)>=100))&&((m+p+c)>=180)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        
    }
}
