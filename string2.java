import java.util.Scanner;

public class string2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(check(s)) System.out.println("true");
        else System.out.println("false");
    }
    public static boolean check(String s){
        for(int i = 0; i < s.length()/2;i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        return true;
    };
}
