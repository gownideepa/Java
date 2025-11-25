import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int reversed=(a%10)*10+(a/10);
        System.out.println(String.format("%02d" ,reversed));
    }
}
