public class PatternsMain {
    public static void main(String[] args) {
        pattern6Sanjana(6);
    }



    static void pattern6Sanjana(int n){
        for (int row = 0; row < n; row++) {
            int c = n - row;
            for (int col = 0; col < c; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static int firstNEvenSum(int n){
        int res = 0;
        int evenNum = 2;
        while(n > 0) {
            res += evenNum;
            evenNum += 2;
            n--;
        }
        return res;
    }

    static void pattern9(int n){
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern31(int n){
        int originalN = n;
        n = 2*n-2;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex + "  ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n){
        for (int row = 1; row < 2*n; row++) {
            int c = row > n ? 2*n-row : row;
            int c2 = n - c;
            for (int spaces = 0; spaces < c2; spaces++) {
                System.out.print("  ");
            }
            for (int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col2 = 2; col2 <= c; col2++) {
                System.out.print(col2 + " ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n){
        for (int row = 1; row < n+1; row++) {
            int space = row > n ? row : n-row;
            for (int spaces = 0; spaces < space; spaces++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col2 = 2; col2 < row+1; col2++) {
                System.out.print(col2 + " ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n){
        for (int row = 0; row < 2*n; row++) {
            int c = row > n ? 2*n-row : row;
            int c2 = n - c;
            for (int col2 = 0; col2 < c2; col2++) {
                System.out.print(" ");
            }
            for (int col = 0; col < c; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int row = 0; row < 2*n; row++) {
            int c = row > n ? 2*n-row : row;
            for (int col = 0; col < c; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern1(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n-row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int row = 1; row < n+2; row++) {
            for (int col = 1; col < row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col < n - row; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print("  ");
            }
            for (int col = 0; col < n-row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
        int maxRows = (n%2==0) ? n+4 : n+5;
        for (int row = 1; row <= maxRows; row++) {
            if (row % 2 != 0) {  // Check if the row number is odd
                // Print leading spaces
                int space = (maxRows - row)/2;
                for (int col = 0; col < space; col++) {
                    System.out.print(" ");
                }
                for (int col = 0; col < row; col++) {
                    System.out.print("*");
                }

                // Move to the next line after each row
                System.out.println();
            }
        }
    }


}
