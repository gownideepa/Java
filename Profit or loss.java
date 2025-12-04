import java.util.*;
class Main {
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        int cp=sc.nextInt();
        int sp=sc.nextInt();
        if(sp>cp){
            System.out.println("Profit");
        }
        else if(sp<cp){
            System.out.println("Loss");
        }
        else{
            System.out.println("No Profit - No Loss");
        }

    }
}
