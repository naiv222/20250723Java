package arraytest;

import java.util.Scanner;

public class ArrayTest {
	
	// Scanner, nextLine() 사용하여 점수 3개 입력받고 출력
	public static void main(String[] args) {
		int[] score;
		int count
		
		
		int sum = 0;
		double avg = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<score.length; i++) {
			System.out.printf("점수를 입력하세요:");
			score[i] = Integer.parseInt(scan.nextLine());
		}
		
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		
		avg = sum / (double) score.length;
		System.out.printf("총점: %d, 평균: %f\n", sum, avg);
		
		for (int i=0; i<3; i++) {
			System.out.printf("인덱스 %d -> %d\n", i, score[i]);
			
		}
	}
}
