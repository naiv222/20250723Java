package arraytest;

import java.util.Scanner;

public class ArrayTest2 {
	public static void main(String[] args) {
		int score[]; // 배열 변수 선언
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력할 점수의 개수:");
		int count = Integer.parseInt(scan.nextLine());
		score = new int[count]; // 초기화
		
		for(int i=0; i<score.length; i++) {
			System.out.printf("점수를 입력하세요.");
			
			
		}
	}
}
