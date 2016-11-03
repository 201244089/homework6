package homework6;

import java.util.Scanner;

public class StudentScore {
	private int korsum;
	private int engsum;
	private int mathsum;
	private double koravg;
	private double engavg;
	private double mathavg;
	private int stu_sum;
	private double stu_avg;
	private double score[][] = new double[5][3];
	private Scanner input = new Scanner(System.in);
	
	public StudentScore(){
		this.stu_sum = 0;
		this.stu_avg = 0.0;
	}
	
	public void scoreInput(){
		for(int i=0;i<5;i++){
			System.out.print(i+"번째 학생 국어, 영어, 수학");
			for(int j=0;j<3;j++){
				score[i][j] = input.nextDouble();
	}}}
	
	public void scoreSumAvg(){
		for(int i=0;i<3;i++){
			for(int j=0;j<5;j++){
				if(i==0){
					korsum+=score[i][j];
				}
				if(i==1){
					engsum+=score[i][j];
				}
				if(i==2){
					mathsum+=score[i][j];
	}}}
		koravg = korsum/5;
		engavg = engsum/5;
		mathavg = mathsum/5;	
		
		System.out.print("국어 총점은 "+korsum+"이고 평균은 "+koravg+"입니다.");
		System.out.print("영어 총점은 "+engsum+"이고 평균은 "+engavg+"입니다.");
		System.out.print("수학 총점은 "+mathsum+"이고 평균은 "+mathavg+"입니다.");
	}
	
	public void studentSumAvg(){
		StudentScore a = new StudentScore();
		StudentScore b = new StudentScore();
		StudentScore c = new StudentScore();
		StudentScore d = new StudentScore();
		StudentScore e = new StudentScore();
		
		for(int i=0;i<5;i++){
			for(int j=0;j<3;j++){
				if(i==0){
					a.stu_sum += score[i][j];
					a.stu_avg = a.stu_sum/5;
				}
				if(i==1){
					b.stu_sum += score[i][j];
					b.stu_avg = b.stu_sum/5;
				}
				if(i==2){
					c.stu_sum += score[i][j];
					c.stu_avg = c.stu_sum/5;
				}
				if(i==3){
					d.stu_sum += score[i][j];
					d.stu_avg = d.stu_sum/5;
				}
				if(i==4){
					e.stu_sum += score[i][j];
					e.stu_avg = e.stu_sum/5;
				}
			}
		}
		System.out.print("1번 학생의 총점은 "+a.stu_sum+
							"이고 평균은"+a.stu_avg+"이다.");
		System.out.print("2번 학생의 총점은 "+b.stu_sum+
				"이고 평균은"+b.stu_avg+"이다.");
		System.out.print("3번 학생의 총점은 "+c.stu_sum+
				"이고 평균은"+c.stu_avg+"이다.");
		System.out.print("4번 학생의 총점은 "+d.stu_sum+
				"이고 평균은"+d.stu_avg+"이다.");
		System.out.print("5번 학생의 총점은 "+e.stu_sum+
				"이고 평균은"+e.stu_avg+"이다.");
		
	}
	
	public void init(){
		System.out.println("5명의 국어, 영어, 수학 점수의 과목별총점 및 평균 구하기");
		scoreInput();
		scoreSumAvg();
		studentSumAvg();
	}
}
