class Main {
  public static void main(String[] args) {
   StringRemover test1 = new StringRemover("xR-MxR-MHelloxR-M", "R-M");
      System.out.println(test1);
      StringRemover test2 = new StringRemover("sxsssxssxsxssexssxsesss", "xs");
      System.out.println(test2);
       StringRemover test3 = new StringRemover("fuxqwexqwertyxqwexqwertyrtyxqwertyrtyn", "qwerty");
       System.out.println(test3);
      StringRemover test4 = new StringRemover("dogdogcatddodogdogdoggog", "dog");
      System.out.println(test4);
  }
}
