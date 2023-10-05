import java.util.Scanner;

public class AddTwoMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();
        
        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        int[][] resultMatrix = new int[rows][columns];
        
        System.out.println("Enter elements of the first matrix:");
        enterMatrixElements(matrix1, scanner);
        
        System.out.println("Enter elements of the second matrix:");
        enterMatrixElements(matrix2, scanner);
        
        // Perform matrix addition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        
        // Display the result matrix
        System.out.println("Resultant Matrix:");
        displayMatrix(resultMatrix);
        
        scanner.close();
    }
    
    public static void enterMatrixElements(int[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }
    
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
