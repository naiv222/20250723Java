package arraytest;

import java.util.Scanner;

public class ScoreTest {
	
	public static String method(int score) {
		String grade;
		
		switch(score/10) {
		case 10: case 9:
			grade = "A";
			break;
		
		case 8:
			grade = "B";
			break;
		
		case 7:
			grade = "C";
			break;
		
		default:
			grade = "F";
			break;
		}
		return grade;
	}
	
	public static void main(String[] args) {
		String names[];
		int score[];
		String grade[];
		int count; //학생 수
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생 수를 입력하세요:");
		count = Integer.parseInt(scan.nextLine());
		names = new String[count];
		score = new int[count];
		grade = new String[count];
		
		for (int i=0; i<count; i++) {
			System.out.printf("학생%d 이름:", i);
			names[i] = scan.nextLine();
			
			System.out.printf("학생%d 점수:", i);
			score[i] = Integer.parseInt(scan.nextLine());
			grade[i] = method(score[i]);
		}
		
		System.out.println("이름\t점수\t학점");
		for (int i=0; i<count; i++) {
			System.out.printf("%s\t%d\t%s\n", names[i], score[i], grade[i]);
		}
		
		
//		if(score[] < 0 || score > 100) {
//			System.out.println("잘못된 점수입니다.");
//		}
//		
//		else {
//			switch(score/10) {
//				case 10: case 9:
//					System.out.println("A");
//					break;
//				
//				case 8:
//					System.out.println("B");
//					break;
//				
//				case 7:
//					System.out.println("C");
//					break;
//				
//				default:
//					System.out.println("F");
//			}
//		}
	}
}
