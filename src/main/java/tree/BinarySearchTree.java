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
        insert(nodeToInsert);
    }

    public void insert(BinarySearchTree<T> nodeToInsert) {

        int compare = compareTo(nodeToInsert);

        if (compare == 0) {
            return;
        }

        if (compare < 0) {
            if (rightNode == null) {
                rightNode = nodeToInsert;
                nodeToInsert.parentNode = this;
            } else {
                rightNode.insert(nodeToInsert);
            }
        } else {
            if (leftNode == null) {
                leftNode = nodeToInsert;
                nodeToInsert.parentNode = this;
            } else {
                leftNode.insert(nodeToInsert);
            }
        }
    }
}
