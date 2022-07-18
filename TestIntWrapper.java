public class TestIntWrapper
{
	public static void main(String []Args)
	{
		MyArrayList<Integer> list = new MyArrayList<>(); // Create a list.
		
		System.out.println("Test with empty list");
		list.insertSorted(new Integer(1));
		System.out.println(list);
		
		// Add sorted elements to the list.
		list.add(0, new Integer(1)); 
		list.add(1, new Integer(3));
		list.add(2, new Integer(7));
		list.add(3, new Integer(12));
		list.add(4, new Integer(16));
		list.add(5, new Integer(20));
		
		System.out.println("\nOriginal list");
		System.out.println(list);
		
		System.out.println("\nTest with inserted object smaller than first element (0)");
		list.insertSorted(new Integer(0));
		System.out.println(list);
		
		System.out.println("\nTest with inserted object larger than last element (25)");
		list.insertSorted(new Integer(25));
		System.out.println(list);
		
		System.out.println("\nTest with inserted object roughly in the middle of the list (10)");
		list.insertSorted(new Integer(10));
		System.out.println(list);

	}
}