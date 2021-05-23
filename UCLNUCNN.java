import java.util.Scanner;

public class UCLNUCNN {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("So Thu Nhat: ");
        a = sc.nextInt();
        System.out.print("So Thu Hai: ");
        b = sc.nextInt();
        System.out.print("Uoc cua "+a+" la: ");
        for(int i=1;i<=a;i++){
            if(a%i==0)
                System.out.print(i+" ");
        }
        System.out.println();

        System.out.print("Uoc cua "+b+" la: ");
        for(int i=1;i<=b;i++){
            if(b%i==0)
                System.out.print(i+" ");
        }
        System.out.println();

        System.out.print("BCNN cua hai so la: ");
        int i = a * b;
        while (i > -1) {
            if (i % a == 0 && i % b == 0) System.out.print(i / 10);
            i -= a;
        }
        System.out.println();

        while (true) {
            if (a * b == 0) break;
            if (a > b) a %= b;
            else b %= a;
        }
        System.out.print("UCLL cua hai so la: "+(a+b));
        System.out.println();
    }
}
