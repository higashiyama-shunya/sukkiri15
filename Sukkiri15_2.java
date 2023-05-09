package sukkiri15;

public class Sukkiri15_2 {

	public static void main(String[] args) {
		String folder="c:\\javadev";
		String folder2="c:\\user\\";	//\を表示する際は\を2つ入れてエスケープシーケンスをはさむ
		String file="readme.txt";	//それぞれ末尾に\が入っているフォルダーと入ってないフォルダーの変数を作成
		
		System.out.println(fileName(folder,file));
		System.out.println(fileName(folder2,file));

	}
	public static String fileName(String folder,String file) {
		
		if(!folder.endsWith("\\")) {	//末尾に\が入っていなかったら
			String Allfile=folder+"\\"+file;
			return Allfile;
			
		}else {
			String filepath=folder+file;
			return filepath;
		}
		/*教科書の答え		こうやって書いたほうが短く分かりやすい。
		 * 
		 * if(!folder.endsWith("\\")){
		 * 		folder+="\\";		//末尾になかったらfolder変数に\をつける
		 * }
		 * return folder+file;		//戻り値でfolder+fileを返す	末尾に\\があったらif文を無視するのでそのまま結合される。
		 * }
		 * 
		 */
		
		
	}
}
