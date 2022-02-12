package utkarsha;

import java.util.*;

   class HashSet2 {
   public static void main(String[] args) {
		
   HashSet<String>set=new HashSet();
   set.add("One");
   set.add("Two");
   set.add("Three");
   set.add("Four");
   set.add("Four");
   Iterator<String> i=set.iterator();
    while(i.hasNext())
{
	System.out.println(i.next());
}
	}
}
