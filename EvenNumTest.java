import java.util.Scanner;

class EvenNumTest{
    public static boolean isEven(int number){
        if(number%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int s=scanner.nextInt();
        isEven(s);
    }
}
