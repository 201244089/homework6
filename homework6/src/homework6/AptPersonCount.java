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
				System.out.print(i+"0"+j+"호에 살고 있는 사람의 숫자 : ");
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
		System.out.print("이 아파트의 거주자는 모두 "+totalcnt+"명 입니다.");
	}
	public void floorCount(){
		for(int i=0;i<5;i++){
			for(int j=0;j<3;j++){
				floorcnt+=apart[i][j];
			}
		System.out.print((i+1)+"층에 사는 거주자는 모두 "+floorcnt+"명 입니다.");
		floorcnt=0;
		}
	}
	
	public void lineCount(){
		for(int j=0;j<3;j++){
			for(int i=0;i<5;i++){
				linecnt+=apart[i][j];			
			}
			System.out.print((j+1)+"호 라인에 사는 거주자는 모두 "+linecnt+"명 입니다.");
			linecnt=0;
		}
	}
	public void init(){
		System.out.println("5층 아파트의 거주자 인원 파악하기");
		input();
		totalCount();
		floorCount();
		lineCount();
	}
}
