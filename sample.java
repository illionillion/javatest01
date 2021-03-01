package test;
import java.util.Random;
public class sample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		System.out.println("hello world");
//		int a=1;
//		a=a*2+4;
//		System.out.println(a);
//		String text="hello";
//		System.out.println(text);
		String[] text= {"大吉","中吉","小吉","末吉","吉","凶","大凶","バカ"};
//		System.out.println(text[0]);
//		Random rnd = new Random();
//		int iValue3 = rnd.nextInt(100);
		Random rnd = new Random();
		for(int i=0;i<10;i++) {
			int val = (int)(rnd.nextDouble() * text.length);
			System.out.println(text[val]);
			if(val%2!=1){
				int val2=(int)(rnd.nextDouble()*text.length);
				System.out.println("one more");
				System.out.println(text[val2]);
			}
		}
			
	}

}
