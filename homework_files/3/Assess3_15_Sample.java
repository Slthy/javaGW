import java.util.Arrays;

public class Assess3_15_Sample{

  public static int[] separateOddsEvens(int[] arr){
    int[] result = new int[10];
    int resIndex = 0;

    for (int i = 0; i < arr.length; i++) {
      if ((arr[i] % 2) == 1) {
        result[resIndex++] = arr[i];
        arr[i] = 0;

      }
    }
    for(int entry : arr) if (entry != 0) result[resIndex++] = entry;

    return result;
  }

  public static int[] cleanResult(int[] array){
    return Arrays.stream(array).filter(num -> num != 0).toArray();    
  }

  public static void main(String[] args){
      int [] arr1a = {1};
      int [] result1 = {1};
      System.out.println("test1: " + Arrays.equals(cleanResult(separateOddsEvens(arr1a)), result1));
      int [] arr2a = {1, 2};
      int [] result2 = {1, 2};
      System.out.println("test2: " + Arrays.equals(cleanResult(separateOddsEvens(arr2a)), result2));
      int [] arr3a = {2, 1};
      int [] result3 = {1, 2};
      System.out.println("test3: " + Arrays.equals(cleanResult(separateOddsEvens(arr3a)), result3));
      int [] arr4a = {2, 1, 3};
      int [] result4 = {1, 3, 2};
      System.out.println("test4: " + Arrays.equals(cleanResult(separateOddsEvens(arr4a)), result4));
      int [] arr5a = {1, 2, 3, 3};
      int [] result5 = {1, 3, 3, 2};
      System.out.println("test5: " + Arrays.equals(cleanResult(separateOddsEvens(arr5a)), result5));
      int [] arr6a = {7, 1, 2, 3, 2, 4, 1, 3};
      int [] result6 = {7, 1, 3, 1, 3, 2, 2, 4};
      System.out.println("test6: " + Arrays.equals(cleanResult(separateOddsEvens(arr6a)), result6));
      int [] arr7a = {8, 1, 2, 3, 2, 4, 1, 3};
      int [] result7 = {1, 3, 1, 3, 8, 2, 2, 4};
      System.out.println("test7: " + Arrays.equals(cleanResult(separateOddsEvens(arr7a)), result7));
  }

}
 