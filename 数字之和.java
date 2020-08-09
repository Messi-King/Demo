import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int n2 = (int)Math.pow(n,2);
        String s1 = String.valueOf(n);
        String s2 = String .valueOf(n2);
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < ch1.length ; i++) {
            sum1 += Integer.parseInt(String.valueOf(ch1[i]));
        }
        for (int i = 0; i < ch2.length ; i++) {
            sum2 += Integer.parseInt(String.valueOf(ch2[i]));
        }
        System.out.println(sum1+" "+sum2);
    }
}
