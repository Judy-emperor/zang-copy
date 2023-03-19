package mypack1;

import lombok.Data;

@Data
public class Monkey {

	public  Monkey(String string) {
		 this.name=string;
	}

	String name;
}
