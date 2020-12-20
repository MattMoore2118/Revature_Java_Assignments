package list_tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class List_Assignment {

	public static void main(String[] args) {
		
		List l1=new LinkedList();
		l1.add("i_o");
		l1.add(444);
		l1.add(true);
		l1.add(1.4563729);
		l1.add("blah");
		l1.add(123456789101112L);
		System.out.println("l1 = "+l1);
		Collections.reverse(l1);
		System.out.println("l1 in reverse = "+l1); // Reversing order of List l1
		
		String s = "blah";
		l1.remove(s);
		System.out.println("l1 after removing string blah "+l1); // Removing element from l1
		
		List<Integer> l2=new LinkedList(); // Odds and Evens
		List<Integer> l2_odd=new LinkedList();
		List<Integer> l2_even=new LinkedList();
		l2.add(1);
		l2.add(6);
		l2.add(8);
		l2.add(4);
		l2.add(7);
		l2.add(2);
		l2.add(5);
		l2.add(3);
		for(int i = 0; i < l2.size(); i++) {
			if(l2.get(i)%2 <= 0) {
				l2_even.add(l2.get(i));
			}
			else {
				l2_odd.add(l2.get(i));
			}
			}
		System.out.println("Evens in l2 : "+l2_even);
		System.out.println("Odds in l2 : "+l2_odd);
		
		int sum_even = 0; //Sum of evens vs sum of odds
		int sum_odd = 0;
		for(Integer j:l2_even) {
			sum_even = sum_even +j;
		}
		for(Integer k:l2_odd) {
			sum_odd = sum_odd +k;
		}
		if(sum_even > sum_odd) {
			System.out.println("The sum of evens was greater with "+sum_even);
		}
		else {
			System.out.println("The sum of odds was greater with "+sum_odd);
		}
		
		Collections.sort(l2); //Max and Min
		System.out.println("Min of l2 = "+l2.get(0));
		System.out.println("Max of l2 = "+l2.get(l2.size()-1));
		
		List l3=new LinkedList(); //Palindrome Task
		l3.add("racecar");
		l3.add("tacocat");
		l3.add("momo");
		l3.add(101);
		for(int x=0; x < l3.size(); x++) {
			s = l3.get(x)+"";
			if(new StringBuffer(s).reverse().toString().equals(s)) {
				System.out.println(l3.get(x)+" is a Palindrome");
			}
			else {
				System.out.println(l3.get(x)+" is not a Palindrome");
			}
		}
	}

}
