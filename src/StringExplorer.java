public class StringExplorer {

    /**
     * Determines the position of a standalone word or phrase in a statement
     * @precondition 
     * @param statement the user statement
     * @param goal the phrase to search for
     * @param startPos the index to start our search with
     * @return the position of goal only if goal is surrounded by whitespace or at the start or end of the statement.
     * Returns -1 otherwise.
     */
    private int findPhrase(String statement, String goal, int startPos)
    {
        // Converts both strings to lowercase to avoid case-sensitive answers
        String phrase = statement.toLowerCase(); 
        goal = goal.toLowerCase();
        // Gets the first index of the goal substring after startPos in phrase
        int position = phrase.indexOf(goal, startPos);
        while (position >= 0)
        {
            String before = " ", after = " "; 
            // Checks if goal is after the start of phrase
            if (position > 0)
            {
                // Creates a substring containing the character before position in phrase
                before = phrase.substring(position - 1, position);
            }
            // Finds the position of the end of goal in phrase
            int endPosition = position + goal.length();
            // Checks if goal ends before the end of phrase
            if (endPosition < phrase.length())
            {
                // Creates a substring containing the character after the end of goal in phrase
                after = phrase.substring(endPosition, endPosition + 1);
            }

            /* Exercise: Determine the values of index, before, and after at this point in the method. */
            // Checks if before or after are alphabetical characters.If not, return position.
            if (((before.compareTo("a") < 0) || (before.compareTo("z") > 0)) && 
                ((after.compareTo("a") < 0) || (after.compareTo("z") > 0)))
            {
                return position;
            }
            // If we don't return a valid position, search the phrase for the next occurrence of the goal substring
            position = phrase.indexOf(goal, position + 1);
        }
        // if the new indexOf goal is -1 (goal not found), return -1
        return -1;
    }
}
