//Kommer nog behöva importa paket här

public class ChatProgram{
  //Fält:
  //Namn
  public String name;
  public Boolean isServer=0;
  public String IP;
  public int port;

  //Bör ha en referens till clienten
  private Client theClient;

  //Pop-up rutor
   private StartFrame startRuta;
   private ConnectFrame connectRuta;


  //Metoder:

    private void createStartFrame() {
      startRuta= new StartFrame(this);

    }

    private void createConnectFrame() {
      connectRuta= new ConnectFrame(isServer);

    }

    private void createClient() {
      theClient=new Client(name);
    }

    private void createSocket() {
      //Är det här vi skapar ServerSocket om behövs?

      //Bör ha någon sorts trty-catch här eftersom dessa fält inte
      //nödvändigtvis definerade när metod anropas.
      theClient.createSocket(IP,port);
    }

  //main-metoden:
    public void public static void main(String[] args) {

    }
}
