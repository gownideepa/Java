import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        if(a>85){
            System.out.println("A");
        }
        else if((a>70)&&(a<=85)){
            System.out.println("B");
        }
        else if((a>=60)&&(a<=70)){
            System.out.println("C");
            
        }
        else{
            System.out.println("F");
        }
    }
}
