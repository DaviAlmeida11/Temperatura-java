package br.dev.davi.temperatura.gui;
import javax.swing.*; 
import java.awt.*;
import br.dev.davi.temperatura.model.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.dev.davi.temperatura.model.*; 
public class TelaConversor<publicvoid>{

private JTextField textCelsius;
private JLabel labelCelsius ;
private JButton buttonKelvin;
private JButton buttonFahrenheit;
private JLabel labelResultado;
private JLabel labelMensagemErro;

private Color labelsColor = new Color(255,0,0);

public void criarTelaConversor() {
	
JFrame tela = new JFrame();
Dimension size = new Dimension();
size.setSize(500,400);
tela.setSize(size);
tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
tela.setLayeredPane(null);
tela.setLocationRelativeTo(null);
tela.setResizable(false);
tela.setTitle("Conversor de Temperatura");

labelCelsius = new JLabel();
labelCelsius.setText("digite a temperatura em CELSIUS");
labelCelsius.setBounds(20, 20, 250, 50);
 
textCelsius = new JTextField();
textCelsius.setBounds(20,70,360,30);

buttonFahrenheit = new JButton();
buttonFahrenheit.setBounds(20,140,30,20);

labelResultado = new JLabel();
labelResultado.setText("");
labelResultado.setBounds(20, 200,360, 10);

labelMensagemErro = new JLabel();
labelMensagemErro.setText("");
labelMensagemErro.setBounds(20, 300,400,0);
}

publicvoid actionPerfomed(ActionEvent e) {

Temperatura temp = new Temperatura();
double fahreinheit = Double.parseDouble(textCelsius.getText());
temp.setCelsius(fahreinheit);
double tempeeratura = temp.converterParaFahreinheit();
labelResultado.setText(temp + "° FAHRENHEIT");
labelMensagemErro.setText("");


} catch(Exception erro) {
labelResultado.setText("");
labelMensagemErro.setText(" Ocorreu um Erro! Insira apenas números. ");



try {
	Temperatura temperatura = new Temperatura();
	double kelvin = Double.parseDouble(textCelsius.getText());
	temperatura.setCelsius(kelvin);
	double temp = temperatura.converterParaFahreinheit();
	labelResultado.setText(temp + " KELVIN");
	labelMensagemErro.setText("");


	JFrame tela;
	tela.getContentPane().add(labelResultado);
	tela.getContentPane().add(labelMensagemErro);


}
}
}





	

		