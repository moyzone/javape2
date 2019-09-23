import java.util.Scanner;

public class palindrome{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        long s=scanner.nextLong();
        palindrome(s);

    }
    static void palindrome(long n){
        long r,sum=0,temp,i=0;    
        temp=n;    

        while(n>0){    
            r=n%10; 
            sum=(sum*10)+r;    
            n=n/10;  
            i++;
        }
        if(temp==sum){            
            long rev = 0; 
            while (temp != 0) { 
                rev = (rev * 10) + (temp % 10); 
                temp /= 10; 
            }         
            System.out.println("It is a palindrome and the reverse is "+rev);
        }

        else{
            long rev = 0; 
            while (temp != 0) { 
                rev = (rev * 10) + (temp % 10); 
                temp /= 10; 
            }         
            System.out.println("It's not palindrome and reverse is "+rev);  

        }
    }       
       
    } 
    

