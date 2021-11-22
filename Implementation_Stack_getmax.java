package geekster;

public class Implementation_Stack_getmax {
	int a[];
	int top;
	int capacity;
	
	public Implementation_Stack_getmax(int capacity) {
		this.capacity=capacity;
		top=-1;
		a=new int[capacity];
	}
	void push(int data) {
		if(top==capacity-1) {
			System.out.println("Stack is full");
		}
		else {
			top++;
			a[top]=data;
		}
	}
	int pop() {
		if(top==-1) {
		  return -1;
		}
		int res =a[top];
		top--;
		return res;
		
	}
	int peak() {
		if(top==-1) {
			  return -1;
			}
		return a[top];
	}
	void getmax() {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<=top;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println(max);
	}
	void print() {
		for(int i=0;i<=top;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String []args) {
		Implementation_of_Stack ob = new Implementation_of_Stack(5);
		ob.push(10);
		ob.push(13);
		ob.push(14);
		ob.pop();
		ob.print();
		ob.getmax();
	}

}
