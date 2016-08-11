import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test {
	public static void main(String args[]) {
		
		List<BinaryNode> resultList = new ArrayList<BinaryNode>();
		BinaryNode rootNode = creatBinaryTree();
		//traversalBinaryTree(rootNode, resultList);
		//printBinaryTree(resultList);
		printTree(rootNode, resultList);
		//levelTravel(rootNode);


	}

	/*
	 * 生成一个二叉树
	 */
	public static BinaryNode creatBinaryTree() {
		BinaryNode rootNode = new BinaryNode(1);
		rootNode.leftChild = new BinaryNode(2);
		rootNode.rightChile = new BinaryNode(3);
		rootNode.leftChild.leftChild = new BinaryNode(4);
		rootNode.leftChild.rightChile = new BinaryNode(5);
		rootNode.rightChile.leftChild = new BinaryNode(6);
		rootNode.rightChile.rightChile = new BinaryNode(7);
		return rootNode;
	}

	/*
	 * 将二叉树的节点按照层序存储到List中
	 */
	public static void traversalBinaryTree(BinaryNode rootNode, List<BinaryNode> list) {
		if (null == rootNode) {
			return;
		} else {
			list.add(rootNode);
		}
		if (null != rootNode.leftChild) {
			traversalBinaryTree(rootNode.leftChild, list);
		}
		if (null != rootNode.rightChile) {
			traversalBinaryTree(rootNode.rightChile, list);
		}
		if (null == rootNode.leftChild && null == rootNode.rightChile) {
			return;
		}
	}

	/*
	 * 打印List存起来的二叉树
	 */
	public static void printBinaryTree(List<BinaryNode> list) {
		if (null == list || list.size() <= 0) {
			System.out.println("树为空");
		} else {
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).value);
			}
		}
	}

	/*
	 * 层序打印而插二叉树
	 */
	public static void printTree(BinaryNode rootNode, List<BinaryNode> list) {
		if (null == rootNode) {
			System.out.println("树为空");
			return;
		}
		list.add(rootNode);
		while (!list.isEmpty()) {
			BinaryNode node = list.get(0);
			System.out.println(node.value);
			list.remove(0);
			if (node.leftChild != null) {
				list.add(node.leftChild);
			}
			if (node.rightChile != null) {
				list.add(node.rightChile);
			}
		}
	}

	/*
	 * 层序打印而插二叉树
	 */
	public static void levelPrintTree(BinaryNode rootNode) {
		if (null == rootNode) {
			System.out.println("树为空");
			return;
		}
		List<BinaryNode> list = new ArrayList<BinaryNode>();
		list.add(rootNode);
		while (!list.isEmpty()) {
			BinaryNode node = list.get(0);
			System.out.println(node.value);
			list.remove(0);
			if (node.leftChild != null) {
				list.add(node.leftChild);
			}
			if (node.rightChile != null) {
				list.add(node.rightChile);
			}
		}
	}

	public static void levelTravel(BinaryNode root) {
		if (root == null)
			return;
		Queue<BinaryNode> q = new LinkedList<BinaryNode>();
		q.add(root);
		while (!q.isEmpty()) {
			BinaryNode temp = q.poll();
			System.out.println(temp.value);
			if (temp.leftChild != null)
				q.add(temp.leftChild);
			if (temp.rightChile != null)
				q.add(temp.rightChile);
		}
	}

}
