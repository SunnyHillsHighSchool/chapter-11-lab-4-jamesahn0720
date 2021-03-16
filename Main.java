class Main {
  public static void main(String[] args) {
       StringRemover stringRemover = new StringRemover("xR-MxR-MHelloxR-M","R-M");

                           System.out.println(stringRemover);

                           System.out.println(stringRemover.removeStrings());

                            stringRemover.setRemover("sxsssxssxsxssexssxsesss", "xs");

                           System.out.println("\n\n"+stringRemover);

                           System.out.println(stringRemover.removeStrings());

                            stringRemover.setRemover("fuxqwexqwertyxqwexqwertyrtyxqwertyrtyn","qwerty");

                           System.out.println("\n\n"+stringRemover);

                           System.out.println(stringRemover.removeStrings());
  }
}
