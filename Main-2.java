/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    public static int rotated_binary_search(int A[], int N, int key) {
  int L = 0;        //l declear as low 
  int R = N - 1;    // R declare as high

  while (L <= R) {
    // Avoid overflow, same as M=(L+R)/2
    int M = L + ((R - L) / 2);
    if (A[M] == key) return M;

    // the bottom half is sorted
    if (A[L] <= A[M]) {
      if (A[L] <= key && key < A[M])
        R = M - 1;
      else
        L = M + 1;
    }
    // the upper half is sorted
    else {
      if (A[M] < key && key <= A[R])
        L = M + 1;
      else
        R = M - 1;
    }
  }
  return -1;
}
    
	public static void main(String[] args) {
	int arr[]={60,50,10,20,30,40};
	int n=arr.length;
	int key=20;
	int p=rotated_binary_search(arr,n,key);
	System.out.print("finding element position at index: " + p);
	}
}
