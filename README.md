# MagpieLab

## Testing Your Code
To run the unit tests on your code, use this command in your VSCode terminal:
> <code>gradle test</code>

All of the autograder tests will run, one after the other. The "test suite" is this list of tests. You can scroll up through the test suite output to view each individual test, whether you passed or failed, and if you failed, which input caused your test to fail.  

The "test suite" as a whole will not be successful until each individual test succesfully passes, which shouldn't happen until you've finished Magpie5. However, you can use the individual "unit tests" to determine how your code is doing on each assignment.  

#### The autograder is not a replacement for testing your own code! After each assignment, you should open MagpieRunner.java, press play, and test your chatbot with different inputs to check its performance.

The test suite will run each time you push your code to GitHub. A failure will be indicated by a red X, and a success will be indicated by a green check. You should only see a green check after your final lab submission at the end of Magpie5.  


## Magpie0: Project Setup
Open a Terminal window on your computer.  
Navigate to your APCS directory on your desktop.  
><code>cd Desktop/APCS/</code>  

Clone your MagpieLab.
><code>git clone **insertlablinkhere**</code>

List the folders in your APCS directory. The names of your magpie lab directory and receipt lab directory should be printed out.
><code>ls</code>  

Step into your MagpieLab directory.
><code>cd **magpie-lab-username**</code>

Open VSCode
><code>code .</code>

## Magpie1: Random Response (2 Steps)
Open the Magpie.java file.  

Take a look at the <code>getRandomResponse()</code> method.  

### getRandomResponse()   

Currently the code has four responses, but a few more would make the chatbot better.  
1. Modify the getRandomResponse() method so that it adds two more noncommittal responses. Change the <code>NUMBER_OF_RESPONSES</code> to 6.  
2. Currently the code will only print out the first random response, "Interesting."  Change the <code>whichResponse</code> assignment statement so it assigns a random number greater than or equal to 0 and less than 6. 

## Magpie2: Custom Keyword Response (6 Steps)
Open the Magpie.java file.  

Take a look at the <code>getResponse()</code> method.

Now that we have six random responses, let’s use the <code>getResponse()</code> method to make some responses that sound more like human responses. Looking for ***keywords*** will help create a more custom response.  
  
### getResponse()  

1. Have it respond “Is that your favorite class?” when the statement contains the key words “math” or “science.”  
  For example, a possible statement and response would be: 
> <code>Statement: I go to math after lunch.</code>  
> <code>Response: Is that your favorite class?</code>  
**Bonus: Make it respond to additional class-related key words: "biology", "bio", "chemistry", "chem", etc.**  
2. Have it respond “Tell me more about your pets” when the statement contains the word “dog” or “cat.”
  For example, a possible statement and response would be:
> <code>Statement: I like my cat Mittens.</code>  
> <code>Response: Tell me more about your pets.</code>  
**Bonus: Make it respond to additional pet-related key words: "hamster", "goldfish", "parrot", etc.**  
3. Have it respond favorably when the statement contains the name of your school.  
  For example, if “the Isidore Newman School” was inputted, a possible statement and response would be: 
> <code>Statement: I am a 10th grader at the Isidore Newman School.</code>  
> <code>Response: The Isidore Newman School is the best school!</code>  
**Bonus: Make it respond to "Newman", "Isidore Newman", etc. as well!**  
**Bonus: Make it respond unfavorably to rival school(s)!**  
4. Input check: Have the code check that the statement contains at least one character. You can do this by using the .trim() method to remove spaces from the beginning and end, and then checking the length of the trimmed string. If there are no characters, the response should prompt the user to enter something.
  For example, a possible statement and response would be:
> <code>Statement: </code>  
> <code>Response: Say something, please.</code>  
5. Pick two or more additional key words or phrases of your choice and create a custom response for each of those phrases.  
  Ideas include: family members (mom, dad, brother, etc); sports; favorite foods; games; movies; etc.
6. If the user's statement does not contain one of the key phrases described above, have the method call the getRandomResponse() method as before.

## Magpie3: Custom Adaptive Response (4 Steps)
Open the StringExplorer.java file.  

Take a look at the <code>findPhrase()</code> method.  

### findPhrase()
**This step will be hand-written! Get a piece of scratch paper!**   

1. Trace the values of <code>position</code>, <code>before</code>, and <code>after</code> for each the following method calls:
> <code>int pos1 = findPhrase("Listen to your conscience.", "science", 0);</code>  
> <code>int pos2 = findPhrase("Yesterday is today's day before.", "day", 0);</code>  
> <code>int pos3 = findPhrase("This will be his first history class.", "is", 10);</code>  
> <code>int pos4 = findPhrase("I love computer science class.", "computer", 4);</code>  

### Copy and paste the entire findPhrase() method into Magpie.java. You will need this!

### transformIWant()

Take a look at the <code>transformIWant()</code> method.  

Statements like “I want cookies,” “I want to hear more,” and “I want to go to Ireland” all have the form “I want *something*.”  
The response could be, “Why do you want *something*?”  
2. Write code in the <code>transformIWant()</code> method to respond to the phrase “I want”. It should transform statements with the form “I want *something*” into a response with the form “Why do you want *something*?” In doing this transformation, you need to be careful about where you place the check for the key phrase.
> <code>Statement: I want to go to Ireland.</code>  
> <code>Response: Why do you want to go to Ireland?</code>

### transformILike()

Take a look at the <code>transformILike()</code> method.  

Statements like “I like cats,” “I like math class,” and “I like Spain” all have the form “I like *something*.” 
The response could be “What do you like about *something*?”  
3. Write code in the <code>transformILike()</code> method to respond to the phrase “I like”. It should transform statements with the form “I like *something*” into a response with the form “What do you like about *something*?” In doing this transformation, you need to be careful about where you place the check for the key phrase.  
> <code>Statement: I like cats.</code>  
> <code>Response: What do you like about cats?</code>

### getResponse()

Return to the <code>getResponse()</code> method.  

4. Edit the <code>getResponse()</code> method to call the <code>transformILike()</code> method when the input string contains "I like" and call the <code>transformIWant()</code> method when the input string contains "I want".

## Magpie4: Improved Adaptive Response (4 Steps)

Open the Magpie.java file.  

Take a look at the <code>meAndYou()</code> method.

### meAndYou()

1. Write code to have it respond to statements of the form “I something you” with the restructuring “Why do you something me?” For example:
> <code>Statement: I like you.</code>  
> <code>Response: Why do you like me?</code>  

Test your code with several examples. Find an example of when this structure does not work well. How can you improve it?  

### transformILike()
Return to the <code>transformILike()</code> method. Try running it with several examples, including "I like to dance" and "I like to eat ice cream." What do you notice?

2. Revise your <code>transformILike()</code> method to differentiate between statements of the form "I like *something*" and "I like **to** *something*". For the "I like to" statements, make your code use a new response format, like "Why do you like to *something*?"


### whyNot()
Take a look at the <code>whyNot()</code> method.  

We can currently respond to statements with the positive form "I like", "I like to", and "I want". What about the flip side: "I don't like" and "I don't want"?  
Take a look at the following statements and responses: 
> <code>Statement: "I don't like sneezing"</code>  
> <code>Response:  "Why don't you like sneezing?"</code>  

> <code>Statement: "I don't want peanuts"</code>  
> <code>Response:  "Why don't you want peanuts?"</code>  

> <code>Statement: "I don't need any more glitter"</code>  
> <code>Response:  "Why don't you need any more glitter?"</code>  

> <code>Statement: "I don't think that's fun."</code>  
> <code>Response:  "Why don't you think that's fun?"</code>  
3. Write code in the <code>whyNot()</code> method to transform these statements. Try to be as efficient as possible -- the solution might be simpler than you think!

### getResponse()

4. Take a look at your <code>getResponse()</code> method. Make a list of different possible user inputs that could combine one or more of the possible key words / phrases you're responding to here. For example:
> <code>I like bringing my dog to the Isidore Newman School</code>  
> <code>I want to share a coffee with you and my friend Annie</code>  
> <code>I told my mom "Bye!" before I left for science class</code>  

Determine which trigger(s) you'd like to prioritize, and list them in order from highest to lowest priority. Make sure that your getResponse() method is structured to match this priority list!

## Magpie5: Arrays (2 Steps)

### getRandomResponse()
An efficient way to keep track of multiple responses is with an array. In this activity you will see how an array makes handling multiple responses much easier. 

Changing the internal structure of the code from nested if statements will make no difference to the output. The change in structure is called *code refactoring*. That’s one of the big benefits of dealing with methods as black boxes. As long as the class or methods perform the action required, the user does not care about how the action is implemented. 

1. Modify the getRandomResponse() method. The method should create an array of random responses. Choose one at random and return that String. 

The elements of the array might be: 

|       0       |    1    |                2               |                     3                     |              4             |      5     |
|---------------|---------|--------------------------------|-------------------------------------------|----------------------------|------------|
|"Interesting." | "Okay." | "I haven’t heard that before." | "What else could you tell me about that?" | "Where did you hear that?" | "Go on..." |


### getResponse()
You can separate a String into different parts with the String object <code>split</code> method, based on a delimiter. A **delimiter** is a special character or set of characters that help delineate specific parts of text. For example, a .csv (comma-separated values) file uses commas to separate different parts of data. If provided with a String object, you could use the <code>split</code> method to turn the object into an array like this: 

> <code>String str = "AP CS A, Magpie Lab, Activity 5, Part B";  </code>  
> <code>String[] data = str.split(","); </code>  

The elements of the array would be: 

| 0 | 1 | 2	| 3 |
|-----------|-----------|-----------|-----------|
| "AP CS A" | " Magpie Lab" | " Activity 5" | " Part B" |

Notice the spaces after the commas are still present in the resulting elements in the array. 

We can make the delimiter anything we want. If we changed the delimiter to a space, our resulting array would look different:

> <code>String str = "AP CS A, Magpie Lab, Activity 5, Part B";  </code>  
> <code>String[] data = str.split(" "); </code>  

The elements of the array would be: 

|   0  |   1  |   2	 |     3    |   4    |     5      |  6   |    7   |  8  |
|------|------|------|----------|--------|------------|------|--------|-----|
| "AP" | "CS" | "A," | "Magpie" | "Lab," | "Activity" | "5," | "Part" | "B" |

Notice the commas are still present in the resulting elements in the array. 

2. Modify the getResponse method to create a String variable that contains the names of everyone in your class, separated by a delimiter such as a comma or semicolon. Alter the method to return "Oh, you’re in <teacher name>’s class! Do you know <student name>?" when your teacher is mentioned. Select the student's name at random.

For example, say <code>String names = "Abby,Chinma,Jill,Kim,Marcus,Margaret,Rob,Tom,Travis";</code>   
> When the prompt is:  
> <code>"Mrs. Hopper is my G Block teacher"</code>  
> The method should return one of the names **at random** in the response:  
> <code>"Oh, you’re in Mrs. Hopper's class!  Do you know Kim?" </code>











