public class Main {
    public static void main(String[] args) {
        // BST tree = new BST();
        Banco banco = new Banco();
		/* Let us create following BST
			  50
			 /	 \
			30	  70
			/ \   / \
		   20 40 60    */

		// tree.root = tree.deleteNode(tree.root, 20);

        banco.agregarPalabra("house", "casa");
        System.out.println(banco.getTraduccion("house"));
	}

    }
