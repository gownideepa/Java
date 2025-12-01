import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        double b=0.0;
        if(a<50){
            b=(a*2);
        }
        else if((a>=50)&&(a<150)){
             b=(50*2)+(a-50)*3;
        }
        else if((a>=150)&&(a<=250)){
             b=(50*2)+(100*3)+((a-150)*5);
        
        }
        else{
             b=((50*2)+(100*3)+(100*5)+((a-250)*8));
        }
        b=b+(b*0.2);
        System.out.println(b);
    }
}
