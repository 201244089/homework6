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
			System.out.print(i+"��° �л� ����, ����, ����");
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
		
		System.out.print("���� ������ "+korsum+"�̰� ����� "+koravg+"�Դϴ�.");
		System.out.print("���� ������ "+engsum+"�̰� ����� "+engavg+"�Դϴ�.");
		System.out.print("���� ������ "+mathsum+"�̰� ����� "+mathavg+"�Դϴ�.");
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
		System.out.print("1�� �л��� ������ "+a.stu_sum+
							"�̰� �����"+a.stu_avg+"�̴�.");
		System.out.print("2�� �л��� ������ "+b.stu_sum+
				"�̰� �����"+b.stu_avg+"�̴�.");
		System.out.print("3�� �л��� ������ "+c.stu_sum+
				"�̰� �����"+c.stu_avg+"�̴�.");
		System.out.print("4�� �л��� ������ "+d.stu_sum+
				"�̰� �����"+d.stu_avg+"�̴�.");
		System.out.print("5�� �л��� ������ "+e.stu_sum+
				"�̰� �����"+e.stu_avg+"�̴�.");
		
	}
	
	public void init(){
		System.out.println("5���� ����, ����, ���� ������ �������� �� ��� ���ϱ�");
		scoreInput();
		scoreSumAvg();
		studentSumAvg();
	}
}
