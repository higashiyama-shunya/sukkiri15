package sukkiri15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main2 {

	public static void main(String[] args) {
		LocalDate now=LocalDate.now();//現在日時の取得
		LocalDate day=now.plusDays(100);	//100日後を取得
		DateTimeFormatter fmt=DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日")	;	//フォーマットの作成
		String str=day.format(fmt);	//文字列型に代入
		System.out.println(str);
		

	}

}
