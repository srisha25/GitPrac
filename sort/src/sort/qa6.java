import java.util.Vector;

/*Write a program to insert "tekarch" into vector then insert user input number(N) of Z's from 3rd position.
 *  Delete N characters from 6th position from vector*/
 
public class qa6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Vector ele =new Vector();
           ele.add("t");
           ele.add("e");
           ele.add("k");
           ele.add("a");
           ele.add("r");
           ele.add("c");
           ele.add("h");
           ele.remove(6);
           
           System.out.println(ele);
           
	}

}
