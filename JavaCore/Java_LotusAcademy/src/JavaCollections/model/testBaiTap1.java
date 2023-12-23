package JavaCollections.model;

import java.util.Arrays;
import java.util.Scanner;

public class testBaiTap1 {
    static int[] a;

    public static void NhapMang() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu mang: ");
        int n = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
    }

    public static void InMang() {
        System.out.println("Mang vua nhap: " + Arrays.toString(a));
    }

    public static int[] HienThiPhanTuLe() {
        int[] b = new int[a.length];
        int leCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                b[leCount++] = a[i];
            }
        }
        return Arrays.copyOfRange(b, 0, leCount);
    }

    public static boolean IsPrime(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void TimSoNguyenTo() {
        System.out.println("Cac phan tu la so nguyen to: ");
        for (int i = 0; i < a.length; i++) {
            if (IsPrime(a[i])) {
                System.out.print(a[i] + "\t");
            }
        }
        System.out.println();
    }

    public static int TinhTichSoNguyenTo() {
        int tich = 1;
        for (int i = 0; i < a.length; i++) {
            if (IsPrime(a[i]) && i % 2 == 0) {
                tich *= a[i];
            }
        }
        return tich;
    }

    public static void main(String[] args) {
        NhapMang();
        InMang();
        int[] leArr = HienThiPhanTuLe();
        System.out.println("Cac phan tu le trong mang la: " + Arrays.toString(leArr));
        TimSoNguyenTo();
        int tichNguyenTo = TinhTichSoNguyenTo();
        System.out.println("Tich cac so nguyen to o vi tri chan la: " + tichNguyenTo);
    }
}
