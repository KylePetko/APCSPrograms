public class RectTester {
	
	public static void main(String[] args) {
	
		FlexArrayRectangle list1 = new FlexArrayRectangle();
		FlexArrayRectangle list2 = new FlexArrayRectangle();
		FlexArrayRectangle list3 = new FlexArrayRectangle();
	
		list1.append(new Rectangle(4, 9));
		list1.append(new Rectangle(1, 2));
		list1.append(new Rectangle(3, 8));
		list1.append(new Rectangle(7, 10));
		list1.append(new Rectangle(6, 5));
		
		list2.append(new Rectangle(7, 10));
		list2.append(new Rectangle(4, 9));
		list2.append(new Rectangle(6, 5));
		list2.append(new Rectangle(3, 8));
		list2.append(new Rectangle(1, 2));
		
		list3.append(new Rectangle(22, 55));
		list3.append(new Rectangle(10, 7));
		
		//compareTo()
		System.out.println("L1,L2: " + list1.compareTo(list2) + "\nL2,L3: " +
			list2.compareTo(list3) + "\nL3,L1: " + 
			list3.compareTo(list1));
			
		//equals()
		System.out.println("\nL1 = L2? " + list1.equals(list2) +
						   "\nL2 = L3? " + list2.equals(list3) + "\n");
		
		//sort()				   
		System.out.println("list1 = " + list1);
		list1.sort();
		System.out.println("list1 sorted = " + list1);
		
		//getValue()
		System.out.println("\nlist2 = " + list2);
		System.out.println("Middle: "   + list2.getValue(2) + 
				 		 "\nFirst: "    + list2.getValue(0) + 
						 "\nLast: "     + list2.getValue(4) + 
						 "\nOutside: "  + list2.getValue(15));
		
		//searchFor()
		System.out.println("\nlist3 = " + list3);
		System.out.println("Search for 10, 7: " + list3.searchFor(new Rectangle(10, 7)));
		System.out.println("Search for 90, 5: " + list3.searchFor(new Rectangle(90, 5)));
		
	}
	
}