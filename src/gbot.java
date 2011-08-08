import org.jibble.pircbot.*;

public class gbot extends PircBot {

	 public gbot() {
	        this.setName("gbot");
	    }
	 
	 public void onMessage(String channel, String sender,
             String login, String hostname, String message) {
		 if (message.equalsIgnoreCase("time")) {
			 String time = new java.util.Date().toString();
			 sendMessage(channel, sender + ": The time is now " + time);
		 }
	 }
}