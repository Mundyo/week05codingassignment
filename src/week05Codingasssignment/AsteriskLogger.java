package week05Codingasssignment;

public class AsteriskLogger implements Logger {
@Override
public void log(String message) {
	System.out.println("***"+message+"***");
}
@Override
public void error(String errorMessage) {
	StringBuilder stringBuilder = new StringBuilder();
	stringBuilder.append("ERRor:").append(errorMessage);
	
	int length = stringBuilder.length() + 6;
	
	printLineOfAsterisks(length);
}

private void printLineOfAsterisks(int length) {
	for(int i= 0; i<length; i++) {
		System.out.print("*");
	}
	System.out.println();
}
}
