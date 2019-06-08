package tree;

public class BinarySearchTree<T extends Comparable<T>> {

    private T key;

    private BinarySearchTree<T> parentNode;
    private BinarySearchTree<T> leftNode;
    private BinarySearchTree<T> rightNode;

    public BinarySearchTree() {

    };

    public BinarySearchTree(T key) {
        this.key = key;
    }

    private int compareTo(BinarySearchTree<T> o) {
        return key.compareTo(o.key);
    }

    public void insert(T element) {
        if (key == null) {
            key = element;
        }

        BinarySearchTree<T> nodeToInsert = new BinarySearchTree<>(element);
        insert(this, nodeToInsert);
    }

    public BinarySearchTree<T> insert(BinarySearchTree<T> possibleParent, BinarySearchTree<T> nodeToInsert) {
        if(possibleParent == null) {
            return nodeToInsert;
        }

        int compare = possibleParent.compareTo(nodeToInsert);

        if (compare < 0) {
            possibleParent.rightNode = insert(possibleParent.rightNode, nodeToInsert);
        } else if (compare > 0) {
            possibleParent.leftNode = insert(possibleParent.leftNode, nodeToInsert);
        }

        return possibleParent;
    }


}
