import java.util.Scanner;

public class Member_class{
    public static void main(String[] args) {    
        Member a=new Member("Harry",30,25000);
        a.name="Sourav";
        System.out.println(a.name);
        System.out.println(a.age);
        System.out.println(a.salary);
    }    
}
class Member{
    String name;
    int age;
    long salary;
    Member(String a,int b,long c){
        this.name=a;
        this.age=b;
        this.salary=c;
    }
}



