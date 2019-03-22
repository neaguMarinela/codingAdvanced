package exercise.spiral;

public class Solution {
    static int[][] buildMatrixOfSize(int size) {

        int[][] matrix = new int[size][size];
        int value = 1;
        int from = 0;
        int upto = size;

        while (from <= upto) {
            for (int i = from; i < upto; i++) {
                matrix[from][i] = value++;
            }
            for (int i = from + 1; i < upto; i++) {
                matrix[i][upto - 1] = value++;
            }
            for (int i = upto - 2; i >= from; i--) {
                matrix[upto - 1][i] = value++;
            }
            for (int i = upto - 2; i > from; i--) {
                matrix[i][from] = value++;
            }
            from++;
            upto--;
        }

        return matrix;
    }

    public static void main(String[] args) {

        int n = 3;
        int[][] spiral = buildMatrixOfSize(n);

        for (int i=0; i< n; i++){
            if(i % n == 0) System.out.println("  ");
            for (int j=0; j< n; j++) {
                if(j % n == 0) System.out.println("  ");
                System.out.print(spiral[i][j] + "  ");

            }
        }

    }
}