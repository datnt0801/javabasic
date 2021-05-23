import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Do dai mang: ");
        n = sc.nextInt();
        int mang[] = new int[n];
        for(int i=0;i<mang.length;i++) {
            System.out.println("Phan tu thu: "+(i+1));
            mang[i]=sc.nextInt();
        }
        System.out.print(mang[0]);
        for(int i=1;i<mang.length;i++){
            System.out.print(","+mang[i]);
        }
    }
}
