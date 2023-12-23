package MaHoaHill;

import java.util.Scanner;

public class Hill {
	
	//Ham tinh nghich dao modulo
	
	public static int modInverse(int a, int m) {
		a = a%m;
		for(int i = 1;i<m;i++) {
			if((a*i)%m == 1) {
				return i;
			}
		}
		return -1;
	}
	// Ham ma tran tao khoa dau vao
	public static int[][] getKeyMatrix(String key, int matrixSize){
		int[][] keyMatrix = new int[matrixSize][matrixSize];
		int keyIndex = 0;
		
		for(int i = 0;i<matrixSize;i++) {
			for(int j = 0;j<matrixSize;j++) {
				keyMatrix[i][j] = (Character.toUpperCase(key.charAt(keyIndex))-'A')%26;
				keyIndex = (keyIndex+1)%key.length();
			}
		}
		
		return keyMatrix;
	}
	// Ham ma hoa Hill
	public static String encryptHill(String message, int[][] keyMatrix , int matrixSize) {
		StringBuilder encryptMessage = new StringBuilder();
		
		 int[] messageVector = new int[matrixSize];

		    // Lặp qua các ký tự của thông điệp
		    for (int i = 0; i < message.length(); i++) {
		        if (Character.isLetter(message.charAt(i))) {
		            // Chuyển ký tự thành giá trị số từ 0 đến 25 (A->0, B->1, ..., Z->25)
		            messageVector[i % matrixSize] = (Character.toUpperCase(message.charAt(i)) - 'A') % 26;

		            if ((i + 1) % matrixSize == 0) {
		                // Khi đủ số ký tự để tạo thành một vector

		                // Tạo vector bản mã bằng cách nhân ma trận khóa với vector thông điệp
		                int[] encryptedVector = new int[matrixSize];
		                for (int j = 0; j < matrixSize; j++) {
		                    int encryptedChar = 0;
		                    for (int k = 0; k < matrixSize; k++) {
		                        encryptedChar += keyMatrix[j][k] * messageVector[k];
		                    }
		                    // Chuyển giá trị số thành ký tự từ 0 đến 25 (0->A, 1->B, ..., 25->Z)
		                    encryptedVector[j] = encryptedChar % 26;
		                }

		                // Thêm các ký tự đã mã hoá vào chuỗi kết quả
		                for (int encryptedChar : encryptedVector) {
		                	encryptMessage.append((char) (encryptedChar + 'A'));
		                }
		            }
		        } else {
		        	encryptMessage.append(message.charAt(i));
		        }
		    }
		
		return encryptMessage.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao chuoi can ma hoa:");
		String message = sc.nextLine();
		System.out.println("Nhap vao khoa:");
		String key = sc.nextLine().toUpperCase();
		System.out.println("Nhap vao kich thuoc ma tran:");
		int matrixSize = sc.nextInt();
		
		int[][] keyMatrix = getKeyMatrix(key, matrixSize);
		String encryptMessage = encryptHill(message, keyMatrix, matrixSize);
		System.out.println("Chuoi ma hoa la:"+encryptMessage);
		
		
	}

}
