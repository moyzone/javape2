import java.util.Scanner;

class grades{
    public static void main(String[] args){
        System.out.println("Enter number of students");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int grades[];
        grades=new int[a];
        int gradeinput=0;
        for(int i=0;i<a;i++){
            gradeinput=scanner.nextInt();
            grades[i]=gradeinput;
        }
        System.out.println(getAverage(grades));
        System.out.println(min(grades));
        System.out.println(max(grades));         
    }
    static int getAverage(int a[]){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }     
        return sum/a.length;       
    }
    //min
    static int min(int a[]){
        int min=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }                
        }
        return min;  
    }
    //max
    static int max(int a[]){
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]<max){
                max=a[i];
            }                
        }
        return max;  
    }
}