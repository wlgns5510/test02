// 작성자: 07_짝수_양지훈
package com.javaex.ex01;

public class PersonApp {

	public static void main(String[] args) {
		
		Person c1 = new Person("정우성", "010-1111-2222");
		c1.showInfo();
		
		Person c2 = new Customer("유재석", "010-2222-3333", 1, 1000);
		c2.showInfo();
	}

}
