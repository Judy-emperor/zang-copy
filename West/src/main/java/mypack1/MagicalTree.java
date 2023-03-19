package mypack1;

import lombok.Data;

@Data
public class MagicalTree {
	int total;
	int hiddenMumber;
	public MagicalTree(int total) {
		this.total=total;
	};
	

	public static void main(String[] args) {
		MagicalTree magic = new MagicalTree(28);
		magic.beEaten(2, "孙悟空");
		magic.hide(8, "孙悟空");
		magic.recover("观音姐姐");

	}


	private void recover(String who) {
		total = total+hiddenMumber;
		System.out.println(who+"救下了人参树共"+total+"个果子");
		
	}


	private  void hide(int number,String who) {
		total = total-number;
		hiddenMumber = hiddenMumber+number;
		System.out.println(who+"隐藏了"+number+"个人参果");
		
	}


	private void beEaten(int number,String who) {
		total = total-number;
		System.out.println(who+"吃掉了"+number+"个人参果");
		
	}
	

}
