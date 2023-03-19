package mypack1;

import lombok.Data;

/*
 * 兵器类
 */
@Data
public class Weapon {
	String name;
	double lenth;
	double weight;
	//表示兵器是否可伸缩
	boolean isStrtchAble;
	String madeIn;//产地
    Monkey owner;//主人
    public Weapon(String string, double d, Monkey monkey) {
		this.name=string;
		this.lenth=d;
		this.owner=monkey;
	}
	public void print() {
    	System.out.println("兵器名称"+name+"\n长度"+lenth+"\n主人"+owner.name);
    }
    public static void main(String args[]) {
    	Monkey monkey = new Monkey("孙悟空");
    	Weapon weapon = new Weapon("金箍棒",100.0,monkey);
    	weapon.print();
    }
}
