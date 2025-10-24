# MagpieLab

## Magpie0: Project Setup
Create a directory in your APCS folder called MagpieLab.  
><code>cd Desktop/APCS/</code>  
><code>mkdir MagpieLab/</code>  

Step into that directory.  
><code>cd MagpieLab</code>  

Clone your MagpieLab.
><code>git clone **insertlablinkhere**</code>  

## Magpie1: Random Response
Open the Magpie.java file.  

Currently the code has four responses, but a few more would make the chatbot better. **Modify the getRandomResponse() method so that it adds two more noncommittal responses.**  

Currently the code will only print out the first random response, "Interesting." **Change the whichResponse assignment statement in the getRandomResponse() method so it assigns a random number greater than or equal to 0 and less than 6.**  

## Magpie2: Custom Keyword Response 
Open the Magpie.java file.  

Now that we have six random responses, let’s make some responses that sound more like human responses. Looking for keywords will help create a more custom response.  
  
**Modify the getResponse() method to do the following:**  

1. Have it respond “Is that your favorite class?” when the statement contains the key words “math” or “science.”  
  For example, a possible statement and response would be: 
> Statement: I go to math after lunch.  
> Response: Is that your favorite class?
**Bonus: Make it respond to additional class-related key words: "biology", "bio", "chemistry", "chem", etc.**  
2. Have it respond “Tell me more about your pets” when the statement contains the word “dog” or “cat.”
  For example, a possible statement and response would be:
> Statement: I like my cat Mittens.  
> Response: Tell me more about your pets.  
3. Have it respond favorably when the statement contains the name of your school.  
  For example, if “the Isidore Newman School” was inputted, a possible statement and response would be: 
> Statement: I am a 10th grader at the Isidore Newman School.  
> Response: The Isidore Newman School is the best school!  
**Bonus: Make it respond to "Newman", "the Newman School", "Isidore Newman", etc. as well!**  
**Bonus: Make it respond unfavorably to rival school(s)!**  
4. Input check: Have the code check that the statement contains at least one character. You can do this by using the .trim() method to remove spaces from the beginning and end, and then checking the length of the trimmed string. If there are no characters, the response should prompt the user to enter something.
  For example, a possible statement and response would be:
> Statement:  
> Response: Say something, please.
5. Pick two or more additional key words or phrases of your choice and create a custom response for each of those phrases.  
  Ideas include: family members (mom, dad, brother, etc); sports; games; etc.
6. If the user's statement does not contain one of the key phrases described above, have the method call the getRandomResponse() method as before.

## Magpie3: Custom Adaptive Response
