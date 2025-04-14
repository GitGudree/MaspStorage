import java.util.logging.Logger;

public class Middleman {
    public static void main(String[] args) throws Exception {
        Logger rootLogger = Logger.getLogger("");
        rootLogger.setLevel(Level.WARNING);
        for (var handler : rootLogger.getHandlers()) {
            handler.setLevel(Level.WARNING);
        }
        Networking Networking =  new Networking();
        Networking.makeRequest();
    }
}
