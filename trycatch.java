import java.util.Arrays;
import java.util.Scanner;

public class trycatch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] marks=new int[3];
        System.out.println("Enter your marks in phy,chem,maths : ");
        for(int i=0;i<3;i++){
            marks[i]=sc.nextInt();
        }
        System.out.println("enter 1 for phy,2 for maths,3 for chem:");
        int num2=sc.nextInt();
        try {
            System.out.println(marks[num2]);
        }catch (Exception exception){
            System.out.println("Enter correct input");
        }
        System.out.println("Thank You");

    }
}
