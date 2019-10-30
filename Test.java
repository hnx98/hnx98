package myJava;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] arg){

		List<Integer> lNum = Arrays.asList(3,5,10,20,-30);
		lNum.stream().filter(num -> num % 5 == 0).forEach(System.out::println);
		lNum
		  .stream()
		  .filter(num -> num > 4 && num < 0)
		  .forEach(System.out::println);

	}	
}
