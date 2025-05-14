package com.aniket;

import com.aniket.util.BST;
import com.aniket.util.TreeNode;

public class App 
{
	public static void main(String args[])
	{
		TreeNode root = null;
		
		root = BST.insert(root,34); 
		root = BST.insert(root,67); 
		root = BST.insert(root,45); 
		root = BST.insert(root,12); 
		root = BST.insert(root,78); 
		root = BST.insert(root,55);
		root = BST.insert(root,43);
		root = BST.insert(root,90);
		root = BST.insert(root,11);
	}
}
