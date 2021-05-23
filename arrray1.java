import java.util.Scanner;

public class arrray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 99;
        System.out.println("Nhap do dai mang: ");
        n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.println("N[" + i + "] = ");
            a[i] = sc.nextInt();
        }
        sort(a);
        for (int i = 0; i < a.length; i++) System.out.print(" " + a[i]);
        System.out.println("");
        System.out.println(find(a,5));
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

    public static int find(int[] b,int a){
        for(int i = 0; i < b.length;i++)
            if(b[i]==a) return i+1;
        return -1;
    }
}
