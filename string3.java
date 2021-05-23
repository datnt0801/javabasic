import java.util.Scanner;

public class string3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        check(s);
    }
    public static void check(String a){
        int tool = 0;
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i)==a.charAt(i+1)){
                System.out.println(a.charAt(i)+""+a.charAt(i+1));
                tool++;
            }
            i++;
        }
        if(tool==0) System.out.println(a);
    };
}
