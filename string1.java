import java.util.Scanner;

public class string1 {
//    static class cap{
//        char character;
//        int integer;
//
//    };
    public static void main(String[] args) {
        int[] a = new int[256];
        //cap[] a = new cap[256];
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap: ");
        String s = sc.nextLine();
        System.out.println(s);
        System.out.println(s.charAt(1));
       // for (int i = 0; i > 256; i++) a[i].integer = 0;
        for(int i = 0; i < s.length(); i++){
            a[s.charAt(i)]++;
           // a[s.charAt(i)].integer+=1;
        }
        //for(int i = 0; i<256;i++) System.out.println(a[i].character+" So lan xuat hien la: "+a[i].character);
        for(int i = 0; i < s.length(); i++){
            System.out.println(s.charAt(i)+" So lan xuat hien la: "+a[s.charAt(i)]);
        }

    }
}
