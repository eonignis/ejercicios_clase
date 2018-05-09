package practicaSwing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exercici2 extends JFrame implements ActionListener {
	// <=== CALCULADORA BÁSICA ===>
	// <--- Puedes sumar, restar, multiplicar y divir números enteros --->
	
	private JButton boton0, boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9, botonSuma, botonResta, botonMult, botonDiv, botonClear, botonIgual;
	private JTextField field;
	private int operador1,operador2,r;
	private String op;
	static int operator;
	public Exercici2() {
		setLayout(new BorderLayout());
		setResizable(false);
		JPanel panel=new JPanel();
		panel.setLayout(new GridLayout(4, 4, 3, 3));
		field=new JTextField(15);
		r=0;
		
		boton1 = new JButton("1");		boton2 = new JButton("2");		boton3 = new JButton("3");		boton4 = new JButton("4");
		boton5 = new JButton("5");		boton6 = new JButton("6");		boton7 = new JButton("7");		boton8 = new JButton("8");
		boton9 = new JButton("9");		boton0 = new JButton("0");		botonSuma = new JButton("+");	botonResta = new JButton("-");
		botonMult = new JButton("*");	botonDiv = new JButton("/");	botonClear = new JButton("C");	botonIgual = new JButton("=");
		
		boton1.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);
        boton4.addActionListener(this);
        boton5.addActionListener(this);
        boton6.addActionListener(this);
        boton7.addActionListener(this);
        boton8.addActionListener(this);
        boton9.addActionListener(this);
        boton0.addActionListener(this);
        botonSuma.addActionListener(this);
        botonResta.addActionListener(this);
        botonMult.addActionListener(this);
        botonDiv.addActionListener(this);
        botonIgual.addActionListener(this);
        botonClear.addActionListener(this);
		
		panel.add(boton7);		panel.add(boton8);		panel.add(boton9);		panel.add(botonSuma);
		panel.add(boton4);		panel.add(boton5);		panel.add(boton6);		panel.add(botonResta);
		panel.add(boton1);		panel.add(boton2);		panel.add(boton3);		panel.add(botonMult);
		panel.add(botonClear);	panel.add(boton0);		panel.add(botonIgual);	panel.add(botonDiv);
		add(field, BorderLayout.NORTH);					add(panel, BorderLayout.CENTER);		
		
		
		pack();
		setSize(400, 260);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exercici2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {		
		if(e.getSource()==boton1) {
            field.setText(field.getText().concat("1"));
		}
		
		if(e.getSource()==boton2) {
            field.setText(field.getText().concat("2"));
		}
		
		if(e.getSource()==boton3)
            field.setText(field.getText().concat("3"));
		
		if(e.getSource()==boton4)
            field.setText(field.getText().concat("4"));
		
		if(e.getSource()==boton5)
            field.setText(field.getText().concat("5"));
		
		if(e.getSource()==boton6)
            field.setText(field.getText().concat("6"));
		
		if(e.getSource()==boton7)
			field.setText(field.getText().concat("7"));
		
		if(e.getSource()==boton8)
            field.setText(field.getText().concat("8"));
		
		if(e.getSource()==boton9)
            field.setText(field.getText().concat("9"));
		
		if(e.getSource()==boton0)
            field.setText(field.getText().concat("0"));
		
		if(e.getSource()==botonSuma)
        {
            operador1=Integer.parseInt(field.getText());
            operator=1;
            field.setText("");
        }
		
		if(e.getSource()==botonResta)
        {
			operador1=Integer.parseInt(field.getText());
            operator=2;
            field.setText("");
        }
        
        if(e.getSource()==botonMult)
        {
        	operador1=Integer.parseInt(field.getText());
            operator=3;
            field.setText("");
        }
        
        if(e.getSource()==botonDiv)
        {
        	operador1=Integer.parseInt(field.getText());
            operator=4;
            field.setText("");
        }
        
        if(e.getSource()==botonIgual)
        {
        	operador2=Integer.parseInt(field.getText());
        
            switch(operator)
            {
                case 1: r=operador1+operador2;
                    break;
        
                case 2: r=operador1-operador2;
                    break;
        
                case 3: r=operador1*operador2;
                    break;
        
                case 4: r=operador1/operador2;
                    break;
        
                default: r=0;
            }
        
            field.setText(""+r);
        }
        
        if(e.getSource()==botonClear)
            field.setText("");
        
            
	}

}
