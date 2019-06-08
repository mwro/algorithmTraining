package tree;


public class BinarySearchTreeTest {

    public static void main(String... args) {
        int[] array = new int[]{15, 10, 12, 3, 1, -1, 15, 30, 20, 44, 44, 1000};

        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        for (int i : array) {
            bst.insert(i);
        }

        checkIfContains(bst, 10);
        checkIfContains(bst, -2);
        checkIfContains(bst, -1);
        checkIfContains(bst, 1000);
        checkIfContains(bst, 21);

        System.out.println("Min value: " + bst.findMinValue());
        System.out.println("Max value: " + bst.findMaxValue());

        bst.insert(-2);
        checkIfContains(bst, -2);
        bst.insert(1001);

        System.out.println("Min value: " + bst.findMinValue());
        System.out.println("Max value: " + bst.findMaxValue());
    }

    private static void checkIfContains(BinarySearchTree<Integer> bst, int i) {
        String containsString = bst.contains(i) ? "contains" : "doesn't contain";

        System.out.println("BST " + containsString + " value " + i);
    }
}
