package homework6;

import java.util.Scanner;

public class AvgScore {
	double finalavg = 0;
	double avgsum;
	double worstscore = 0;
	double bestscore = 0;
	
	private double[] numArray = new double[10];
	private Scanner input = new Scanner(System.in);

	public  AvgScore(){}
	
	public void numInput(){
		for(int i=1;i<=10;i++){
			System.out.print(i+"�� �ɻ����� �Է� : ");
			numArray[i-1] = input.nextDouble();
		}
	}
	
	public void bestScore(){
		for(int j=1;j<=10;j++){
			bestscore=Math.max(numArray[j], numArray[j-1]);
		}
	}
	
	public void worstScore(){
		for(int j=1;j<=10;j++){
			worstscore=Math.min(numArray[j], numArray[j-1]);
		}
	}
	
	public void finalAvg(){
		for(int j=1;j<=10;j++){
			avgsum += numArray[j];
		}
		finalavg = (avgsum - (worstscore + bestscore))/8;
		System.out.print("���� ū ������ ���� ������ ������ 8���� ���� ����� "+finalavg+""
				+ "�Դϴ�.");
	}
}
