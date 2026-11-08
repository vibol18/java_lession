package Array;

public class Array2D {
    //int[][] num = [{},{},{}] [row] [column]
   public static void main(String[] args) {
    String[][] names = {
        {"dara","jonh"},
        {"smith","kak"},
        {"Hello","World","Kon"},
    };
    for (int i =0 ; i<names.length;i++){
        for (int j = 0; j<names[i].length; j++){
            System.out.println(names[i][j]);
        }
    }
    int [][] nums= {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };
    for(int i = 0;i<nums.length; i++){
        for(int j =0; j<nums[i].length; j++){
            System.out.println(""+nums[i]+ ""+ nums[j]);
        }
    }
    // for(int test : num ){
    //     System.out.println(test);
    // }
    // System.out.println(names[0][1]);
    // System.out.println(names[1][0]);
    // System.out.println(names[2][2]);
}
//    for (int i =0; i<name) {
       
//    }
    
}
