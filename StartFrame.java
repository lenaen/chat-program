import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//Vet ej vilka vi behöver förutom dessa


/** Har modifierat browser-klassen från labb5 i kursen för att få med
 grundfunktioner för ett fönster */
public class StartFrame extends JFrame implements ActionListener {
  //Fält:

    public boolean done;
//    private Chatprogram program;

    //Grafiska komponenter:
    private JTextField nameField;
    private JButton clientButton;
    private JButton serverButton;

    /** Konstruktor */
    public StartFrame(){//ChatProgram mainProgram) {
        //super();
        //program=mainprogram;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  		BorderLayout startLayout = new BorderLayout();//Typ av layout can ändras
  		setLayout(startLayout);

      //Lägger till textrad som lyssnas på
  		nameField = new JTextField(40);
  		nameField.addActionListener(this);
      JLabel nameLabel= new JLabel("Name:");

      //Lägger till knappar
      clientButton= new JButton("Client");
      serverButton= new JButton("Server");
      clientButton.addActionListener(this);
      serverButton.addActionListener(this);

      //LÄgger in i grafisk layout
      JPanel namePanel=new JPanel();
      namePanel.add(nameLabel);
      namePanel.add(nameField);
  		add(namePanel, BorderLayout.NORTH);//bara exempel på var ligger
      JPanel buttonPanel=new JPanel();
      add(buttonPanel, BorderLayout.SOUTH);
      buttonPanel.add(clientButton);
      buttonPanel.add(serverButton);
      pack();
      setVisible(true);
    }

    //setName kan inte användas som namn då det är en viktigt metod i JFrame
    //som ej kan skrivas över
    private void sendName(String nameText) {
    //  program.name=nameText;
    }

    private void setType(Boolean type) {
    //  program.isServer=type;
    }


  	/** Klassen lyssnar på "Client"- och "Server"-knapparna samt textfältet
     för namn */
  	public void actionPerformed(ActionEvent e) {
  		if (e.getSource() == nameField) {
        System.out.println("Skrev "+nameField.getText()+" i namnruta");//Ser i terminal att lyssnare funkar

  		} else if (e.getSource() == clientButton){
        System.out.println("Klickade klient");

  		} else if (e.getSource() == serverButton){
        System.out.println("Klickade server");
  		}
  	}

    //För att testa hur fönstret blir.
    //Kommenteras bort senare när del av program och tar då bort kommentar
    //med chatprogram som variabel i konstruktorn

    public static void main(String[] args) {
      new StartFrame();

    }

}
