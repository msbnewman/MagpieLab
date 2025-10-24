public class StringExplorer {

    /**
     * Determines the position of a standalone word or phrase in a statement
     * 
     * @param statement the user statement
     * @param goal the phrase to search for
     * @param startPos the index to start our search with
     * @return the position of goal only if goal is surrounded by whitespace or at the start or end of the statement.
     * Returns -1 otherwise.
     */
    public int findPhrase(String statement, String goal, int startPos)
    {
        // What do the following two lines do? Why?
        String phrase = statement.toLowerCase(); 
        goal = goal.toLowerCase();
        // What does the variable position represent?
        int position = phrase.indexOf(goal, startPos);
        // What does this loop do?
        while (position >= 0)
        {
            String before = " ", after = " "; 
            if (position > 0)
            {
                //
                before = phrase.substring(position - 1, position);
            }
            if (position + goal.length() < phrase.length())
            {
                after = phrase.substring(position + goal.length(),
                position + goal.length() + 1);
            }

        /* determine the values of index, before, and after at this point in the method. */
            if (((before.compareTo("a") < 0) || (before.compareTo("z") > 0)) && 
                ((after.compareTo("a") < 0) || (after.compareTo("z") > 0)))
            {
                return position;
            }
            position = phrase.indexOf(goal, position + 1);
        }
        return -1;
    }
}
