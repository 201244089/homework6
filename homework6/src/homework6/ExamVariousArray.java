package homework6;

import java.util.Scanner;

public class ExamVariousArray {
	int menuselect = 0;
	
	public ExamVariousArray(){}
	public void menuinit(){
		Scanner select = new Scanner(System.in);
		
		
		System.out.println("1. �ι�°�� ū �� ã��");
		System.out.println("2. �ɻ� ���� ���");
		System.out.println("3. �л� ����, ��հ� ���ϱ�");
		System.out.println("4. 5�� ����Ʈ�� ������ ���� ���ϱ�");
		System.out.println("5. ��ġ�� �ʴ� ���� 10�� �Է¹ޱ�");
		System.out.println("6. �����ϱ�");
		System.out.print("���ϴ� �޴��� >> ");
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
