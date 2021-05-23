import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap do dai mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++){
            System.out.print("A["+i+"] = ");
            a[i]= sc.nextInt();
        }
        System.out.println("Nhap do dai mang: ");
        n = sc.nextInt();
        int[] b = new int[n];
        for(int i = 0; i<n;i++){
            System.out.print("B["+i+"] = ");
            b[i]= sc.nextInt();
        }
        int[] c = new  int[a.length+b.length];
        int i = 0;
        for( ;i<a.length;i++) c[i]=a[i];
        for( ;i<a.length+b.length;i++) c[i]=b[i-a.length];
        sort(c);
        for(int j = 0; j < a.length+b.length;j++) System.out.print(" "+c[j]);
    }
    public static void sort(int[] b) {
        for (int i = 0; i < b.length - 1; i++) {
            for (int j = 0; j < b.length - i - 1; j++) {
                if (b[j] > b[j + 1]) {
                    b[j] += b[j + 1];
                    b[j + 1] = b[j] - b[j + 1];
                    b[j] -= b[j + 1];
                }
            }
        }
    }
}
