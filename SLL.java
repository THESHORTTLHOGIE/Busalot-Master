
public class SLL<T extends Comparable<? super T>>
{   
	private Element<T> head;  // list header
	private Element<T> tail;
	
    public SLL()
    {  head = null;  
	   tail = null;        
    }
    public boolean prepend(T newElement) //insert at head
    {  
		Element<T> temp = new Element<T>(newElement);
        if(temp == null) // out of memory
           return false;
        else
        {  
	       if (head==null)
		   {
			head = temp;
			tail = temp;
		   }
           else
           {
			 temp.next = head;
			 head = temp;
		   }
		}
        return true;
    }
	 public boolean append(T newElement) //insert at head
    {  
		Element<T> temp = new Element<T>(newElement);
        if(temp == null) // out of memory
           return false;
        else
        {  
	       if (head==null)
		   {
			head = temp;
			tail = temp;
		   }
           else
           {
			 tail.next = temp;
			 tail = temp;
		   }
		}
     return true;
    }
	public String toString()
	{
		Element<T> ptr = head;
		String s="";
		while (ptr != null) //continue to traverse the list
		{   
			s+= ptr.data.toString( )+ " ";
			ptr = ptr.next;
		}
		return s;
	}
	
	
	public boolean isMember(T param)
	{
		if(param == null || head == null)
		{
			return false;
		}
		
		Element<T> ptr = head;
		while(ptr != null)
		{
			if(ptr.data.compareTo(param) == 0)
			{
				return true;
			}
			ptr = ptr.next;
		}
		return false;
	}
	
	public SLL<T> missing(SLL<T> testList)
	{
		if(this.head == null)
		{
			return testList;
		}
		if(testList.head == null)
		{
			return null;
		}
		SLL<T> returnList = new SLL<T>();
		Element<T> ptr = testList.head;

		while(ptr!= null)
		{
			if(!isMember(ptr.data))
			{
				returnList.append(ptr.data);
				return returnList;
			}
			ptr = ptr.next;
		}
		return returnList;
	}
   
	
  
	
  public class Element<T1 extends Comparable<? super T1>>
  {   
      private T1 data;
      private Element<T1> next;
      public Element(T1 param)
     {
		 data = param;
     }
	  	
   }// end of inner class Node
}//end SinglyLinkedList outer class

