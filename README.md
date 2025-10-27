# MagpieLab

## Magpie0: Project Setup
Create a directory in your APCS folder called MagpieLab.  
><code>cd Desktop/APCS/</code>  
><code>mkdir MagpieLab/</code>  

Step into that directory.  
><code>cd MagpieLab</code>  

Clone your MagpieLab.
><code>git clone **insertlablinkhere**</code>  

## Magpie1: Random Response (2 Steps)
Open the Magpie.java file.  

Take a look at the getRandomResponse() method.  

### getRandomResponse()   

Currently the code has four responses, but a few more would make the chatbot better.  
1. Modify the getRandomResponse() method so that it adds two more noncommittal responses.  
2. Currently the code will only print out the first random response, "Interesting."  Change the <code>whichResponse</code> assignment statement so it assigns a random number greater than or equal to 0 and less than 6. 

## Magpie2: Custom Keyword Response (6 Steps)
Open the Magpie.java file.  

Take a look at the getResponse() method.

Now that we have six random responses, let’s use the getResponse() method to make some responses that sound more like human responses. Looking for ***keywords*** will help create a more custom response.  
  
### getResponse()  

1. Have it respond “Is that your favorite class?” when the statement contains the key words “math” or “science.”  
  For example, a possible statement and response would be: 
> Statement: I go to math after lunch.  
> Response: Is that your favorite class?  
**Bonus: Make it respond to additional class-related key words: "biology", "bio", "chemistry", "chem", etc.**  
2. Have it respond “Tell me more about your pets” when the statement contains the word “dog” or “cat.”
  For example, a possible statement and response would be:
> Statement: I like my cat Mittens.  
> Response: Tell me more about your pets.  
**Bonus: Make it respond to additional pet-related key words: "hamster", "goldfish", "parrot", etc.**  
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

## Magpie3: Custom Adaptive Response (4 Steps)
Open the StringExplorer.java file.  

Take a look at the findPhrase() method.  

### findPhrase()
**This step will be hand-written! Get a piece of scratch paper!**   

1. Trace the values of <code>position</code>, <code>before</code>, and <code>after</code> for each the following method calls:
2. Write code in the transformIWant() method to respond to the phrase “I want”. It should transform statements with the form “I want *something*” into a response with the form “Why do you want *something*?” In doing this transformation, you need to be careful about where you place the check for the key phrase.
> int pos1 = findPhrase("Listen to your conscience.", "science", 0);
> int pos2 = findPhrase("Yesterday is today's day before.", "day", 0);
> int pos3 = findPhrase("This will be his first history class.", "is", 10);
> int pos4 = findPhrase("I love computer science class.", "computer", 4);

#### Copy and paste the entire findPhrase() method into Magpie.java

### transformIWant()

Take a look at the transformIWant() method.  

Statements like “I want cookies,” “I want to hear more,” and “I want to go to Ireland” all have the form “I want *something*.”  
The response could be, “Why do you want *something*?”  
2.   Write code in the transformIWant() method to respond to “I want something” statements with “Why do you want *something*?” In doing this, you need to be careful about where you place the check -- be sure you understand why. For example:
> Statement: I want to go to Ireland.  
> Response: Why do you want to go to Ireland?

### transformILike()

Take a look at the transformILike() method.  

Statements like “I like cats,” “I like math class,” and “I like Spain” all have the form “I like *something*.” 
The response could be “What do you like about *something*?”  
3. Write code in the transformILike() method to respond to the phrase “I like”. It should transform statements with the form “I like *something*” into a response with the form “What do you like about *something*?” In doing this transformation, you need to be careful about where you place the check for the key phrase.  
> Statement: I like cats.  
> Response: What do you like about cats?

### getResponse()

Return to the getResponse() method.  

4. Edit the getResponse() method to call the transformILike() method when the input string contains "I like" and call the transformIWant() method when the input string contains "I want".

## Magpie4: Improved Adaptive Response

Open the Magpie.java file.  

Take a look at the meAndYou() method.

### meAndYou()

1. Write code to have it respond to statements of the form “I something you” with the restructuring “Why do you something me?” For example:
   > Statement: I like you.  
   > Response: Why do you like me?  

Test your code with several examples. Find an example of when this structure does not work well. How can you improve it?

### transformILike()
Return to the transformILike() method. Try running it with several examples, including "I like to dance" and "I like to eat ice cream." What do you notice?

2. Revise your transformILike() method to differentiate between statements of the form "I like *something*" and "I like **to** *something*". For the "I like to" statements, make your code use a new response format, like "Why do you like to *something*?"


### getResponse()

3. Take a look at your getResponse() method. Make a list of different possible user inputs that could combine one or more of the possible key words / phrases you're responding to here. For example:
> I like bringing my dog to the Isidore Newman School  
> I want to share a coffee with you and my friend Annie  
> I told my mom "Bye!" before I left for science class  

Determine which trigger(s) you'd like to prioritize, and list them in order from highest to lowest priority. Make sure that your getResponse() method is structured to match this priority list!
