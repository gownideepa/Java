import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int n=sc.nextInt();
        int t=n*(n+1)/2;
        int curr=p+t-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(curr+" ");
                curr--;
            }
            System.out.println();
        }
    }
}
