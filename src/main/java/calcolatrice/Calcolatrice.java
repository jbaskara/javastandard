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
		setLocationRelativeTo(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout(10, 10));
		
		JPanel pannelloInput = new JPanel(new GridLayout(2, 2, 10, 10));
		campo1 = new JTextField();
		pannelloInput.add(new JLabel("Numero 1: "));
		pannelloInput.add(campo1);
		campo2 = new JTextField();
		pannelloInput.add(new JLabel("Numero 2: "));
		pannelloInput.add(campo2);
		
		JPanel pannelloBottoni = new JPanel(new GridLayout(2, 2, 10, 10));
		somma = new JButton("+");
		sottrai = new JButton("-");
		moltiplica = new JButton("*");
		dividi = new JButton("/");
		
		JButton[] bottoni = {somma, sottrai, moltiplica, dividi};
		for (JButton b : bottoni) {
			
			b.setFont(new Font("Arial", Font.BOLD, 18));
			b.addActionListener(this);
			pannelloBottoni.add(b);
			
		}
		
		JPanel pannelloRisultato = new JPanel();
		risultato = new JLabel("Risultato: ");
		risultato.setFont(new Font("Arial", Font.BOLD, 16));
		
		pannelloRisultato.add(risultato);
		
		add(pannelloInput, BorderLayout.NORTH);
		add(pannelloBottoni, BorderLayout.CENTER);
		add(pannelloRisultato, BorderLayout.SOUTH);
		
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
			
			risultato.setText("Risultato: " + ris);
			
		} catch (NumberFormatException ex) {
			
			risultato.setText("Inserisci numeri validi.");
			
		}
		
	}

}
