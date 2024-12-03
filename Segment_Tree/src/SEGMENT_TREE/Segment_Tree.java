package SEGMENT_TREE;

public class Segment_Tree {
    Node root;
    public static   class  Node {
        int startInterval;
        int endInterval;

        int data = 0;
        Node left;
        Node right;

        public  Node(int startInterval, int endInterval){
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    public Segment_Tree(int[] arr){
        this.root = ConstructTree(0, arr.length-1, arr);
    }

    public Node ConstructTree(int start, int end, int[] arr){
        if(start == end){
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }
        Node node = new Node(start, end);
        int mid = (start + end) /2;
        node.left = this.ConstructTree(start, mid, arr);
        node.right = this.ConstructTree(mid+1, end, arr);
        // for sum between two indexes
//        node.data = node.left.data + node.right.data;
        //for max between 2 indexes
        node.data = Integer.max(node.left.data ,node.right.data);
        //same for min

        return node;
    }

    public int query(int qStrInterval, int qEndInterval){
        return query(this.root, qStrInterval, qEndInterval);
    }

    private int query(Node node, int qStrInterval, int qEndInterval){
        if(node.left == null || node.right == null){
            //problem for min lies here
            return 0;
        }
        if(node.startInterval >= qStrInterval && node.endInterval <= qEndInterval){
            return node.data;
        }else if(node.startInterval > qEndInterval && node.endInterval > qStrInterval){
            return 0;
        }else {
            // for sum
//            return this.query(node.left, qStrInterval, qEndInterval) + this.query(node.right, qStrInterval, qEndInterval);
            // for max
            return Integer.max(this.query(node.left, qStrInterval, qEndInterval),  this.query(node.right, qStrInterval, qEndInterval));
        }
    }

    // display
    public void display() {
        display(this.root);
    }
    private void display(Node node) {
        String str = "";

        if(node.left != null) {
            str = str + "Interval=[" + node.left.startInterval + "-" + node.left.endInterval + "] and data: " + node.left.data + " => ";
        } else {
            str = str + "No left child";
        }

        // for current node
        str = str + "Interval=[" + node.startInterval + "-" + node.endInterval + "] and data: " + node.data + " <= ";

        if(node.right != null) {
            str = str + "Interval=[" + node.right.startInterval + "-" + node.right.endInterval + "] and data: " + node.right.data;
        } else {
            str = str + "No right child";
        }

        System.out.println(str + '\n');

        // call recursion
        if(node.left != null) {
            display(node.left);
        }

        if(node.right != null) {
            display(node.right);
        }
    }

    //Update
    public void update(int index, int value) {
        this.root.data = update(this.root, index, value);
    }
    public int update(Node node, int index, int value){
        if(index >= node.startInterval && index <= node.endInterval)
        {
           if(index == node.startInterval && index == node.endInterval ){
                node.data = value;
                return node.data;
           } else {
               int leftAns = update(node.left, index, value);
               int rightAns = update(node.right, index, value);
               node.data = leftAns + rightAns;
               return node.data;
           }
        }
        return node.data;
    }
}
