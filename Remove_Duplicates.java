import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
public class Remove_Duplicates {
  public static void main(String[] args){
    int[] nums = {1,2,3,1,2,4,5};

    Set<Integer> set = new LinkedHashSet<>();
    for(int num : nums){
      set.add(num);
    }
    Integer[] result = set.toArray(new Integer[set.size()]);
    System.out.println(Arrays.toString(result));

  }
}

//Linked hashset used to take correct order output because it not handel the duplicates elements.