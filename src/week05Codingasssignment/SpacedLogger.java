package week05Codingasssignment;

public class SpacedLogger  implements Logger{
@Override
public void log(String message) {
	StringBuilder spacedMessage= new StringBuilder();
	for(char c: message.toCharArray()) {
		spacedMessage.append(c).append("");
	}
	System.out.println(spacedMessage);
}
@Override
public void error(String errorMessage) {
	System.out.println("ERROR:"+errorMessage.replace(""," ").trim());
}
}
