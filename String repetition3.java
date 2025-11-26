import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int a=sc.nextInt();
        String b=s.substring(s.length()-3);
        //for(int i=s.length()-1; cnt<=3;i--){
          //  b+=s.charAt(i);
        //}
        System.out.println(b.repeat(a));
    }
}
