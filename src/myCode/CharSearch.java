package myCode;


import java.*;

class CharSearch {
  public static void main(String[] args) {
    String str = "I want to work at Microsoft";

    printUnique(str);
  }

  public static void printUnique(String str) {
    boolean[] b = new boolean[256];
    char[] c = str.toCharArray();

    for (int i = 0; i < c.length; i++) {
      if (!b[(int)c[i]]) {
        b[(int)c[i]] = true;
        System.out.print(c[i]);
      }
    }

    System.out.println();
  }
}