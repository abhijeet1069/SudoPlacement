class MatrixAddition{
    public static void main(String[] args) {
        int[][] a = {{7, 7, 3}, {2, 5, 12}};
        int[][] b = {{4, 2, 5}, {6, 4, 45}};
        int[][] c = new int[a.length][a[0].length];
        if (a[0].length == b[0].length && a.length == b.length) { //Both matrices should have same row and column
            for (int i = 0; i < a.length; i++) //row
                for (int j = 0; j < a[0].length; j++) //column
                    c[i][j] = a[i][j] + b[i][j];

            for (int i = 0; i < a.length; i++){
                for (int j = 0; j < a[0].length; j++)
                    System.out.print(c[i][j]+ " ");
                System.out.println();
            }
        }
        else
            System.out.println("Matrix Addition not possible");
    }
}
