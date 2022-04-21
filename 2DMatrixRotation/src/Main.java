

public class Main {


    static void transformOperation(int [][] arr,int n) {
        int[][] temp = new int[n][n];

        int row = 0;
        int col = 0;
        int j;
        if(n%2==1)temp[n/2][n/2]=arr[n/2][n/2];
        int k = n - 1;

        while (k > 0) {
            for (j = 0; j < k; j++) {
                temp[row+1][col]=arr[row][col];
                row++;

            }


            for (j = 0; j < k; j++) {
                temp[row][col+1]=arr[row][col];
                col++;
            }


            for (j = 0; j < k; j++) {
                temp[row-1][col]=arr[row][col];
                row--;
            }


            for (j = 0; j < k; j++) {
                temp[row][col-1]=arr[row][col];
                col--;
            }





            k = k - 2;
            row++;
            col++;
        }
        for(int i=0;i<n;i++){
            for(j=0;j<n;j++)arr[i][j]=temp[i][j];
        }


        for (int i = 0; i < n; i++) {

            for (j = 0; j < n; j++) System.out.print(arr[i][j] + " ");
            System.out.println("\n");
        }
        System.out.println("________________________________________________");


    }

    static void transform(int [][] arr,int n,int time){

        for(int i=0;i<time;i++){
            transformOperation(arr,n);
        }

    }
    public static void main(String[] args) {

        int [][]nums= {
                {10,11,12,13,14},
                {15,16,17,18,19},
                {20,21,22,23,24},
                {25,26,27,28,29},
                {30,31,32,33,34},
        };
        int [][]nums2= {
                {10,11,12,13},
                {14,15,16,17},
                {18,19,20,21},
                {22,23,24,28},

        };

        transform(nums,5,4);
        //n is size of matrix
        //transform(nums,5);
        int num=12;
        int b=Integer.reverse(num);



    }
}

