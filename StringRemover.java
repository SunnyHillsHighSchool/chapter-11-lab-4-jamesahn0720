//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

class StringRemover
{
   private String remove;
   private String sentence;
	
	   public StringRemover() {

                 sentence = "";

                    remove = "";

              }

	public StringRemover( String sentence, String remove)
	{
	   this.sentence = sentence;

           this.remove = remove;
	}
	
	 public void setRemover(String s, String rem) {

                    sentence = s;

                     remove = rem;

              }

	public void removeStrings()
	{
		String cleaned = sentence;

                int index = cleaned.indexOf(remove);

                  while (index != -1 && cleaned.length() > 0) {

                  String strBefore = "";

                  if ((index - 1) >= 0) {

                 strBefore = cleaned.substring(0, index - 1);

               } else {

                 strBefore = cleaned.substring(0, index);
		  }
			   String strAfter = cleaned.substring(index + remove.length());

                         cleaned = strBefore + strAfter;

                        index = cleaned.indexOf(remove);

                           }

                           return cleaned;
	}

	public String toString()
	{
		return sentence + " - String to remove" + remove;
	}
}
