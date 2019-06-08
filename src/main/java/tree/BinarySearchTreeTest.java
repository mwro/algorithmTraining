package tree;

public class BinarySearchTreeTest<T extends Comparable<T>> {

    public static void main(String... args) {
        int[] array = new int[]{15, 10, 12, 3, 1, -1, 15, 30, 20, 44, 44, 1000};

        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        for (int i : array) {
            bst.insert(i);
        }
    }
}
