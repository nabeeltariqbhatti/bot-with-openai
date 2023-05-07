# Olympic Chatbot Help

### Getting Started 
This is a chatbot application that can answer questions related to the 2022 Olympics. Here are some tips on how to use it:
To run the application, you'll need to have and follow steps

1. Go to the OpenAI website and sign up for an account.

2. Once you're signed in, go to the API Keys page and create a new API key.

3. Copy the API key and set it as an environment variable called "OPEN_AI_KEY". Here's how to do that on a Unix-based system (e.g., macOS or Linux):
4. Install Java JDK on your system if it's not already installed. You can download it from the official website: https://www.oracle.com/java/technologies/javase-downloads.html

5. Install Maven on your system if it's not already installed. You can download it from the official website: https://maven.apache.org/download.cgi

6. Open a terminal or command prompt and navigate to the root directory of your Maven-based Spring Boot application.
Build the application by running the following command: 

7. Clone the repository 
`` git clone  https://github.com/nabeeltariqbhatti/bot-with-openai.git  ``
8. Set API key in intellij by following this [guide](https://www.jetbrains.com/help/objc/add-environment-variables-and-program-arguments.html) or just export variable by using 
   the below command.
`` export OPEN_AI_KEY=<your-api-key>``
9. Use IntelijIdea or run the commands `` mvn clean install -DskipTests ``
   `` java -jar target/<your-jar-file>.jar  ``


# Examples

## Here are some example questions you can ask the chatbot:

    What events are happening at the Olympics?
    Who is the mascot for the 2022 Olympics?
    When do the Olympics start?
    How many countries are participating in the Olympics?

![Front End](Screenshot%20from%202023-05-07%2016-55-45.png)

