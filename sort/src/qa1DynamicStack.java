
public class qa1DynamicStack {


    static int maxSize;
    static int top;
    static int[] a;
    
    public qa1DynamicStack()
    {
 	   maxSize=5;
 	   top=-1;
 	   a= new int[maxSize];
    }
    
    public static boolean isEmpty(){
 	   if(top==1)
 		   return true;
 	   else
 	   {
 		   return false;
 	   }
 	   }
 	 public static boolean isFull(){
 		if(top==maxSize-1)
 			return true;
 	 
 		else
 		{
 			return false;
 		}
 	 }
 	 public void push(int items){
 		 if(isFull()){
 			 System.out.println("cant inseart elements ,Stack is full");
 		 }else
 			 top++;
 		     a[top]=items;
 				 
 			  }
 		 public void pop(){
 			 if(isEmpty())
 			 {
 				 System.out.println("stack is empty cant remove");
 			 }
 				 else
 				 {
 					 int val=a[top];
 					 top--;
 					 System.out.println(val+"is removed"); 
 					 
 				 }
 			 }
 		public void peek(){
 			  int temp;
 			  if(isEmpty()){
 			   System.out.println("Stack is empty");
 			  }else{
 			   temp=a[top];
 			   
 			  }
 			  
 			 }
 		public static void main(String[] args){
 			qa1DynamicStack ob =new qa1DynamicStack();
 			ob.push(10);
 			ob.push(20);
 			ob.push(30);
 			ob.push(40);
 			ob.pop();
 			ob.peek();
 			
 			
 		}
}