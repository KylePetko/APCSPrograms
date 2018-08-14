public class FlexArray {
	
	public static void main(String[] args) {
		
		
		FlexArrayPrimitive list1 = new FlexArrayPrimitive();
		FlexArrayPrimitive list2 = new FlexArrayPrimitive();
		FlexArrayPrimitive list3 = new FlexArrayPrimitive();
		
		copy(list1, new int[] {4,1,3,7,6,9,2,8,0,5});
		copy(list2, new int[] {1,0,2,9,3,8,4,7,5,6});
		copy(list3, new int[] {22,52,10,7});
		
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
		System.out.println("Middle: "   + list2.getValue(3) + 
				 		 "\nFirst: "    + list2.getValue(0) + 
						 "\nLast: "     + list2.getValue(9) + 
						 "\nOutside: "  + list2.getValue(15));
						 
		//searchFor()
		System.out.println("\nlist3 = " + list3);
		System.out.println("Search for 10: " + list3.searchFor(10));
		System.out.println("Search for 17: " + list3.searchFor(17));
		
		 
		
		
	}
	
	
	private static void copy(FlexArrayPrimitive prim, int[] nums) {
		for(int num:nums) {
			prim.append(num);
		}
	}
	
}