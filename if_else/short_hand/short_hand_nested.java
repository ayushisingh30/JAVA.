package short_hand;
public class short_hand_nested {
    public static void main(String[] args) {
        int time = 22;
        String message = (time < 12) ? "good morning."
                        :(time < 20) ? "good evening."
                        :"bye bye.";
        System.out.println(message);
    }
    
}
