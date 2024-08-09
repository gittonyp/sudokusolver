public class Main {
    public static void main(String[] args) {

        int arr[][]={{0 ,2,1},
                     {2,0,3},
                     {1 ,3 ,0}
       };
        solve(arr,0,0);

    }
    static void solve(int arr[][],int i,int j){
        if (i==3){
            print(arr);
            return;
        }
        if (arr[i][j]==0){
            for (int k = 1; k < 4; k++) {
            arr[i][j]=k;
            int a=check(arr, i, j);
            if (a==1){
                if (j==2){
                    solve(arr, i+1, 0);
                }else{
                solve(arr, i, j+1);
            }}
            }
            arr[i][j]=0;
            return;
        } else {
            if (j==2) {
                solve(arr, i + 1, 0);
            }else {
                solve(arr, i, j+1);
            }
        }
    }
    static int check(int arr[][],int i,int j){
        for (int k = 0; k < arr.length; k++) {
            if (arr[i][k]==arr[i][j] && j!=k && arr[i][k]!=0){
                return -1;
            }
        }
        for (int k = 0; k < arr.length; k++) {
            if (arr[k][j]==arr[i][j] && i!=k && arr[k][j]!=0){
                return -1;
            }
        }
        return 1;
    }
    static void print(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(

            );
        }
    }
}