package homework6;
import java.util.*;

public class SecondMax {
	private int[] numArray = new int[10];
	private Scanner input = new Scanner(System.in);

	public  SecondMax(){}
	
	public void numInput(){
		for(int i=1;i<=10;i++){
			System.out.print(i+"번째 수를 입력하시오. ");
			numArray[i-1] = input.nextInt();
		}
	}

	public void secondMaxChoose(){
		int firstMax = 0;
		int secondMax = 0;
		for(int j=1;j<=10;j++){
			firstMax=Math.max(numArray[j], numArray[j-1]);
		}
		for(int j=1;j<=10;j++){
			if(firstMax == numArray[j] && firstMax == numArray[j-1]){
				break;
			}
			secondMax=Math.max(numArray[j], numArray[j-1]);
		}
		}
	public void init(){
		numInput();
		secondMaxChoose();
	}
}
