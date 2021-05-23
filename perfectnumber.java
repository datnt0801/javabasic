import java.util.Scanner;
public class perfectnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tong = 0;
        System.out.println("Nhap gioi han tim so hoan hao: ");
        int j = sc.nextInt();
        System.out.print("Cac so hoan hao la: ");
        while( j > 0 ){
            for ( int i = 1 ; i < j ; i ++ ) if (j % i == 0) tong += i;
            if (tong == j) System.out.print(j+" ");
            else tong = 0;
            j --;
        }
    }
}
