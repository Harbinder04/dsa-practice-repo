import SEGMENT_TREE.Segment_Tree;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 7, 10, 13};
        Segment_Tree tree = new Segment_Tree(arr);
        int ans = tree.query(2, 6);
        System.out.println(ans);
    }
}