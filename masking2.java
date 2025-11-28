import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            if((i==0)||(i==1)||(i==s.length()-1)||(i==s.length()-2)){
                System.out.print(s.charAt(i));
            }
            else{
                System.out.print("*");
            }
        }
        // Write your code here
    }
}
