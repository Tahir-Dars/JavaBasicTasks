#This Java program prints a right-hand pyramid of '$' characters and a left-hand pyramid of '*' characters.
public class PrintingPyramids {
    public static void main(String[] args) {
          int k=5;
        System.out.println("Right hand Pyramid");
          for(int i=1;i<=k;i++){
              for(int j=1;j<=i;j++){
                  System.out.print("$");
              }
              System.out.println();
          }
        System.out.println("Left hand Pyramid");
        for (int i = 1; i <=k; i++) {
            for (int j = k; j >= 1; j--) {
                if (j > i) {
                    System.out.print("  "); 
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
