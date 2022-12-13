import java.util.Scanner;

public class input {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        String name=sc.nextLine();
        System.out.println("enter your age:");
        int age= sc.nextInt();
        System.out.println("enter your marks:");
        int marks= sc.nextInt();
        System.out.println("your name is "+name+",your age is "+age);
        if (age>0 && age<=18)
            System.out.println(name+" is not a adult");
        else if (age>18)
            System.out.println(name+" is a adult");
        if (age>18 && marks>90)
            System.out.println(name+" is a tompr adult");
        else if (age>18 || marks>90) {
            System.out.println(name+" is a tompr or a adult");
        }


    }
}
