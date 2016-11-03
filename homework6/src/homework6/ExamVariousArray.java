package homework6;

import java.util.Scanner;

public class ExamVariousArray {
	int menuselect = 0;
	
	public ExamVariousArray(){}
	public void menuinit(){
		Scanner select = new Scanner(System.in);
		
		
		System.out.println("1. 두번째로 큰 수 찾기");
		System.out.println("2. 심사 점수 계산");
		System.out.println("3. 학생 총점, 평균값 구하기");
		System.out.println("4. 5층 아파트의 거주자 숫자 구하기");
		System.out.println("5. 겹치지 않는 숫자 10개 입력받기");
		System.out.println("6. 종료하기");
		System.out.print("원하는 메뉴는 >> ");
		menuselect = select.nextInt();
	}
	
	public void selectedMenu(){
		if(menuselect == 1){
			SecondMax a = new SecondMax();
			a.init();
			menuinit();
		}
		if(menuselect == 2){
			AvgScore a = new AvgScore();
			a.init();
			menuinit();
		}
		if(menuselect == 3){
		StudentScore a = new StudentScore();
			a.init();
			menuinit();
		}
		if(menuselect == 4){
			AptPersonCount a = new AptPersonCount();
			a.init();
			menuinit();
		}
		if(menuselect == 5){
			OnlyNumber a = new OnlyNumber();
			a.init();
			menuinit();
		}
		if(menuselect==6){
			System.exit(1);
		}
	}
	
	public static void main(String[] args) {
		ExamVariousArray menu = new ExamVariousArray();
		menu.menuinit();
		menu.selectedMenu();

	}

}
