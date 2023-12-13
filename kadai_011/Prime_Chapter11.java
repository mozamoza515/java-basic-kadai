package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		//101個の要素を追加してtrueにする
		boolean[]numberJudge = new boolean[101];
		
		for( int i = 1; i < numberJudge.length; i++) {
			numberJudge[i] = true;
		}
		
		//割る数
		int divideNumber = 2;
		
		//割り切れるか判定する
		while( divideNumber < numberJudge.length) {
			for( int i = divideNumber + 1; i < numberJudge.length; i++) {
				if( i %  divideNumber == 0) {
					numberJudge[i] = false;
					continue;
				}
			}
			
			divideNumber += 1;
		}
		
		//素数を出力する
		for( int i = 2; i < numberJudge.length; i++) {
			if( numberJudge[i]) {
				System.out.println(i);
			}
		}
		
		
		
	}
}