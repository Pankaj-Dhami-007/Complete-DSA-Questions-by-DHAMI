public class DiagonalSum {
    static int sum(int[][] arr){
        int sum = 0;
        // for(int i =0; i< arr.length; i++){
        //     for(int j =0; j< arr[0].length; j++){
        //         if(i == j){
        //              sum += arr[i][j];
        //         }
        //         else if(i+j == arr.length-1){
        //             sum += arr[i][j];
        //         }
        //     }
        // }

        for(int i =0; i< arr.length; i++){
            sum = sum +arr[i][i];
            if(i != arr.length-1-i){
                sum = sum +arr[i][arr.length-i-1];
            }
        }
        return sum;
    }
    static void print(int[][] arr){

        for(int i =0; i< arr.length; i++){
            for(int j =0; j< arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

       System.out.println(sum(arr)); 
    }
}
