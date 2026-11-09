package Trees;
import java.util.Stack;

public class BinarySearchTree {

    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(int value) {

        Node newNode = new Node(value);

        if (root == null) {
            root = newNode;
            return;
        }

        Node current = root;
        Node parent = null;

        while (current != null) {
            parent = current;

            if (value < current.getValue()) {
                current = current.getLeft();
            } else if (value > current.getValue()) {
                current = current.getRight();
            } else {
                System.out.println("Este valor já existe na árvore!");
                return;
            }
        }

        if (value < parent.getValue()) {
            parent.setLeft(newNode);
        } else {
            parent.setRight(newNode);
        }
    }

    public void preOrder() {

        if (root == null) {
            System.out.println("Árvore vazia!");
            return;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node current = stack.pop();

            System.out.print(current.getValue() + " ");

            if (current.getRight() != null) {
                stack.push(current.getRight());
            }

            if (current.getLeft() != null) {
                stack.push(current.getLeft());
            }
        }

        System.out.println();
    }


    public void inOrder() {

        Stack<Node> stack = new Stack<>();
        Node current = root;

        while (current != null || !stack.isEmpty()) {

            while (current != null) {
                stack.push(current);
                current = current.getLeft();
            }

            current = stack.pop();

            System.out.print(current.getValue() + " ");

            current = current.getRight();
        }

        System.out.println();
    }


    public void postOrder() {

        if (root == null) {
            System.out.println("Árvore vazia!");
            return;
        }

        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();

        stack1.push(root);

        while (!stack1.isEmpty()) {

            Node current = stack1.pop();

            stack2.push(current);

            if (current.getLeft() != null) {
                stack1.push(current.getLeft());
            }

            if (current.getRight() != null) {
                stack1.push(current.getRight());
            }
        }

        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop().getValue() + " ");
        }

        System.out.println();
    }


    public void delete(int value) {

        Node current = root;
        Node parent = null;


        while (current != null && current.getValue() != value) {

            parent = current;

            if (value < current.getValue()) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
        }

        if (current == null) {
            System.out.println("Valor não encontrado.");
            return;
        }


        if (current.getLeft() == null && current.getRight() == null) {

            if (current == root) {
                root = null;
            } else if (parent.getLeft() == current) {
                parent.setLeft(null);
            } else {
                parent.setRight(null);
            }
        }


        else if (current.getLeft() == null ||
                current.getRight() == null) {

            Node child;

            if (current.getLeft() != null) {
                child = current.getLeft();
            } else {
                child = current.getRight();
            }

            if (current == root) {
                root = child;
            } else if (parent.getLeft() == current) {
                parent.setLeft(child);
            } else {
                parent.setRight(child);
            }
        }


        else {

            Node successorParent = current;
            Node successor = current.getRight();


            while (successor.getLeft() != null) {
                successorParent = successor;
                successor = successor.getLeft();
            }

            current.setValue(successor.getValue());

            if (successorParent == current) {
                successorParent.setRight(successor.getRight());
            } else {
                successorParent.setLeft(successor.getRight());
            }
        }

        System.out.println("Nó " + value + " excluído!");
    }

    public boolean isEmpty() {
        return root == null;
    }
}
