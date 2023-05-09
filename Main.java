package sukkiri15;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Date now=new Date();		//現在日時の取得
		Calendar c=Calendar.getInstance();		//Calendar型の変数
		c.setTime(now);	//現在日時をセット
		
		int day=c.get(Calendar.DAY_OF_MONTH);	//Calendar型の日時の数値を取得
		day+=100;								//int型なのでそのまま100を足す
		c.set(Calendar.DAY_OF_MONTH, day);		//Calendar型にまたset
		
		Date day2=c.getTime();		//Date型に戻す
		
		SimpleDateFormat f=new SimpleDateFormat("西暦yyyy年MM月dd日");		//フォーマットを作成する
		String s=f.format(day2);	//フォーマットに上で戻したDate型をセットする。
		System.out.println(s);
		

	}

}
