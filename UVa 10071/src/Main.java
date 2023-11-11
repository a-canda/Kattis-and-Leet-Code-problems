import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
      int v = sc.nextInt();
      int t = sc.nextInt();
      System.out.println(v * t * 2);
    }
  }
}