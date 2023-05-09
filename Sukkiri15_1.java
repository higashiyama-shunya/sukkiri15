package sukkiri15;

public class Sukkiri15_1 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();	//StringBuilderが文字列連結の処理速度が早い
		for(int i=1;i<=100;i++) {
			String num=Integer.toString(i);	//iを文字列にしてnumに代入
			sb.append(num+",");		//sbの末尾に追加して文字列連結していく
		}
		String s=sb.toString();		//sにsbを文字列に直した値を代入
		String[] a=s.split(",");	//,ごとに文字列を区切って配列に入れる
		System.out.println(s);		//
		for(String moji:a) {		//拡張for文でString型で回す
			System.out.print(moji+" ");
		}
	}

}
