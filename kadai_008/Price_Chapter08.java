package kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {
		
		int userAge = 30;
		
		int serviceCost = 0;
		
		//年齢を代に変換する
		if(userAge < 10) {
			userAge = 0;
		} else if(10 <= userAge && userAge <20 ) {
			userAge =10;
		} else if(20 <= userAge && userAge < 30 ) {
			userAge = 20;
		} else if(30 <= userAge && userAge < 40 ) {
			userAge = 30;
		} else if(40 <= userAge && userAge < 50 ) {
			userAge = 40;
		} else if(50 <= userAge && userAge < 60 ) {
			userAge = 50;
		} else if(60 <= userAge && userAge < 70 ) {
			userAge = 60;
		} else if(70 <= userAge && userAge < 80 ) {
			userAge = 70;
		} else if(80 <= userAge && userAge < 90 ) {
			userAge = 80;
		} else {
			userAge = 90;
		}
		
		//年齢に応じた料金を取得
		serviceCost = switch(userAge) {
			case 10 -> 1000;
			case 20 -> 2000;
			case 30 -> 3000;
			case 40 -> 3000;
			case 50 -> 4000;
			case 60 -> 4000;
			case 70 -> 4000;
			case 80 -> 5000;
			default -> 500;
		};
		
		System.out.println(userAge + "代の料金は" + serviceCost + "円");

	}

}
