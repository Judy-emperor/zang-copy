package mypack2;

import mypack1.Food;

public class Pig {

	public static void main(String[] args) {
		Food food = new Food();
		food.setName("西瓜");
		eat(food);

	}

	private static void eat(Food food) {
		System.out.println("猪八戒吃"+food.getName()+"美滋滋");
		
	}

}
