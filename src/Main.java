import java.util.HashMap;
import java.util.Map;
import java.lang.*;
import java.util.*;
public class Main {

    public static boolean isPossible(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>(), appendfreq = new HashMap<>();
        for (int i : nums)
            freq.put(i, freq.getOrDefault(i,0) + 1);
        for (int i : nums)
        {
            if (freq.get(i) == 0) continue;
            else if (appendfreq.getOrDefault(i,0) > 0)
            {
                appendfreq.put(i, appendfreq.get(i) - 1);
                appendfreq.put(i+1, appendfreq.getOrDefault(i+1,0) + 1);
            }
            else if (freq.getOrDefault(i+1,0) > 0 && freq.getOrDefault(i+2,0) > 0)
            {
                freq.put(i+1, freq.get(i+1) - 1);
                freq.put(i+2, freq.get(i+2) - 1);
                appendfreq.put(i+3, appendfreq.getOrDefault(i+3,0) + 1);
            }
            else return false;
            freq.put(i, freq.get(i) - 1);
        }
        return true;
    }

    public List<Integer> topKFrequent(int[] nums, int k) {
        //返回第K大的元素
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i : nums) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        for (int j =0; j < k; j++)
        {

        }
    }


    public static void main(String[] args)
    {
        int[] test1 = {3,3,3,4,4,4,7,7,7};
        int[] test2 = {1,2,3,3,4,4,5};
        int[] test3 = {1,2,2,3};

        System.out.println("test1:" + isPossible(test1));
        System.out.println("test2:" + isPossible(test2));
        System.out.println("test3:" + isPossible(test3));

    }
}
