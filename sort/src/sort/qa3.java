
public class qa3 {
	static int maxSize;

static StudentObj[] a;
static int top;
public qa3() {
	top=-1;
	maxSize=5;
	a=new StudentObj[maxSize];
}
public static boolean isEmpty(){
	return top==-1;
}
public static boolean isFull(){
	return top==maxSize-1;
		
}
public static void push(StudentObj item){
	if(isFull())
		System.out.println("already full cannot insert new value");
	else 
		a[++top]=item;
}
public static void pop(){
	if(isEmpty())
		System.out.println("cannot remove bcz stack is empty");
	else{
		StudentObj val=a[top--];
		System.out.println(val+" has been deleted");
		}
}
public static void display(){
	if(isEmpty())
		System.out.println("statck is empty");
	else{
	for(int i=top;i>=0;i--)
		System.out.println(a[i]);
	}
}
public static void main(String[] args) {
	qa3 ob=new qa3();
	
	StudentObj ob1=new StudentObj("ram",1,98);
	StudentObj ob2=new StudentObj("sam",2,76);
	StudentObj ob3=new StudentObj("john",3,48);
    

	ob.push(ob1);
	ob.push(ob2);
	ob.push(ob3);
	ob.display();
}
}
