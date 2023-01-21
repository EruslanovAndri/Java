package Java.Lesson_1_Kamensky;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        String s = "kskak";
        System.out.println(s);

        float a = 4;
        float b = 3;
        System.out.println(a/b);
        
        a = 123;
        a = a-- - --a;
        System.out.println(a);

        boolean f = 123 != 124;
        System.out.println(f);


        int [][] arr = new int [3][5];

        for (int i = 0; i < arr.length; i++)
        for (int j = 0; j < arr[i].length; j++)
            System.out.printf("%d",arr[i][j]);


        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("\nname: ");
        // String name = iScanner.nextLine();
        // System.out.printf("Hello, %s!\n", name);
        // iScanner.close();


        Scanner iScanner = new Scanner(System.in);
        System.out.printf("\n int a: ");
        int x = iScanner.nextInt();
        System.out.printf("int b: ");
        int y = iScanner.nextInt();
        System.out.println(x+y);
        iScanner.close();

    }
}

/*
 * МНОГОСТРОЧНЫЙ КОММЕНТАРИЙ
 */

//  СТАНДАРТНЫЙ КОММЕНТРАРИЙ


// ТИПЫ ДАННЫХ 

