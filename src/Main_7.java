import java.util.Scanner;

public class Main_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        final int X = -1;
        final int Y = 0;
        final int Z = 1;
        int j = 0;
        int arr[] = new int[l];

        for (int i = 0;i<l;i++){
            arr[i] = sc.nextInt();
            if (arr[i] == X) j++;
            if (arr[i] == Y) j++;
            if (arr[i] == Z) j++;
        }

        if (j!=0) System.out.println("Данное значение имеется в константах");

    }
}
