 AI Chatbot

 Overview
This AI Chatbot is a simple Java console application that interacts with users through text-based conversations. It can recognize predefined responses and allows users to teach it new responses dynamically.

Features
- Responds to predefined inputs.
- Learns new responses from users.
- Saves chat history in a file.
- Stores new responses in a text file for future use.

 Technologies Used
- Java
- File Handling (BufferedWriter, FileWriter)
- HashMap for storing responses
- Scanner for user input handling

How to Run
1. Ensure you have Java installed on your system.
2. Compile the Java file:
  
   javac AIChatbot.java
 
3. Run the program:
   
   java AIChatbot
  
4. Start chatting! Type 'exit' to quit the chat.

File Structure
- `AIChatbot.java` - Main chatbot program.
- `chat_history.txt` - Stores chat logs.
- `responses.txt` - Stores learned responses.

How It Works
1. Loads predefined responses from the code.
2. Accepts user input and checks for a known response.
3. If a response is not found, it asks the user to provide one.
4. Saves the new response in `responses.txt` and chat history in `chat_history.txt`.
5. Continues chatting until the user types 'exit'.

Example Usage

🤖 AI Chatbot: Hello! Type 'exit' to end the chat.

You: hello
🤖 AI Chatbot: Hi there! How can I assist you?

You: what is your name?
🤖 AI Chatbot: I am ChatBot, your friendly assistant.

You: tell me a joke
🤖 AI Chatbot: Why don't programmers like nature? It has too many bugs!

You: exit
🤖 AI Chatbot: Goodbye! Have a great day!


 Future Improvements
- Load and retrieve responses from `responses.txt`.
- Implement Natural Language Processing (NLP) for better responses.
- Add a GUI for better user experience.

License
This project is open-source and free to use.

