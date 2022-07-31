public class DiziTranspoz {


            public static void Matrix(int [][] matrix){

                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        System.out.print(matrix[i][j] + "\t");
                    }
                    System.out.println();
                }
            }

            public static int [][] transpoz(int [][]matrix){

                int [][] transpoz = new int[matrix[0].length][matrix.length];
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        transpoz[j][i] = matrix[i][j];
                    }
                }
                return transpoz;
            }


            public static void main(String[] args) {

                int [][] matrix = {{2, 3, 4}, {5, 6, 4}};
                System.out.println("Matris");
                Matrix(matrix);
                System.out.println("Transpoze");
                Matrix(transpoz(matrix));

            }






        }
