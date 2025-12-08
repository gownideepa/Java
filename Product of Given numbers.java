import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long pro=1;
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            pro=pro*a;
        }
        System.out.println(pro);
    }
}