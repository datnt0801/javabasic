import java.util.Scanner;

public class TinhATinhB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tong: ");
        int tong = sc.nextInt();
        System.out.println("Nhap hieu: ");
        int hieu = sc.nextInt();
        System.out.println("So lon:" + solon(tong,hieu));
        System.out.println("So be:" + sobe(tong,hieu));
    }

    public static int solon(int A,int B){
        return (A+B)/2;
    }
    public static int sobe(int A,int B) {
        return (A-B)/2;
    }
 }

