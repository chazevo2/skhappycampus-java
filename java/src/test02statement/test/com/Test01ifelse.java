package test02statement.test.com;

public class Test01ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("if~else");

		int x = 6;
		if (x > 4) {
			System.out.println("if4...");
		}
		if (x > 5) {
			System.out.println("if5...");
		}

		int y = 10;
		if (y > 10) {
			System.out.println("if10...");
		} else {// y < 10 || y == 10
			System.out.println("if no 10...");
		}

		int score = 77;
		String grade = "";
		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else {
			grade = "D";
		}
		System.out.println(grade);
		System.out.println(score >= 90?"A":score >= 80?"B":score >= 70?"C":"D");
		
		System.out.println("end");
	}

}
