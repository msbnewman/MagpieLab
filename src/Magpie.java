/*
 * @author Your Name
 * @author Class Block
 * @since Today's Date mm/dd/yyyy
 */
public class Magpie
{
    /**
     * Pick a default response to use if nothing else fits.
     * >>> You'll edit this code in Magpie1
     * 
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 4;
        int whichResponse = 0;         
        String response = "";

        if (whichResponse == 0)
        {
            response = "Interesting.";
        }
        else if (whichResponse == 1)
        {
            response = "Okay.";
        }
        else if (whichResponse == 2)
        {
            response = "I haven't heard that before.";
        }
        else if (whichResponse == 3)
        {
            response = "What else could you tell me about that?";
        }
        return response;
    }

     /**
     * Get a default greeting 	
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk. Type in \"Bye\" to end our chat.";
    }

    /**
     * Gives a response to a user statement. 
     * >>> You'll edit this code in Magpie2, 3, and 4
     * 
     * @param statement the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";        
        response = getRandomResponse();       
        return response;
    }

    /**
     * Removes all punctuation at or after a given index in a string. 
     *   Characters to remove include:
     *   {}[]|\~`!@#$%^&*()_-+=""'':;<>,.?/
     * 
     * @param str a string possibly containing punctuation
     * @param index position to start punctuation removal
     * @return str with all punctuation at or after index removed. 
     * 
     */

    private String removePunctuation(String str, int index) {
        return str.substring(0, index) + str.substring(index).replaceAll("[^a-zA-Z0-9\\s]", "");
    }

    /***************** INSERT findPhrase HERE ********************/

    /**
     * Gives responses that transform statements with the format "I want *something*"
     *  >>> You'll edit this code in Magpie3
     * 
     * @param statement a user statement containing the phrase "I want"
     * @return a response that transforms the user statement 
     * to the form "Why do you want ..."
     */
    private String transformIWant(String statement) {
        return "";
    }

    /**
     * Gives responses that transform statements with the format "I like *something*"
     * >>> You'll edit this code in Magpie3 and Magpie4
     * 
     * @param statement a user statement containing the phrase "I like"
     * @return a response that transforms the user statement 
     * to the form "What do you like about ..."
     */
    private String transformILike(String statement) {
        return "";
    }

    /**
     * Gives responses that transform statements with the format "I *something* you"
     * >>> You'll edit this code in Magpie4
     * 
     * @param statement a user statement with the format "I ... you"
     * @return a response that transforms the user statement 
     * to the form "Why do you ... me?"
     */
    private String meAndYou(String statement) {
        return "";
    }

    /**
     * Gives responses that transform statements with the format "I don't *something*"
     * >>> You'll edit this code in Magpie4
     * @param statement a user statement containing the phrase "I don't"
     * @return a response that transforms the user statement to the form 
     * "Why don't you ... ?"
     */
    private String whyNot(String statement) {
        return "";
    }

}
