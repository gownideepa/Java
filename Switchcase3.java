import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if((ch>='A' && ch<='Z')){
            switch(ch){
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println("Vowel");
                    break;
                default:
                    System.out.println("Consonant");
            }
        
            
        }else{
            System.out.println("Not an Alphabet");
        }
        
        
        
        // Write your code here
    }
}
