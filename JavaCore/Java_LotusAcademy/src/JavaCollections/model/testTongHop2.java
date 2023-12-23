package JavaCollections.model;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class testTongHop2 {

    static int soDong, soCot;
    static double[][] a;

    public static double avgSum(double a[]) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum / a.length;
    }

    // hàm sắp xếp theo trung bình cộng
    public static void sortedByAVG(double a[][]) {
        Arrays.sort(a, new Comparator<double[]>() {
            @Override
            public int compare(double[] a, double[] b) {
                double x = avgSum(a);
                double y = avgSum(b);
                if (x > y)
                    return -1;
                else if (x < y)
                    return 1;
                return 0;
            }
        });
    }

    // hàm nhập vào ma trận 2 chiều
    public static void NhapMaTrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so dong:");
        soDong = scanner.nextInt();
        System.out.println("Nhap vao so cot:");
        soCot = scanner.nextInt();

        a = new double[soDong][soCot];

        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print("a[" + i + "][" + j + "]: ");
                a[i][j] = scanner.nextDouble();
            }
        }
    }

    // hàm xuất ma trận
    public static void xuatMatrix() {
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        NhapMaTrix();
        sortedByAVG(a);
        xuatMatrix();
    }
}
