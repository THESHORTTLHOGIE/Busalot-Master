
public class Driver
{
	public static void main(String [] args)
	{
	 Integer head = null;
	 SLL<Integer> myStack = new SLL<Integer>();
	 SLL<Integer> myStack2 = new SLL<Integer>();
	 
	 
	 System.out.println("\nInitial list: ");
	 System.out.println(myStack +"\n");
	
	 
	 System.out.println("\nAdd One item: ");// Add item to Empty list
	 myStack.append(new Integer(3));
	 System.out.println(myStack +"\n");
	 
	 System.out.println("\nAdd a few more:");
	 myStack.append(new Integer(5));
	 myStack.append(new Integer(4));
	 myStack.append(new Integer(2));
	 System.out.println(myStack +"\n");
	 
	 System.out.println("Check isMember method:");
	 
	 System.out.println("Check if 3 is a member: " + myStack.isMember(new Integer(3)));
	 System.out.println("Check if 1 is a member: " + myStack.isMember(new Integer(2)));
	 System.out.println("Check if 4 is a member: " + myStack.isMember(new Integer(4)));
	 System.out.println("Check if 5 is a member: " + myStack.isMember(new Integer(5)));
	 System.out.println("Check if 9 is a member: " + myStack.isMember(new Integer(9)));
	 System.out.println("Check if 6 is a member: " + myStack.isMember(new Integer(8)));
	 System.out.println("Check if 0 is a member: " + myStack.isMember(new Integer(1)));
	 System.out.println("Check if 7 is a member: " + myStack.isMember(new Integer(4)));
	 
	 System.out.println("\nPopulate list 2");
	 myStack2.append(new Integer(2));
	 myStack2.append(new Integer(5));
	 myStack2.append(new Integer(3));
	 System.out.println(myStack2 +"\n");
	 
	 
	 System.out.println("Test the missing method, displays what is missing");
	 System.out.println(myStack.missing(myStack2));
	 	
	}
}