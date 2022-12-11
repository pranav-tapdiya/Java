import java.util.Arrays;

public class array {
    public static void main(String[] args){
        int age=30;
        int[] marks=new int[3];
        marks[0]=96;
        marks[1]=69;
        marks[2]=78;

        //length of array
        System.out.println(marks.length);

        //sorting an array is very easy in java

        Arrays.sort(marks);
        System.out.println(marks[0]);

        //2D array

        int[][] finalmarks={{94,98,96},{88,87,85}};
        System.out.println(finalmarks[1][1]);
    }
}
