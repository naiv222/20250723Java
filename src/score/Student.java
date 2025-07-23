package score;

public class Student {
	private String name;
	private int score;
	private String grade;
	
		public Student(String name, int score) {
			this.name = name;
			this.score = score;
			this.grade = calculateGrade();
		}
		
		private String calculateGrade() {
			if (score < 0 || score > 100) {
	            return "Invalid";
	        }

	        switch (score / 10) {
	            case 10: case 9:
	                return "A";
	            case 8:
	                return "B";
	            case 7:
	                return "C";
	            default:
	                return "F";
	        }
		}
		
		public String getName() {
			return name;
		}
		
		public int getScore() {
			return score;
		}
		
		public String getGrade() {
			return grade;
		}

}
