package TestBinarySearchTree;

import BinarySearchTree.BST;
import org.omg.CORBA.AnyHolder;

public class TestBST {
    public static void main(String[] args) {

        BST<String> tree = new BST<>();
        tree.insert("Anh");
        tree.insert("Bình");
        tree.insert("Cường");
        tree.insert("Dung");
        tree.insert("Giang");
        tree.insert("Hà");
        tree.insert("Kiên");

        System.out.println("Inorder (sorted): ");
        tree.inorder();
        System.out.println("The number of nodes is: " + tree.getSize());

        System.out.println(tree.search("Minh"));
        System.out.println(tree.search("Anh"));
        System.out.println(tree.search("Hà"));
        System.out.println(tree.search("Kiên"));
        System.out.println( tree.insert("Giang"));

    }
}
