public class ArrayOps{
  public static int sum(int[] arr){
    int sum=0;
    for(int i=0;i<arr.length;i++){
      sum+=arr[i];
    }
    return sum;
  }
  public static int largest(int[] arr){
    int max=arr[0];
    for(int i=0;i<arr.length;i++){
      if (arr[i]>max) max=arr[i];
    }
    return max;
  }
  public static int[] sumRows(int[][] matrix){
    int[]result=new int[matrix.length];
    for(int i=0;i<matrix.length;i++){
      result[i]=sum(matrix[i]);
    }
    return result;
  }
  public static int[] largestInRows(int[][] matrix){
    int[]result=new int[matrix.length];
    for(int i=0;i<matrix.length;i++){
      result[i]=largest(matrix[i]);
    }
    return result;
  }
  public static int sum(int[][] arr){
    int result=sum(sumRows(arr));
    return result;
  }
  public static int[] sumCols(int[][] matrix){
    int[]result=new int[matrix[0].length];
    for(int i=0;i<matrix[0].length;i++){
      int sum=0;
      for(int j=0;j<matrix.length;j++){
        sum+=matrix[j][i];
      }
      result[i]+=sum;
    }
    return result;
  }
  public static boolean isRowMagic(int[][] matrix){
    if(matrix.length<=1) return true;
    int[]sums=sumRows(matrix);
    int match=sums[0];
    for(int i=0;i<sums.length;i++){
      if(sums[i]!=match) return false;
    }
    return true;
  }
  public static boolean isColMagic(int[][] matrix){
    if(matrix.length==0) return true;
    if(matrix[0].length<=1) return true;
    return false;
  }
  public static boolean isLocationMagic(int[][] matrix, int row, int col){
    return false;
  }
}
