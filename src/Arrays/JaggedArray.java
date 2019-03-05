package Arrays;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=new int[3][];
		Scanner sn=new Scanner(System.in);
		
		System.out.println("Enter column value of array2 ");
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter arr["+i+"]:: ");
			arr[i]=new int[sn.nextInt()];
		}
		System.out.println("Enter elements of array:: ");
		for(int r=0;r<arr.length;r++) {
			for(int c=0;c<arr[r].length;c++)
				arr[r][c]=sn.nextInt();
		}
		System.out.println("The value of array :: ");
		for(int r=0;r<arr.length;r++) {
			for(int c=0;c<arr[r].length;c++)
				System.out.print(arr[r][c]+"\t");
			System.out.println();
		}
	}

}
