import java.util.Scanner;

public class Main_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        for (int j = 0;j <= n; j++){
            if (j%2 == 1) i+=j;
        }
        System.out.println(i);
    }
}
