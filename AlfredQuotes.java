import java.sql.Time;
import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return "Hello, "+ name + ". Lovely to see you.";
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date currenDate = new Date();
        return "It is currently " + currenDate.toString() + ".";
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        if (conversation.contains ("Alexis")) {
        return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        else if (conversation.contains("Alfred")) {
            
            return "At your service. As you wish, naturally.";
        }
        else {
            return "Right. And with that I shall retire.";
        }
    }
    
    public String respondToAlfred(String conversation) {

        return "At your service. As you wish, naturally.";
    }

	// NINJA BONUS
	// See the specs to overload the guestGreeting method
    public String guestGreeting(String name, String timeOfDay ) {
        return "Hello, " + name + ". Lovely to see you this " + timeOfDay + ".";
    }
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
    public String moodResponse(String conversation) {
        if (conversation.contains("happy")) {
        return "I am delighted to see you are in a good mood.";
    }
        else if (conversation.contains("sad")) {
        return "I am sorry to hear you are feeling down. how may i cheer you up?";
    }
    else {
        return "how may i assist you today?";
        }
    }
}

