package tree;

public class BinarySearchTree<T extends Comparable<T>> {

    private T key;

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

    private BinarySearchTree<T> insert(BinarySearchTree<T> possibleParent, BinarySearchTree<T> nodeToInsert) {
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

    public boolean contains(T value) {
        return search(this, value) != null;
    }

    private BinarySearchTree<T> search(BinarySearchTree<T> node, T value) {
        if (node == null) {
            return null;
        }

        int compare = node.key.compareTo(value);

        if (compare < 0) {
            return search(node.rightNode, value);
        } else if (compare > 0) {
            return search(node.leftNode, value);
        }
        return node;
    }

    public T findMinValue() {
        return findMin().key;
    }

    private BinarySearchTree<T> findMin() {
        if (leftNode == null) {
            return this;
        }
        return leftNode.findMin();
    }

    public T findMaxValue() {
        return findMax().key;
    }

    private BinarySearchTree<T> findMax() {
        if (rightNode == null) {
            return this;
        }
        return rightNode.findMax();
    }
}
