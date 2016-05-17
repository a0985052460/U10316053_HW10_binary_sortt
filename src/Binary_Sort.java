//U10316053 µ{¬fºú
public class Binary_Sort<E extends Comparable<E>> {
	//create a tree
	TreeNode<E> root;
	public static class TreeNode<E extends Comparable<E>> {
	    public E element;
	    public TreeNode<E> left;
	    public TreeNode<E> right;

	    public TreeNode(E e) {
	      element = e;
	    }
	  }
	//create a tree
	
	int size = 0;
	Binary_Sort(E[] objects) {
	    for (int i = 0; i < objects.length; i++)
	      add(objects[i]);
	  }
	public boolean add(E e) {
	    if (root == null)
	      root = new TreeNode<E>(e); // Create a new root
	    else {
	      // Locate the parent node
	      TreeNode<E> parent = null;
	      TreeNode<E> current = root;
	      while (current != null){
	        if (e.compareTo(current.element) < 0) {
	          parent = current;
	          current = current.left;
	        }
	        else if (e.compareTo(current.element) > 0) {
	          parent = current;
	          current = current.right;
	        }
	        else
	          return false; // Duplicate node not added
	      }
	      // Create the new node and attach it to the parent node
	      if (e.compareTo(parent.element) < 0)
	        parent.left = new TreeNode<E>(e);
	      else
	        parent.right = new TreeNode<E>(e);
	    }

	    size++;
	    return true; // Element added
	  }
	public void inorder() {
	    inorder(root);
	  }
	protected void inorder(TreeNode<E> root) {
	    if (root == null) return;
	    inorder(root.left);
	    System.out.print(root.element + " ");
	    inorder(root.right);
	  }
	  
}
