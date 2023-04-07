public class StringProcessingDemo
{
	public static void main(String[] args) 
	{
		String sentence = "I hate you.";
		int position = sentence.indexOf("hate");
		
		System.out.println("The line of text to be changed is:");;
		System.out.println(sentence);
		String ending = sentence.substring(position + "hate".length());
		
		sentence = sentence.substring(0, position) + "love" + ending;
		System.out.println("I have rephrased that line to read:");
		System.out.println(sentence);
	}
}