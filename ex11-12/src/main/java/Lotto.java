

import java.util.Arrays;
import java.util.Random;

public class Lotto {
	public static void main(String[] args) {

		//Random random = new Random();
		
		//int[] randomNum = new int[6];
		//for(int i = 0; i < 6; i++) {
		//	randomNum[i] = random.nextInt(45) + 1;
		//}
		
		//System.out.println(Arrays.toString(randomNum));
		
		//랜덤으로 숫자를 뽑을경우 중복되는 숫자는 어떻게 처리할 것인가 고민해보기
		
		// ===================================================
		
		int[] ball = new int[45];
		
		for(int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}
		
		int temp = 0;
		int j = 0;
		
		for(int i = 0; i < 6; i++) {
			j = (int)(Math.random() * 45);
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.printf("Ball[%d] = %d%n", i, ball[i]);
		}
	}
}