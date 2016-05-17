//U10316053 µ{¬fºú
public class Test_Binary_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] test = {0, -99, 86, 4, 40, 69, 73, 205, -80};
		Binary_Sort<Integer> intTree = new Binary_Sort<Integer>(test);
		System.out.print("Original number Arrary : ");
		for(int i=0;i<test.length;i++){
			System.out.print(test[i]+" ");
			}
	    System.out.print("\nAfter Binary Sort : ");
	    intTree.inorder();
	}

}
