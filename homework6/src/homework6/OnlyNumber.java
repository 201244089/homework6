package homework6;

import java.util.Scanner;

public class OnlyNumber {
	boolean check = true;
	private Scanner input = new Scanner(System.in);
	private int[] numArray = new int[10];
	
	public OnlyNumber(){}
	
	public void input(){
		for(int i=1;i<=10;i++){
			System.out.print(i+"��° ���� : ");
			if(numValidator(input.nextInt())== false){
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
				System.out.print(i+"��° ���� : ");
			}
			else{
				numArray[i]= input.nextInt();
			}
		}
	}
	public boolean numValidator(int number){
		for(int i=0;i<10;i++){
			if(number == numArray[i]){
				check = false;
			}
		}
		return check;
	}

	public void output(){
		for(int i=10;i>0;i--){
			System.out.println(i+"��° ���ڴ� "+numArray[i-1]+"�Դϴ�.");
		}
	}

	public void init(){
		System.out.println("1~100������ ���ڸ� �Է��ϼ���.");
		input();
		output();
	}
}
