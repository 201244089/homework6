package homework6;

import java.util.Scanner;

public class AptPersonCount {
	private int totalcnt;
	private int floorcnt;
	private int linecnt;
	private int[][] apart = new int[3][5]; 
	private Scanner input = new Scanner(System.in);
	
	public AptPersonCount(){}
	
	public void input(){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=3;j++){
				System.out.print(i+"0"+j+"ȣ�� ��� �ִ� ����� ���� : ");
				apart[i-1][j-1] = input.nextInt();
			}
		}
	}
	
	public void totalCount(){
		for(int i=0;i<5;i++){
			for(int j=0;j<3;j++){
				totalcnt += apart[i][j];
			}
		}
		System.out.print("�� ����Ʈ�� �����ڴ� ��� "+totalcnt+"�� �Դϴ�.");
	}
	public void floorCount(){
		for(int i=0;i<5;i++){
			for(int j=0;j<3;j++){
				floorcnt+=apart[i][j];
			}
		System.out.print((i+1)+"���� ��� �����ڴ� ��� "+floorcnt+"�� �Դϴ�.");
		floorcnt=0;
		}
	}
	
	public void lineCount(){
		for(int j=0;j<3;j++){
			for(int i=0;i<5;i++){
				linecnt+=apart[i][j];			
			}
			System.out.print((j+1)+"ȣ ���ο� ��� �����ڴ� ��� "+linecnt+"�� �Դϴ�.");
			linecnt=0;
		}
	}
	public void init(){
		System.out.println("5�� ����Ʈ�� ������ �ο� �ľ��ϱ�");
		input();
		totalCount();
		floorCount();
		lineCount();
	}
}
