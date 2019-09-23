import java.util.Scanner;

public class poweroffour{
    public static void main(){
        Scanner scanner=new Scanner(System.in);
        int s=scanner.nextInt();
        isPowerOfFour(s);
    }
    static void isPowerOfFour(int n) 
    { 
        if(n == 0) 
        return 0; 
        while(n != 1) 
        {  
            if(n % 4 != 0) {
                System.out.println("Not a power of 4");
                break;
            }
            n = n / 4;               
        } 
        System.out.println("It is a power of 4"); 
    }  
}