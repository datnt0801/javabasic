import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai mang A: ");
        int n = sc.nextInt();
        String[] a = new String[n];
        for(int i=0;i<n;i++){
            System.out.print("A["+i+"] = ");
            a[i] = sc.next();
        }
        System.out.print("Nhap do dai mang B: ");
        n = sc.nextInt();
        int[] b = new int[n];
        for(int i = 0;i<n;i++){
            System.out.println("B["+i+"] = ");
            b[i] = sc.nextInt();
        }
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<b.length;j++){
                System.out.print(" "+a[i]+""+b[j]);
            }
        }
    }
}
