import java.util.Arrays;

public class Tester{
  public static void main(String[] args){
    int[]arr1Empty=new int[0];
    int[][]arr2Empty=new int[0][];
    //int[][]arr2Empty1=new int[1][0];
    int[]arrSingle=new int[1];
    int[]arr1={0,1,2,1,-5};
    int[][]A={{  1,  0, 12, -1 },
              {  7, -2,  2,  1 },
              { -5, -2,  2, -9 }};
    int[]B={  1, 3, 5 };
    int[][]rowNotColMagic={{  1,  2, 3, 4 },
                           {  2, 3,  4,  1 },
                           { 3, 4,  1, 2 }};
    int[][]colNotRowMagic={{  1,  1, 1 },
                           {  2, 2, 2 },
                           { 3,  3, 3 } };
    int[][]rowAndColMagic={{  2,  2, 2 },
                           {  2, 2, 2 } };
    int[][]E={{  2,  4, 2 },
              {  2, 2, 2 } };
    System.out.println(ArrayOps.sum(arr1));
    System.out.println(ArrayOps.sum(arr1Empty));
    System.out.println(ArrayOps.largest(arr1));
    System.out.println(ArrayOps.largest(arrSingle));
    System.out.println(Arrays.toString(ArrayOps.sumRows(arr2Empty)));
    System.out.println(Arrays.toString(ArrayOps.sumRows(A)));
    //  expected: [12, 8, -14]
    System.out.println(Arrays.toString(ArrayOps.largestInRows(A)));
    //  expected: [12, 7, 2]
    System.out.println(ArrayOps.sum(B));
    //  expected: 9
    System.out.println(ArrayOps.sum(A));//this calls the overloaded 2d array version!
    //  expected: 6
    System.out.println(ArrayOps.sum(arr2Empty));
    System.out.println(Arrays.toString(ArrayOps.sumCols(A)));
    //  expected: [3, -4, 16, -9]
    //System.out.println(Arrays.toString(arr2Empty1));
    //System.out.println(ArrayOps.sumCols(arr2Empty1));
    System.out.println(ArrayOps.isRowMagic(rowNotColMagic));
    //  expected: true
    System.out.println(ArrayOps.isRowMagic(colNotRowMagic));
    //  expected: false
    System.out.println(ArrayOps.isRowMagic(rowAndColMagic));
    //  expected: true
    System.out.println(ArrayOps.isColMagic(rowNotColMagic));
    //  expected: false
    System.out.println(ArrayOps.isColMagic(colNotRowMagic));
    //  expected: true
    System.out.println(ArrayOps.isColMagic(rowAndColMagic));
    //  expected: true
    System.out.println(ArrayOps.isLocationMagic(E,0,1));
    //  expected: false
    System.out.println(ArrayOps.isLocationMagic(E,1,1));
    //  expected: true
    System.out.println(ArrayOps.isRowMagic(arr2Empty));
  }
}
