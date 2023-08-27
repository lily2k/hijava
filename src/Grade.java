import java.util.Scanner;
public class Grade {
	public int math, science, english;
	
	public Grade(int math, int science, int english) {
		this.math = math;
		this.science =science;
		this.english = english;
	}
	public void show() {
		System.out.println("수학점수: "+math+" , 과학점수: "+science+" , 영어점수:"+english);
	}
	public int average() {
		return((math+science+english)/3);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		int math = scanner.nextInt();
		int science =scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math, science, english);
		me.show();
		System.out.println("3과목 평균점수는 "+ me.average());
		scanner.close();

	}

}
