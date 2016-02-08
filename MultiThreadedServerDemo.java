import java.io.*;
import java.net.*;

/**
 * Detta program startar en server som lyssnar pÃ¥ port 4444
 * och konverterar alla inkommande meddelanden till versaler
 * innan den skickar tillbaks dem till klienten
 *
 * En ny trÃ¥d startas fÃ¶r varje anslutande klient
 * och programmet kÃ¶rs till det stÃ¤ngs av utifrÃ¥n
 */
public class MultiThreadedServerDemo{

    // Serverns socket
    private ServerSocket serverSocket;

    public static void main(String[] args){
	MultiThreadedServerDemo servDemo = new MultiThreadedServerDemo();
    }

    public MultiThreadedServerDemo(){

	// Starta serverns socket
	try {
	    serverSocket = new ServerSocket(4444);
	} catch (IOException e) {
	    System.out.println("Could not listen on port: 4444");
	    System.exit(-1);
	}

	// Lyssna efter klienter.
        // Varje gÃ¥ng en klient ansluter atartas en
	// ny trÃ¥d av typen 'EchoThread', som sedan
	// behandlar resten av kommunikationen
	// EkotrÃ¥darna tar klientsocketen som argument
	// fÃ¶r att veta vem som har anslutit sig
	while(true){
	    Socket clientSocket = null;
	    try {
		clientSocket = serverSocket.accept();
	    } catch (IOException e) {
		System.out.println("Accept failed: 4444");
		System.exit(-1);
	    }
	    Thread thr = new EchoThread(clientSocket);
	    thr.start();
	}
    }

}
