import java.util.*;
class Main {
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        switch(a){
            case 3:
                System.out.println("Triangle");
                break;
            case 4:
                System.out.println("Quadrilateral");
                break;
            case 5:
                System.out.println("Pentagon");
                break;
            case 6:
                System.out.println("Hexagon");
                break;
            default:
                System.out.println("Polygon");
                break;
        }
        
    }
}
