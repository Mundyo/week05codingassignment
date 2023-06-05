package week05Codingasssignment;

public class Main {
public static void main(String[] args) {
	Logger asteriskLogger = new AsteriskLogger();
	asteriskLogger.log("Hello");
	asteriskLogger.error("something went wrong");
	
	Logger spacedLogger = new SpacedLogger();
	spacedLogger.log("hello");
	spacedLogger.error("Something went wrong");
	
}
}
