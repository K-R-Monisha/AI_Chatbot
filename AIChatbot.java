import java.io.*;
import java.util.*;

public class AIChatbot {
    private static final String FILE_NAME = "chat_history.txt";
    private static final Map<String, String> predefinedResponses = new HashMap<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        loadPredefinedResponses();
        System.out.println("🤖 AI Chatbot: Hello! Type 'exit' to end the chat.");

        while (true) {
            System.out.print("\nYou: ");
            String userInput = scanner.nextLine().trim().toLowerCase();

            if (userInput.equals("exit")) {
                System.out.println("🤖 AI Chatbot: Goodbye! Have a great day!");
                break;
            }

            String response = predefinedResponses.getOrDefault(userInput, null);
            if (response != null) {
                System.out.println("🤖 AI Chatbot: " + response);
            } else {
                System.out.println("🤖 AI Chatbot: I don't know how to respond. How should I reply?");
                String newResponse = scanner.nextLine();
                predefinedResponses.put(userInput, newResponse);
                saveNewResponse(userInput, newResponse);
                System.out.println("🤖 AI Chatbot: Thanks! I'll remember this.");
            }

            saveChatHistory(userInput);
        }
        scanner.close();
    }

    private static void loadPredefinedResponses() {
        predefinedResponses.put("hello", "Hi there! How can I assist you?");
        predefinedResponses.put("how are you?", "I'm just a bot, but I'm doing great! How about you?");
        predefinedResponses.put("what is your name?", "I am ChatBot, your friendly assistant.");
        predefinedResponses.put("tell me a joke", "Why don't programmers like nature? It has too many bugs!");
    }

    private static void saveNewResponse(String userInput, String response) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("responses.txt", true))) {
            bw.write(userInput + "=" + response);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error saving response.");
        }
    }

    private static void saveChatHistory(String message) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            bw.write("You: " + message);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error saving chat history.");
        }
    }
}
