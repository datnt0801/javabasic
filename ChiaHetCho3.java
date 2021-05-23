import java.util.Scanner;

public class ChiaHetCho3 {
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
        for(int i=0;i<mang.length;i++){
            System.out.print(mang[i]+" ");
        }
        System.out.println();
        System.out.print("Cac phan tu chia het cho 3 la: ");
        for(int i=0;i<mang.length;i++) {
            if (mang[i] % 3 == 0)
                System.out.print(" "+mang[i]);
        }
    }
}
