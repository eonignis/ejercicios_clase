package exercici3_Conversor;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Conversor extends JFrame {
	// super("Calculadora cambio de monedas");
	JPanel conversor;
	JLabel cantidad, resultado;
	JButton eurosPtas, ptasEuros, cambiar, borrar;
	JTextField cantitat, resultat;

	private Double operador, num1, pesetas = 166.0;

	public Conversor() {
		GridBagLayout gridbag = new GridBagLayout();
		GridBagConstraints constraints = new GridBagConstraints();
		conversor = new JPanel();

		cantidad = new JLabel("Cantidad a convertir: ");
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = 2;
		constraints.ipadx = 0;
		constraints.ipady = 10;
		constraints.insets = new Insets(5, 0, 5, 0);
		conversor.add(cantidad, constraints);

		cantitat = new JTextField("             0.0");
		constraints.gridx = 1;
		conversor.add(cantitat, constraints);

		resultado = new JLabel("Resultado: ");
		constraints.gridx = 2;
		conversor.add(resultado, constraints);

		resultat = new JTextField("              0.0");
		constraints.gridx = 3;
		conversor.add(resultat, constraints);

		eurosPtas = new JButton("Pesetas a Euros");
		constraints.gridx = 1;
		constraints.gridy = 1;
		constraints.gridwidth = 2;
		constraints.ipadx = 10;
		constraints.ipady = 10;
		constraints.insets = new Insets(5, 10, 5, 10);
		conversor.add(eurosPtas, constraints);

		eurosPtas.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				eurosPtas.setVisible(false);
				ptasEuros.setVisible(true);

			}
		});

		ptasEuros = new JButton("Euros a Pesetas");
		conversor.add(ptasEuros, constraints);
		ptasEuros.setVisible(false);
		ptasEuros.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				ptasEuros.setVisible(false);
				eurosPtas.setVisible(true);

			}
		});

		cambiar = new JButton("Cambiar");
		constraints.gridx = 1;
		conversor.add(cambiar, constraints);

		cambiar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					if (ptasEuros.isVisible()) {
						operador = Double.parseDouble(cantitat.getText());
						num1 = operador / pesetas;

						resultat.setText("" + num1);
					} else {
						operador = Double.parseDouble(cantitat.getText());
						num1 = operador * pesetas;

						resultat.setText("" + num1);
					}

				} catch (Exception e) {
					System.out.println("Error");
				}
			}
		});

		borrar = new JButton("Borrar");
		constraints.gridx = 2;
		conversor.add(borrar, constraints);

		borrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				cantitat.setText("0.0");
				resultat.setText("0.0");

			}
		});

		add(conversor);

		setSize(400, 140);
		setVisible(true);
	}
}
