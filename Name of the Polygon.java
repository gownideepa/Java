import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<3){
            System.out.println("Not Polygon");
        }
        else if(a==3){
            System.out.println("Triangle");
        }
        else if(a==4){
            System.out.println("Quadrilateral");
        }
        else if(a==5){
            System.out.println("Pentagon");
        }
        else{
            System.out.println("Big Polygon");
        }
        
    }
}
