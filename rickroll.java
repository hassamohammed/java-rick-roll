import java.awt.Desktop;
import java.net.URI;

// i making another program for funsies
// this one is super secret
public class practice2 {

    // main method where it all start
    public static void main(String[] args) {
        
        // printing out my cool name ascii art
        System.out.println("  __  __           _        ____        ");
        System.out.println(" |  \\/  |         | |      |  _ \\       ");
        System.out.println(" | \\  / | __ _  __| | ___  | |_) |_   _ ");
        System.out.println(" | |\\/| |/ _` |/ _` |/ _ \\ |  _ <| | | |");
        System.out.println(" | |  | | (_| | (_| |  __/ | |_) | |_| |");
        System.out.println(" |_|  |_|\\__,_|\\__,_|\\___| |____/ \\__, |");
        System.out.println("                                   __/ |");
        System.out.println("                                  |___/ ");
        System.out.println("                                                                                    ");
        System.out.println("                                                                                    ");
        System.out.println("▄▄ ▄▄  ▄▄▄   ▄▄▄▄  ▄▄▄▄  ▄▄▄  ▄▄   ▄▄  ▄▄▄  ▄▄ ▄▄  ▄▄▄  ▄▄   ▄▄ ▄▄   ▄▄ ▄▄▄▄▄ ▄▄▄▄  ");
        System.out.println("██▄██ ██▀██ ███▄▄ ███▄▄ ██▀██ ██▀▄▀██ ██▀██ ██▄██ ██▀██ ██▀▄▀██ ██▀▄▀██ ██▄▄  ██▀██ ");
        System.out.println("██ ██ ██▀██ ▄▄██▀ ▄▄██▀ ██▀██ ██   ██ ▀███▀ ██ ██ ██▀██ ██   ██ ██   ██ ██▄▄▄ ████▀ ");
        
        System.out.println("\nLoading very important files...");

        // we trying to wait 5 seconds using thread sleep
        // sometimes thread crash so we need try catch block
        try {
            // 5000 milliseconds is 5 seconds in computer time
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("oh no sleep was broken");
        }

        // after we waking up, we open browser
        try {
            // checking if computer has a browser we can use
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                // putting the rick roll gif link
                URI link = new URI("https://media.tenor.com/x8v1oNUOmg4AAAAd/rickroll-roll.gif");
                // opening the link in default browser
                Desktop.getDesktop().browse(link);
                
                // telling user they got pranked in console
                System.out.println("you just got rick rolled");
            } else {
                // if computer no have browser we print sad message
                System.out.println("broswer not supported, but you still got rick rolled in spirit");
            }
        } catch (Exception e) {
            // catching errors if link is bad or something
            System.out.println("error happened when opening broswer: " + e.getMessage());
        }
    }
}
