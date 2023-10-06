package String;

public class CapitalizeWords 
{
    public static void main(String[] args)
    {
        String input = "hello world! this is a test.";
        String capitalized = capitalizeWords(input);
        System.out.println(capitalized);
    }
    
    public static String capitalizeWords(String input)
    {
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;
        
        for (char c : input.toCharArray()) 
        {
            if (Character.isWhitespace(c)) 
            {
                capitalizeNext = true;
            } 
            else if (capitalizeNext) 
            {
                c = Character.toUpperCase(c);
                capitalizeNext = false;
            } 
            else
            {
                c = Character.toLowerCase(c);
            }
            result.append(c);
        }
        
        return result.toString();
    }
}
