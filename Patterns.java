import java.io.*;


public class Patterns {
  public static void RightTriangle(int rows) {
    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= i; j++) { 
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  public static void InvertedRightTriangle(int rows) {
    for (int i = 0; i <= rows; i++) {
      for (int j = rows; j > i; j--) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  public static void Pyramid(int rows) {
    for (int i = 1; i <= rows; i++) {
      for (int j = rows; j > i; j--) {
        System.out.print(" ");
      }

      for (int k = 1; k <= (2 * i - 1); k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void InvertedPyramid(int rows) {
    for (int i = rows; i >= 1; i--){ 
      for (int j = i; j < rows; j++){
        System.out.print(" ");
      }
      for (int k = 1; k <= (2 * i -1); k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void Diamond(int rows) {
    for (int i = 1; i <= rows; i++) {
      for (int j = rows; j > i; j--) {
        System.out.print(" ");
      }
      
      for (int k = 1; k <= (2 * i - 1); k++) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (int i = rows - 1; i >= 1; i--){ 
      for (int j = i; j < rows; j++){
        System.out.print(" ");
      }
      for (int k = 1; k <= (2 * i -1); k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void HollowSquare(int rows) {

    for (int i = 1; i <= rows; i++){
      for (int j = 1; j <= rows; j++) {
        if (i == 1 || i == rows || j == 1 || j == rows) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    out.print("How many rows do you want?: "); out.flush();
    int rows = Integer.parseInt(br.readLine());
  
    out.print("Choose what patterns you want?: \n1. Right Triangle\n2. Inverted Triangle\n3. Pyramid\n4. Inverted Pyramiid\n5. Diamond\n6. HollowSquare\nYour choice: "); out.flush();
    int pattern = Integer.parseInt(br.readLine());

    switch (pattern) {
      case 1:
          RightTriangle(rows);
        break;
      case 2:
          InvertedRightTriangle(rows);
        break;
      case 3:
          Pyramid(rows);
        break;
      case 4:
          InvertedPyramid(rows);
        break;
      case 5:
          Diamond(rows);
        break;
      case 6:
          HollowSquare(rows);
        break;
    
      default:
        break;
    }
  }
}
