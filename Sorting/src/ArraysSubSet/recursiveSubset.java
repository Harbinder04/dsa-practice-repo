package ArraysSubSet;

import java.util.ArrayList;
import java.util.List;

    public class recursiveSubset {
        public static List<List<Integer>> subSet(int[] arr) {
            List<List<Integer>> subsets = new ArrayList<>();
            generateSubsets(arr, 0, new ArrayList<>(), subsets);
            return subsets;
        }

        private static void generateSubsets(int[] arr, int index, List<Integer> currentSubset, List<List<Integer>> subsets) {
            // Add the current subset to the list of subsets
            subsets.add(new ArrayList<>(currentSubset));

            // Recursively generate subsets by adding the elements from 'index' onwards
            for (int i = index; i < arr.length; i++) {
                currentSubset.add(arr[i]);
                generateSubsets(arr, i + 1, currentSubset, subsets);
                currentSubset.remove(currentSubset.size() - 1);
            }
        }

        public static void main(String[] args) {
            int[] arr = {1, 2, 3};
            List<List<Integer>> result = subSet(arr);
            System.out.println(result);
        }
    }
