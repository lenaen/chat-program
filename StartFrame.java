import javax.swing.*;
import java.awt.event.*;
//Vet ej vilka vi behöver förutom dessa


/** Har modifierat browser-klassen från labb5 i kursen för att få med
 grundfunktioner för ett fönster */
public class StartFrame extends JFrame implements ActionListener {
  //Fält:

    public boolean done;
    private Chatprogram program;

    //Grafiska komponenter:
    private JTextField nameField;
    private JButton clientButton;
    private JButton serverButton;

    /** Konstruktor */
    public StartFrame(ChatProgram mainProgram) {
        //super();
        program=mainprogram;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  		BorderLayout startLayout = new BorderLayout();//Typ av layout can ändras
  		setLayout(startLayout);

      //Lägger till textrad som lyssnas på
  		nameField = new JTextField(40);
  		nameField.addActionListener(this);

      //Lägger till knappar


      //LÄgger in i grafisk layout
  		add(nameField, BorderLayout.NORTH);//bara exempel på var ligger
      pack();
      setVisible(true);
    }

    private void setName(String nameText) {
      program.name=nameText;
    }

    private void setType(Boolean type) {
      program.isServer=type;
    }


  	/** Klassen lyssnar på "Client"- och "Server"-knapparna samt textfältet
     för namn */
  	public void actionPerformed(ActionEvent e) {
  		if (e.getSource() == nameField) {

  		} else if (e.getSource() == clientButton){

  		} else if (e.getSource() == serverButton){

  		}
  	}

}
