package geekster;

import java.util.Arrays;
import java.util.Stack;

public class Revesre_str_Stack {
	public static void main(String []args) {
		 Stack<String> stack = new Stack<>();
		 String str="Hi I am Nauman";
	      String[] Arr =str.split(" ");
	      int length = Arr.length;
	      for(int i=0; i<length; i++) {
	         stack.push(Arr[i]);
	      }
	      String[] reverseArray = new String[length];
	      for(int i=0; i<length; i++) {
	         reverseArray[i] = stack.pop();
	      }
	      System.out.println(Arrays.toString(reverseArray));
	   }


}
