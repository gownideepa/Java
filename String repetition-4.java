import java.util.*;
class Main {
    public static void main(String[] args) {
       
        
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int b=sc.nextInt();
        String res="";
        for(int i=0;i<b;i++){
            res+=s;
            if(i<b-1){
                res+=" ";
               
            }
        }
        System.out.println(res);
    }
}
