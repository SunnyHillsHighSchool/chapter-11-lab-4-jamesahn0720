//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

class StringRemover
{
   private String remove;
   private String sentence;
	
	   public StringRemover(String sen, String rem) {

                 remove = rem;

                  sentence = sen;

              }

	public void removeStrings()
	{
		int index = sentence.indexOf(remove);
    while(index>=0)
    {
      if(index>0)
      {
        sentence = sentence.substring(0,index-1)+ sentence.substring(index+remove.length());
      }else{
        sentence = sentence.substring(index+remove.length());
      }
      index = sentence.indexOf(remove);

    }
	}

	public String toString()
	{
	String s = sentence + " - String to remove "+remove+ " ";
    removeStrings();
    s = s+sentence;
		return s;
	}
}
