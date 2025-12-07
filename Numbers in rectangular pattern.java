import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int p=1;
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
                System.out.print(p+" ");
                p++;
            }
            System.out.println();
        }
    }
}