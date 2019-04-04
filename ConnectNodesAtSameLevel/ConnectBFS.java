package ConnectNodesAtSameLevel;

import java.util.LinkedList;
import java.util.Queue;

class ConnectBFS {

    // Node class
    static class Node {

        int data;
        Node left, right, nextRight;

        Node(int data) {
            this.data = data;
            left = right = nextRight = null;
        }
    }

    // set nextRight of all nodes of a tree
    private static void connect(Node root) {

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        // null marker to represent the end of the current level
        q.add(null);

        while (!q.isEmpty()) {

            Node p = q.peek();
            q.remove();

            if (p != null) {
                p.nextRight = q.peek();

                // push left and right child of current node in the queue
                if (p.left != null)
                    q.add(p.left);
                if (p.right != null)
                    q.add(p.right);

            } else if (!q.isEmpty()) {
                q.add(null);
            }

        }
    }

    // driver method
    public static void main(String[] args) {

        // construct a binary tree
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.right.right = new Node(90);

        // point nextRight in all nodes
        connect(root);

        System.out.println("Answer");
        System.out.println(root.data + "-->" + ((root.nextRight) != null ? root.nextRight.data : -1));
        System.out.println(root.left.data + "-->" + ((root.left.nextRight) != null ? root.left.nextRight.data : -1));
        System.out.println(root.right.data + "-->" + ((root.right.nextRight) != null ? root.right.nextRight.data : -1));
        System.out.println(root.left.left.data + "-->"
                + ((root.left.left.nextRight) != null ? root.left.left.nextRight.data : -1));
        System.out.println(root.right.right.data + "-->"
                + ((root.right.right.nextRight) != null ? root.right.right.nextRight.data : -1));
    }

}
