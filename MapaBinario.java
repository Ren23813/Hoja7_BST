//Extraído de Geeks for Geeks

class Node {
	String key;
	Node left, right;
	Node(String word) {
		key = word;
		left = right = null;
	}
}

class BST {
	Node root;
	//Se realiza extracción de datos InOrder
	void inorder(Node root) {
		if (root != null) {
			inorder(root.left);
			System.out.print(root.key + " ");
			inorder(root.right);
		}
	}

	Node insert(Node node, String word) {
		if (node == null){
			return new Node(word);
		}
		int comparador = word.compareTo(node.key);
		if (comparador < 0){
			node.left = insert(node.left, word);
		}
		else if (comparador > 0){
			node.right = insert(node.right, word);
		}
			

		return node;
	}

	Node deleteNode(Node root, String key) {
		if (root == null)
			return root;

		int comparador = root.key.compareTo(key);
		if (comparador > 0) {
			root.left = deleteNode(root.left, key);
			return root;
		} else if (comparador < 0) {
			root.right = deleteNode(root.right, key);
			return root;
		}

		// Aquí alcanza el nodo a borrar

		// Si tiene solo un hijo:
		if (root.left == null) {
			Node temp = root.right;
			return temp;
		} else if (root.right == null) {
			Node temp = root.left;
			return temp;
		}

		// Si tiene ambos hijos:
		else {
			Node succParent = root;
			Node succ = root.right;
			while (succ.left != null) {
				succParent = succ;
				succ = succ.left;
			}
			if (succParent != root)
				succParent.left = succ.right;
			else
				succParent.right = succ.right;

			root.key = succ.key;

			return root;
		}
	}


	 
}
