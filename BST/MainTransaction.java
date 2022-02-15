package com.gl.BST;

public class MainTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BstTransactions tree = new BstTransactions();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left= new Node(55);
		
		int order = 0;
		
		tree.flattenBTToSkewed(tree.node, order);
		tree.traverseRightSkewed(tree.headNode);

	}

}
