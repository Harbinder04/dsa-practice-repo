class Node {
    protected final int value;
    protected int height;
    protected Node left;
    protected Node right;
    public Node(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
public class AVL {
    private Node root;
    public AVL(){}

    public int height(){
        return height(root);
    }
    public int height(Node node){
        if (node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void insert(int value){
        root = insert(value, root);
    }
    private Node insert(int value, Node node){
        if(node == null){
            node  = new Node(value);
            return node;
        }
        if (value < node.value){
            node.left = insert(value, node.left);
        }
        if (value > node.value){
            node.right = insert(value, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return rotate(node);
    }

    public  void populate(int[] nums){
        for (int i = 0; i < nums.length; i++){
            this.insert(nums[i]);
        }
    }

    public void populateSorted(int[] nums){
        populateSorted(nums, 0, nums.length);
    }

    private void populateSorted(int[] nums, int start, int end){
        if (start >= end){
            return;
        }
        int mid = (start + end)/2;

        this.insert(nums[mid]);
        populateSorted(nums, start, mid);
        populateSorted(nums, mid + 1, end);
    }
    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node){
        if (node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }
    public void display(){
        display(root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if (node == null){
            return;
        }
        System.out.println(details + node.getValue());

        display(node.left, "Left child of "+ node.getValue()+ " : ");
        display(node.right, "Right child of "+ node.getValue()+ " : ");
    }

    private Node rotate(Node node){
        // left heavy case
        if(height(node.left) - height(node.right) > 1){
            // left - left case
            if(height(node.left.left) - height(node.left.right) > 0){
                return rightRotate(node);
            }
            // right - right case
            if(height(node.left.left) - height(node.left.right) < 0){
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        // right heavy case
        if(height(node.left) - height(node.right) < -1){
            // right - right case
            if(height(node.right.left) - height(node.right.right) < 0){
              return leftRotate(node);
            }
            // right - left case
            if(height(node.right.left) - height(node.right.right) > 0){
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    private Node leftRotate(Node node) {
        Node p = node.right;
        Node t = p.left;

        p.left = node;
        node.right = t;

        p.height = Math.max(height(p.left), height(p.right) + 1);
        node.height = Math.max(height(node.left), height(node.right) + 1);
//        p.height = Math.max(height(p.left), height(p.right) + 1); // See why not working
        return p;
    }

    private Node rightRotate(Node node) {
        Node c = node.left;
        Node t = c.right;

        c.right = node;
        node.left = t;

        c.height = Math.max(height(c.left), height(c.right) + 1);
        node.height = Math.max(height(node.left), height(node.right) + 1);
//        c.height = Math.max(height(c.left), height(c.right) + 1);  // see why not working

        return c;
    }
}
