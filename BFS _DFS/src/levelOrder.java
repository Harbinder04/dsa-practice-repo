//import javax.swing.tree.TreeNode;
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//
//public class levelOrder {
//    public List<List<Integer>> levelOrder(TreeNode root){
//        List<List<Integer>> result = new ArrayList<>();
//
//        if(root == null){
//            return result;
//        }
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//
//        while (!queue.isEmpty()){
//            int levelSize = queue.size();
//            List<TreeNode> currentLevelList = new ArrayList<>();
//            for(int i = 0; i < levelSize; i++){
//                TreeNode currentNode = queue.poll();
//                currentLevelList.add(currentNode);
//                if(currentNode.children() != null){
//
//                }
//            }
//        }
//    }
//}
