import java.util.HashMap;

public class Banco {

private BST bsttree = new BST();
public static HashMap <String, String> hashMap = new HashMap<>();

public void agregarPalabra(String word, String palabra){
    word = word.toLowerCase();
    if (bsttree.root == null){
    bsttree.root = bsttree.insert(bsttree.root, word);
    }
    else{
    bsttree.insert(bsttree.root, word);
    } 
    hashMap.put(word, palabra);
}
    
public String getTraduccion(String key){
    key = key.toLowerCase();
    if(hashMap.get(key)== null){
        return "No existe registro de dicha palabra";
    }
    else{
        return hashMap.get(key);
    }
}

public void getAllWords(){
    bsttree.inorder(bsttree.root);
    System.out.println("\n");
}
    
}
