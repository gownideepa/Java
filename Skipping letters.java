import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int b=sc.nextInt();
        for(int i=0;i<a.length();i++){
            if(i==b){
                continue;
            }
            else{
                System.out.print(a.charAt(i));
            }
        }
    }