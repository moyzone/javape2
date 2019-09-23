import java.util.Scanner;

public class poweroffour{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int s=scanner.nextInt();
        isPowerOfFour(s);
    }
    static void isPowerOfFour(int n) 
    { 
        if(n == 0) {
            System.out.println("Not a power of 4");
        }
        else{
            while(n != 1) 
            {  
                if(n % 4 != 0) {
                    System.out.println("Not a power of 4");
                    break;
                }
                n = n / 4;               
            } 
            if(n==1)
                System.out.println("It is a power of 4");     
        }
    }  
}