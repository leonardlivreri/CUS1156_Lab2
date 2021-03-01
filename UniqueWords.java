// Leonard Livreri
// 2/28/21
// Homework Lab 2
import java.util.ArrayList;

public class UniqueWords
{
   
   public static int countUnique(ArrayList<String> list)
   {
	  int count = 0;
	  
      for (int i = 0; i < list.size(); i++)
      {		 for (int j = 0; j < list.size(); j++)
		 {
			
		 }
      }
	  return count;
   }

   public static void main(String[] args)
   {
      ArrayList <String> words = new ArrayList<String>();
      words.add("apple");
	  words.add("orange");
	  words.add("blackboard");
	  words.add("apple");
	  words.add("orange");
	  words.add("sun");
	  words.add("moon");
   
	  int unique = countUnique(words);
	  System.out.println(words + " has " + unique + " unique words");
	  System.out.println("The Three Unique words are : " + " apple  & " + " orange " );
   }
}

