import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int p=sc.nextInt();
        int c=sc.nextInt();
        if((m>=60)&&(p>=50)&&(c>=45)&&((m+p+c)>=180)||(((m+p)>=120)||((p+c)>=110))){
            System.out.println("True");
           
        }
        else{
            System.out.println("False");
        }
    }
}
