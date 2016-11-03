package homework6;

import java.util.Scanner;

public class OnlyNumber {
	boolean check = true;
	private Scanner input = new Scanner(System.in);
	private int[] numArray = new int[10];
	
	public OnlyNumber(){}
	
	public void input(){
		for(int i=1;i<=10;i++){
			System.out.print(i+"번째 숫자 : ");
			if(numValidator(input.nextInt())== false){
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				System.out.print(i+"번째 숫자 : ");
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
			System.out.println(i+"번째 숫자는 "+numArray[i-1]+"입니다.");
		}
	}

	public void init(){
		System.out.println("1~100사이의 숫자를 입력하세요.");
		input();
		output();
	}
}
