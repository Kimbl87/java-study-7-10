import java.util.Scanner;

public class Main_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//Задаем размер матрицы
        System.out.println("Введите длину строки");
        int j = sc.nextInt()-1;
        System.out.println("Введите колличество строк");
        int i = sc.nextInt()-1;
        int matrix[][] = new int[i+1][j+1];
        matrix[i][j] = 5;

//Наполняем матрицу
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col]=sc.nextInt();
            }
        }

//Печать всей матрицы
//        for (int row = 0; row < matrix.length; row++) {
//            for (int col = 0; col < matrix[row].length; col++) {
//                System.out.printf("%4d", matrix[row][col]);
//            }
//            System.out.println();
//        }
//Печать первой строки умноженной на 3
        for (int col = 0; col < matrix[0].length; col++) {
            System.out.printf("%4d", matrix[0][col]*3);
        }
        System.out.println();
    }





    }


