import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if((a==1)||(a==11)||(a==12)){
            System.out.println("Winter");
        }
        else if((a==2)||(a==3)){
            System.out.println("Spring");
        }
        else if((a==4)||(a==5)||(a==6)){
            System.out.println("Summer");
        }
        else if((a==7)||(a==8)){
            System.out.println("Rainy");
        }
        else{
            System.out.println("Autumn");
        }
    }
}
