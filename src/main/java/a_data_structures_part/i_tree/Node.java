package a_data_structures_part.i_tree;

public class Node {

    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }
}
