package Maps;

import java.util.HashMap;
import java.util.Map;

public class Maps02 {

    public static void main(String[] args) {

        int z = 3;
        int nums[] = {1, 1, 1, 1, 2, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5};
        Map<Integer, Integer> map = new HashMap<>();

        int count = 1;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count >= 1 && !map.containsKey(nums[i])) {
                map.put(nums[i], count);
            }
            count = 1;

        }
        System.out.println("Map: " + map);
    }
}
