import java.util.*;
class Main {
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        if(a<0){
            System.out.println("Freezing weather");
        }
        else if((a>=0)&&(a<10)){
            System.out.println("Very Cold weather");
        }
        else if((a>=10)&&(a<20)){
            System.out.println("Cold weather");
        }
        else if((a>=20)&&(a<30)){
            System.out.println("Normal");
        }
        else if((a>=30)&&(a<40)){
            System.out.println("Hot");
        }
        else{
            System.out.println("Very Hot");
        }
    
    }
}
