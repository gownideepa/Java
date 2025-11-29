import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
       /* int even=0,odd=0;
        for(int i=0;i<a.length();i++){
            int digit=a.charAt(i)-'0';
            if(i%2==0){
                odd+=digit;
            }
            else{
                even+=digit;
            }
        }
        int diff=Math.abs(odd-even);
        if((diff%11==0)||(diff%11==1)){
            System.out.println("Special Eleven");
        }
        else{
            System.out.println("Normal Number");
        }
        */
        if((a%11==0)||(a%11==1)){
            System.out.println("Special Eleven");
        }
        else{
            System.out.println("Normal Number");
        }
}
}
