package mypack1;
/*
 * 
 */
public class RabbitCouple {
	private static int sum=0;//初始兔子个数

	private int bornMonth;//表示兔子出生的月份
	
	public RabbitCouple(int month) {
		this.bornMonth=month;
		sum++;
		System.out.println("出生了一对新兔子，出生月份是"+bornMonth+",目前共有"+sum+"只兔子");
	}
	
	public static void main(String[] args) {
		int month = 8;
		RabbitCouple rabbitcouple = new RabbitCouple(1);
		rabbitcouple.giveBirth(month);
		System.out.println(month+"个月共生"+sum+"兔子");
	}

	private void giveBirth(int month) {
		for(int i=bornMonth+2;i<=month;i++) {
			//从对三个月开始，每过一个月就会生一对兔子
			RabbitCouple kids = new RabbitCouple(i);
			//新生的兔子继续生兔子
			kids.giveBirth(month);
		}
		
	}

}
