import java.util.HashMap;

public class Banco {

private BST bsttree = new BST();
private HashMap <String, String> hashMap = new HashMap<>();

public void agregarPalabra(String word, String palabra){
    if (bsttree.root == null){
    bsttree.root = bsttree.insert(bsttree.root, word);
    }
    else{
    bsttree.insert(bsttree.root, word);
    } 
    hashMap.put(word, palabra);
}
    
public String getTraduccion(String key){
    return hashMap.get(key);
}

public void getAllKeys(){
    bsttree.inorder(bsttree.root);
}
    
}
