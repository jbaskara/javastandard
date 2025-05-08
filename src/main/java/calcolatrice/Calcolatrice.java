package calcolatrice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calcolatrice extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JTextField campo1, campo2;
	private JButton somma, sottrai, moltiplica, dividi;
	private JLabel risultato;
	
	public Calcolatrice() {
		
		setTitle("Mini Calcolatrice");
		setSize(400, 250);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(4, 2, 5, 5));
		
		campo1 = new JTextField();
		campo2 = new JTextField();
		
		somma = new JButton("+");
		sottrai = new JButton("-");
		moltiplica = new JButton("*");
		dividi = new JButton("/");
		
		risultato = new JLabel(" = ");
		
		add(campo1);
		add(campo2);
		add(somma);
		add(sottrai);
		add(moltiplica);
		add(dividi);
		
		somma.addActionListener(this);
		sottrai.addActionListener(this);
		moltiplica.addActionListener(this);
		dividi.addActionListener(this);
		
		JPanel pannelloRisultato = new JPanel();
		
		pannelloRisultato.add(risultato);
		add(pannelloRisultato);
		
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		try {
			
			double num1 = Double.parseDouble(campo1.getText());
			double num2 = Double.parseDouble(campo2.getText());
			double ris = 0;
			
			if (e.getSource() == somma) {
				
				ris = num1 + num2; 
				
			} else if (e.getSource() == sottrai) {
				
				ris = num1 - num2;
				
			} else if (e.getSource() == moltiplica) {
				
				ris = num1 * num2;
				
			} else if (e.getSource() == dividi) {
				
				if (num2 == 0) {
					
					risultato.setText("Impossibile dividere per zero.");
					return;
					
				}
				
				ris = num1 / num2;
				
			}
			
			risultato.setText("=  " + ris);
			
		} catch (NumberFormatException ex) {
			
			risultato.setText("Inserisci numeri validi.");
			
		}
		
	}

}
