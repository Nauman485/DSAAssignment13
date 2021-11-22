package geekster;

public class Queeue_Array {
    int a[];
    int capacity;
    int rear;
    
   public Queeue_Array(int n) {
	   capacity=n;
	   a=new int[n];
	   rear=-1;
   }
   void enqueue(int data) {
	   if(rear==capacity) {
		   System.out.println("overflow");
	   }
	   rear++;
	   a[rear]=data;
   }
   int dequeue() {
	   if(rear==-1) {
		   return -1;
	   }
	   int res=a[0];
	   for(int i=0;i<rear;i++) {
		   a[i]=a[i+1];
	   }
	   rear--;
	   return res;
   }
   int getFront() {
	   if(rear==-1) {
		   return -1;
	   }
	   return a[0];
   }
   public static void main(String []args) {
	   Queeue_Array ob = new Queeue_Array(5);
	   ob.enqueue(5);
	   ob.enqueue(6);
	   ob.enqueue(8);
	   ob.enqueue(9);
	   ob.enqueue(6);
	   System.out.println(ob.getFront());
	   System.out.println(ob.dequeue());
   }

}
