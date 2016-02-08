import java.io.*;
import java.net.*;

/**
 * Är i nuläget bara ClientDemo som är något modifierad för att se strukturen
 */
public class Client {
 //Fält:

 //Namn
 public String name;
 // Socket som ansluter till servern
  private Socket clientSocket = null;
  // StrÃ¶mmar fÃ¶r att lÃ¤sa frÃ¥n/skriva till servern
  private PrintWriter out;
  private BufferedReader in;
  //GUI
  private ChatGUI chatWindow;//Var skapas denna?

//Metoder:

  public void Client(String nameFromUser){
    this.name=nameFromUser;

  }

  public void createSocket(String IP, int port){
    try {
        clientSocket = new Socket(IP, port);
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(
                                    clientSocket.getInputStream()));
    } catch (UnknownHostException e) {
        System.err.println("Don't know about host.\n" + e);
        System.exit(1);
    } catch (IOException e) {
        System.err.println("Couldn't get I/O for "
                           + "the connection to host.\n" + e);
        System.exit(1);
    }

  }

  private String getText() {

  }

  private int getTypesetting() {

  }

  private String convertToXML(String text, int typesetting) {

  }

  public void sendToSocket() {

  }

  private (String, int) convertFromXML(){

  }

  private void sendToGUI() {

  }
  /**
  Kod som tidigare varit i ClientDemo och som kan sättas i funktioner:
	// Anslut till server:
        try {
            clientSocket = new Socket(hostAddress, 4444);
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(
                                        clientSocket.getInputStream()));
        } catch (UnknownHostException e) {
            System.err.println("Don't know about host.\n" + e);
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for "
                               + "the connection to host.\n" + e);
            System.exit(1);
        }

	// Kommer vi hit har anslutningen gÃ¥tt bra
	System.out.println("Connection successful!");

	// Anslut stdIn till terminalen
	stdIn = new BufferedReader(new InputStreamReader(System.in));

	// LÃ¤s in frÃ¥n terminalen och skicka till servern:
	while ((userInput = stdIn.readLine()) != null) {
	    out.println(userInput);
	    System.out.println("echo: " + in.readLine());


	// Hit kommer vi troligtvis aldrig,
	// men sÃ¥ hÃ¤r stÃ¤nger man alla inblandade strÃ¶mmar
	out.close();
	in.close();
	stdIn.close();
	clientSocket.close();
    }
    */
}
