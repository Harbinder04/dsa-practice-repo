import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        BinaryTree tree = new BinaryTree();
//        tree.populate(scanner);
//        tree.display();
//        tree.prettyDisplay();

//        BST tree = new BST();
//        int[] nums = {1,2 ,3 , 4, 5, 6, 7};
//        tree.populateSorted(nums);
//        tree.display();

//        AVL tree = new AVL();
//
//        for(int i = 0; i < 1000; i++){
//            tree.insert(i);
//        }
//        System.out.println(tree.height());

       String str ;
       Scanner sc = new Scanner(System.in);
       str = sc.nextLine();
        LongStrToNum(str);
    }
    public static void LongStrToNum(String string){
        String str = string;
        int num = 0;
        if (str.length()>10){
            for(int i = 1; i < str.length()-1; i++){
                num++;
            }
            System.out.println(str.charAt(0)+String.valueOf(num)+str.charAt(num-1));
        }else{
            System.out.println(str);
        }
    }
}