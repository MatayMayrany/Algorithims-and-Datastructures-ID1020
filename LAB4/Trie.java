import java.util.Map;
import java.util.HashMap;
public class Trie {
    public Node root = new Node();

    public void put(String key) {
        put2(root, key, 0);

    }

    public Node put2(Node checkNode, String key, int index) {
        // if the character is pointing to null add a new node
        if (checkNode == null) {
            checkNode = new Node();
        }
        // check if we are at end of key string and put 1 in value if it was 0 or increment by 1 if not
        if (index == key.length()) {
            if (checkNode.value == 0) {
                checkNode.value = 1;
            } else {
                checkNode.value += 1;
            }
            return checkNode;
        }

        // Iteratively add nodes in order to store the whole key
        checkNode.children[key.charAt(index)] = put2(checkNode.children[key.charAt(index)], key, index + 1);

        return checkNode;

    }

    public int get(String key) {
        Node node = get2(root, key, 0);
        if (node == null){
            return 0;
        }
        // take value from last node
        return node.value;
    }

    public Node get2(Node checkNode, String key, int index) {
        if (checkNode == null) {
            return null;
        }
        // return Last node if we at the end at screen
        if (index == key.length()) {
            return checkNode;
        }

        // recursively search until we either reach null or value
        return get2(checkNode.children[key.charAt(index)], key, index + 1);

    }

    public int count (String prefix){
        Node pre = get2(root, prefix, 0);

        return count2(pre);
    }

    public int count2 (Node prefix){
        if (prefix == null) return 0;
        //start with first value of the prefix key.
        int count = prefix.value;
        // go through all possible ascci characters and find the value of each of their children
        for (char i = 0; i < 256; i++){
            count += count2(prefix.children[i]);
        }
        return count;
    }

    public int distinct(String prefix){
        Node pre = get2(root, prefix, 0);

        return distinct2(pre);
    }

    public int distinct2 (Node prefix){
        if (prefix == null){
            return 0;
        }
        int count = 0;
        if (prefix.value > 0){
            count++;
        }
        for (char i = 0; i < 256; i++){
            count += distinct2(prefix.children[i]);
        }
        return count;
    }

}



