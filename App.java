import java.awt.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double c;
        double a;
        double b;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("a = ");
            a = scanner.nextDouble();
            System.out.println("b = ");
            b = scanner.nextDouble();
            System.out.println("c = ");
            c = scanner.nextDouble();
        }
        if(a*c>0)
        {
            System.out.println("Phuong trinh vo nghiem!");
        }
        else if (a==0)
        {
            System.out.println("Phuong trinh la phuong trinh bac nhat");
            System.out.println("x = "+(-c/b));
        }
        else
        {
            float x1 = (float) (-b - Math.sqrt(b * b - 4 * a * c));
            float x2 = (float) (-b + Math.sqrt(b * b - 4 * a * c));
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
