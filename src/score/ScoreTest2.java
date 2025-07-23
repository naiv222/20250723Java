package score;

import java.util.Scanner;

public class ScoreTest2 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("학생 수를 입력하세요: ");
        int count = Integer.parseInt(scan.nextLine());

        Student[] students = new Student[count];

        for (int i = 0; i < count; i++) {
            System.out.printf("학생%d 이름: ", i);
            String name = scan.nextLine();

            System.out.printf("학생%d 점수: ", i);
            int score = Integer.parseInt(scan.nextLine());

            students[i] = new Student(name, score);
        }

        System.out.println("\n이름\t점수\t학점");
        for (Student student : students) {
            System.out.printf("%s\t%d\t%s\n",
                    student.getName(),
                    student.getScore(),
                    student.getGrade());
        }

        scan.close();
    }
}
