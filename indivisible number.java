import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            boolean divi=false;
            for(int j=2;j<=10;j++){
                if(i%j==0){
                    divi=true;
                    break;
                }
            }if(!divi){
                count++;
            }
        }System.out.println(count);
    }
}
