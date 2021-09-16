package acount;
import java.util.*;

public class CollectionDemo {
	public static void main(String[] args) {
		LinkedList<String> list =new LinkedList<String>();
		list.add("Sachin");
		list.add("Dev");
		list.add("Anuja");
		list.add("Akash");
	
		System.out.println("---------------------------------------\nGiven List ->");
		System.out.println(list);
		
		list.remove("Dev");
		System.out.println("---------------------------------------\nAfter Removing element ->");
		System.out.println(list);
		
		
		list.add("Again add");
		list.add("Ashwini");
		
		System.out.println("---------------------------------------\nList ->");
		System.out.println(list);
		
		// Using list iterator  -> next()
		System.out.println("---------------------------------------\nlistiterator ->");
		ListIterator<String> litr=list.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		// Using list iterator  -> previous()
		System.out.println("---------------------------------------\nlist iterator previous ->");
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		
		// Using Enhance loop
		System.out.println("---------------------------------------\nenhance loop ->");
		for(String s:list)
			System.out.println(s);
		
		//	Using forEach loop
		
		System.out.println("---------------------------------------\nfor each method ->");
		list.forEach(x->System.out.println(x));

		// Using iterator
		System.out.println("---------------------------------------\nIterator ->");
		
		Iterator<String>itr =list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
	}

}
/*OUTPUT :
---------------------------------------
Given List ->
[Sachin, Dev, Anuja, Akash]
---------------------------------------
After Removing element ->
[Sachin, Anuja, Akash]
---------------------------------------
List ->
[Sachin, Anuja, Akash, Again add, Ashwini]
---------------------------------------
listiterator ->
Sachin
Anuja
Akash
Again add
Ashwini
---------------------------------------
list iterator previous ->
Ashwini
Again add
Akash
Anuja
Sachin
---------------------------------------
enhance loop ->
Sachin
Anuja
Akash
Again add
Ashwini
---------------------------------------
for each method ->
Sachin
Anuja
Akash
Again add
Ashwini
---------------------------------------
Iterator ->
Sachin
Anuja
Akash
Again add
Ashwini
*/
