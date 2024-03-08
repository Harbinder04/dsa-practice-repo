package Segment_Tree;

public class Tree {
    public static void main(String[] args) {
        Tree tree = new Tree();
        int[] arr = {1, 2, 3, 5, 6, 8, -9};
        tree.Tree(arr);
    }

    static class Node {
        protected int data;
        protected int startIndex;
        protected int endIndex;
        protected Node right;
        protected Node left;

        public Node(int startIndex, int endIndex) {
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }
    }

    Node root;

    public void Tree(int[] arr) {
        this.root = cunstructTree(arr, 0, arr.length - 1);
    }

    // this will take O(N) complexity because finding the data of each node.
    private Node cunstructTree(int[] arr, int starIndex, int endIndex) {
        if (starIndex == endIndex) {
            Node node = new Node(starIndex, endIndex);
            node.data = arr[starIndex];
            return node;
        }
        Node node = new Node(starIndex, endIndex);
        int mid = (starIndex + endIndex) / 2;
        node.left = cunstructTree(arr, 0, mid);
        node.right = cunstructTree(arr, mid + 1, arr.length - 1);
        node.data = node.left.data + node.right.data;  // in addition, only
        return node;
    }

    public void display() {
        display(this.root);
    }

    private void display(Node node) {
        String str = "";
        // for left node
        if (node.left != null) {
            str = str + "Interval= [" + node.left.startIndex + "-" + node.left.endIndex + "] and data =" + node.left.data;
        } else {
            str = str + "No left child";
        }

        // for current node
        str = str + "Interval= [" + node.startIndex + "-" + node.endIndex + "] and data =" + node.data;

        // for right node
        if (node.right != null) {
            str = str + "Interval= [" + node.right.startIndex + "-" + node.right.endIndex + "] and data =" + node.right.data;
        } else {
            str = str + "No right child";
        }
        System.out.println(str);

        if (node.left != null) {
            display(node.left);
        }
        if (node.right != null) {
            display(node.right);
        }
    }

    public int query(int qStart, int qEnd) {
        return query(this.root, qStart, qEnd);
    }

    private int query(Node node, int qStart, int qEnd) {
        if (node.startIndex >= qStart && node.endIndex <= qEnd) {  // case -1 - completely in between
            return node.data;
        }
        if (node.endIndex < qStart || node.startIndex > qEnd) { // completely outside
            return 0;
        } else {  // other case
            return query(node.left, qStart, qEnd) + query(node.right, qStart, qEnd);
        }
    }

    // updating the existing node.
    public void update(int data, int index){
        this.root.data = update(this.root, data, index);
        return;
    }

    public int update(Node node, int value, int index){
        if (index >= node.startIndex && index <= node.endIndex){
            if (index == node.startIndex && index == node.endIndex) {
                node.data = value;
                return node.data;
            }else{
                int left = update(node.left, value, index);
                int right = update(node.right, value, index);
                node.data = left + right;
            }
        }
        return node.data;
    }
}
