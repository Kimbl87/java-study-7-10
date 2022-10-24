import java.util.Scanner;

public class Main_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int sum = 0;
        double arr[] = new double[l];
        double multiArr[] = new double[l];
//        1. Пользователь вводит размер массива и данные с клавиатуры в массив типа double.
        for (int i = 0; i < l; i++) {
            arr[i] = sc.nextDouble();
        }
//        2. Посчитайте среднее арифметическое элементов массива.
        for (int j = 0; j < l; ) {
            sum += arr[j];
            j++;
        }
        sum = sum / l;
//        3. После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
        for (int k = 0; k < l; k++) {
            multiArr[k] = arr[k] * sum;
            System.out.print(multiArr[k] + ", ");
        }


    }
}

