public class Q1 {
    public static void main(String[] args) {
        int A[]={1,2,3,4};
        int n = A.length;
        int B[]={5,6,7,8,9};
        int m = B.length;
        int i=0,j=0,k=0;
        int C[]= new int[n+m];
        while (i<n) { 
            C[k++]=A[i++];
        }
        while (j<m) { 
            C[k++]=B[j++];
        }
        System.out.println("Merge array C[] is :");
        for(int value:C){
            System.out.print(value+" ");
        }

    }
    
}
