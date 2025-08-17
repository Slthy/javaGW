/*
            SAMPLE ASSESSMENT2_3
*/

public class Assess2_3_Sample{

  public static String checkEdge(int width, int height, int tile1, int tile2){
    int row1 = (tile1 - 1) / width;
    int row2 = (tile2 - 1) / width;

    int col1 = (tile1 - 1) % width;
    int col2 = (tile2 - 1) % width;

    if (row1 == row2) {
      if ((tile1 == (tile2-1)) || (tile1 == (tile2 + 1))) return "edge";
    }
    if (col1 == col2) {
      if ((tile1 == (tile2-width)) || (tile1 == (tile2 + width))) return "edge";
    }
    return "not edge";
  }

  public static void main(String[] args){
    System.out.println("test1: " + checkEdge(1,1,1,1).equals("not edge"));
    System.out.println("test2: " + checkEdge(1,2,1,1).equals("not edge"));
    System.out.println("test3: " + checkEdge(1,2,1,2).equals("edge"));
    System.out.println("test4: " + checkEdge(1,2,2,1).equals("edge"));
    System.out.println("test5: " + checkEdge(1,2,2,2).equals("not edge"));
    System.out.println("test6: " + checkEdge(2,1,1,1).equals("not edge"));
    System.out.println("test7: " + checkEdge(2,1,1,2).equals("edge"));
    System.out.println("test8: " + checkEdge(2,1,2,1).equals("edge"));
    System.out.println("test9: " + checkEdge(2,1,2,2).equals("not edge"));
    System.out.println("test10: " + checkEdge(2,2,1,2).equals("edge"));
    System.out.println("test11: " + checkEdge(2,2,1,3).equals("edge"));
    System.out.println("test12: " + checkEdge(2,2,1,4).equals("not edge"));
    System.out.println("test13: " + checkEdge(2,2,2,1).equals("edge"));
    System.out.println("test14: " + checkEdge(2,2,2,3).equals("not edge"));
    System.out.println("test15: " + checkEdge(2,2,2,4).equals("edge"));
    System.out.println("test16: " + checkEdge(2,2,3,1).equals("edge"));
    System.out.println("test17: " + checkEdge(2,2,3,2).equals("not edge"));
    System.out.println("test18: " + checkEdge(2,2,3,4).equals("edge"));
    System.out.println("test19: " + checkEdge(2,2,4,1).equals("not edge"));
    System.out.println("test20: " + checkEdge(2,2,4,2).equals("edge"));
    System.out.println("test21: " + checkEdge(2,2,4,3).equals("edge"));
    System.out.println("test22: " + checkEdge(2,3,1,2).equals("edge"));
    System.out.println("test23: " + checkEdge(2,3,1,3).equals("edge"));
    System.out.println("test24: " + checkEdge(2,3,1,4).equals("not edge"));
    System.out.println("test25: " + checkEdge(2,3,1,5).equals("not edge"));
    System.out.println("test26: " + checkEdge(2,3,1,6).equals("not edge"));
    System.out.println("test27: " + checkEdge(2,3,2,1).equals("edge"));
    System.out.println("test28: " + checkEdge(2,3,2,3).equals("not edge"));
    System.out.println("test29: " + checkEdge(2,3,2,4).equals("edge"));
    System.out.println("test30: " + checkEdge(2,3,2,5).equals("not edge"));
    System.out.println("test31: " + checkEdge(2,3,2,6).equals("not edge"));
    System.out.println("test32: " + checkEdge(2,3,3,4).equals("edge"));
    System.out.println("test33: " + checkEdge(2,3,3,5).equals("edge"));
    System.out.println("test34: " + checkEdge(2,3,3,6).equals("not edge"));
    System.out.println("test35: " + checkEdge(2,3,4,5).equals("not edge"));
    System.out.println("test36: " + checkEdge(2,3,4,6).equals("edge"));
    System.out.println("test37: " + checkEdge(2,3,5,6).equals("edge"));
    System.out.println("test38: " + checkEdge(3,2,1,2).equals("edge"));
    System.out.println("test39: " + checkEdge(3,2,1,3).equals("not edge"));
    System.out.println("test40: " + checkEdge(3,2,1,4).equals("edge"));
    System.out.println("test41: " + checkEdge(3,2,1,5).equals("not edge"));
    System.out.println("test42: " + checkEdge(3,2,1,6).equals("not edge"));
    System.out.println("test43: " + checkEdge(3,2,2,1).equals("edge"));
    System.out.println("test44: " + checkEdge(3,2,2,3).equals("edge"));
    System.out.println("test45: " + checkEdge(3,2,2,4).equals("not edge"));
    System.out.println("test46: " + checkEdge(3,2,2,5).equals("edge"));
    System.out.println("test47: " + checkEdge(3,2,2,6).equals("not edge"));
    System.out.println("test48: " + checkEdge(3,2,3,4).equals("not edge"));
    System.out.println("test49: " + checkEdge(3,2,3,5).equals("not edge"));
    System.out.println("test50: " + checkEdge(3,2,3,6).equals("edge"));
    System.out.println("test51: " + checkEdge(3,2,4,5).equals("edge"));
    System.out.println("test52: " + checkEdge(3,2,4,6).equals("not edge"));
    System.out.println("test53: " + checkEdge(2,3,5,6).equals("edge"));

  }

}