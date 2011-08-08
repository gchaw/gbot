import org.jibble.pircbot.*;

public class gbotMain {

	 public static void main(String[] args) throws Exception {
	        
	        // Now start our bot up.
	        gbot bot = new gbot();
	        
	        // Enable debugging output.
	        bot.setVerbose(true);
	        
	        // Connect to the IRC server.
	        bot.connect("irc.freenode.net");

	        // Join the #pircbot channel.
	        bot.joinChannel("#tomatopotato");
	        
	    }
	
}
