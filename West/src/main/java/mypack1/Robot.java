package mypack1;

public class Robot {

	public static void main(String[] args) {
		encrypt(1234);

	}

	private static void encrypt(int data) {
		int data1 = data%10;
		int data2 = data/10%10;
		int data3 = data/100%10;
		int data4 = data/1000;
		System.out.println(data1+""+data2+""+data3+""+data4);
	}

}
