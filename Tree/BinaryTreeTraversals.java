package DSA_Interview_Questions.Tree;

import java.util.*;
public class BinaryTreeTraversals
{
	public static void main(String[] args) {
		/*
				  5
				/   \
			   3     1
			  / \   / \
			 2   6 4   8
		*/
		Node root = new Node(5);
		CreateTree ct = new CreateTree();
		ct.create(root);
	    
	    System.out.print("Inorder: ");
	    inorder(root);
	    System.out.print("\nPreorder: ");
	    preorder(root);
	    System.out.print("\nPostorder: ");
	    postorder(root);
	    System.out.print("\nInorder using stack: ");
	    inorderStack(root);
	    System.out.print("\nPreorder using stack: ");
	    preorderStack(root);
	    System.out.print("\nPostorder using Stack: ");
	    postorderStack(root);
	    
	}
	
	static void inorder(Node root)
	{
		if(root == null)
			return;
		else
		{
			inorder(root.left);
			System.out.print(root.val + " ");
			inorder(root.right);
		}
	}
	
	static void preorder(Node root)
	{
		if(root == null)
			return;
		else
		{
			System.out.print(root.val + " ");
			preorder(root.left);
			preorder(root.right);
		}
	}
	
	static void postorder(Node root)
	{
		if(root == null)
			return;
		else
		{
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.val + " ");
		}
	}
	
	// preorder using stack
	static void preorderStack(Node root)
    {
        if(root == null)
            return;
            
        Stack<Node> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty())
        {
            Node curr = st.peek();
            st.pop();
            if(curr.right != null)
            {
                st.push(curr.right);
            }
            if(curr.left != null)
            {
                st.push(curr.left);
            }
            System.out.print(curr.val + " ");
        }
    }
	
	// inorder using dtack
	static void inorderStack(Node root)
	{
		if(root == null)
            return;
		
		Stack<Node> st = new Stack<>();
        Node curr = root;
        while(curr != null || !st.isEmpty())
        {
            if(curr != null)
            {
                st.push(curr);
                curr = curr.left;
            }
            else
            {
            	if(!st.isEmpty())
            	{
            		curr = st.pop();
            		System.out.print(curr.val + " ");
            		curr = curr.right;
            	}
            }
        }
	}
    
	// postorder using stack
    static void postorderStack(Node root)
    {
        if(root == null)
            return;
        
        Stack<Node> st = new Stack<>();
        Node curr = root, prev = null;
        while(curr != null || !st.isEmpty())
        {
            if(curr != null)
            {
                st.push(curr);
                curr = curr.left;
            }
            else
            {
                curr = st.peek();
                if(curr.right == null || curr.right == prev)
                {
                    System.out.print(curr.val + " ");
                    st.pop();
                    prev = curr;
                    curr = null;
                }
                else
                {
                    curr = curr.right;
                }
            }
        }
    }
}

