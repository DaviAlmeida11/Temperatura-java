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

public class TelaConversor<publicvoid> {
//Priva todos os elementos da tela 
	private JTextField textCelsius;
	private JLabel labelCelsius;
	private JButton buttonKelvin;
	private JButton buttonFahrenheit;
	private JLabel labelResultado;
	private JLabel labelMensagemErro;
	private Color labelsColor = new Color(255, 0, 0);
	// declara uma vareávem em selcius
	protected String celsius;

	// Criar tela conversor
	public void criarTelaConversor() {
		// Configurações de tela
		JFrame tela = new JFrame();
		Dimension size = new Dimension();
		size.setSize(800, 400);
		tela.setSize(size);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		tela.setResizable(false);
		tela.setTitle("Conversor de Temperatura");

		// Criar um JLabel e um JTextField para o Celsius
		labelCelsius = new JLabel();
		labelCelsius.setText("DIGITE A TEMPERATURA EM CELSIUS");
		labelCelsius.setBounds(20, 20, 400, 30);
		textCelsius = new JTextField();
		textCelsius.setBounds(20, 50, 440, 40);

		// Criação do botão Fahrenheit
		buttonFahrenheit = new JButton();
		buttonFahrenheit.setBounds(20, 100, 200, 60);
		buttonFahrenheit.setText("FIHRENHEIGT");
		// Criação do botão kelvin
		buttonKelvin = new JButton("Converter para Kelvin");
		buttonKelvin.setBounds(250, 100, 200, 60);
		// Configurações para criação do resultado
		labelResultado = new JLabel();
		labelResultado.setText("");
		labelResultado.setBounds(20, 200, 440, 30);
		// Configurações para criação do resultado
		labelMensagemErro = new JLabel();
		labelMensagemErro.setText("");
		labelMensagemErro.setBounds(20, 200, 440, 30);
		labelMensagemErro.setText("Erro : temperatura não identificada!!!");
		// Elementos da tela
		tela.getContentPane().add(labelCelsius);
		tela.getContentPane().add(textCelsius);
		tela.getContentPane().add(buttonKelvin);
		tela.getContentPane().add(buttonFahrenheit);
		tela.getContentPane().add(labelResultado);
		tela.getContentPane().add(labelMensagemErro);
		// Configura a ação de um botão
		buttonFahrenheit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// Protege o usuario de pos respostas que sejam exceção no programa
				try {
					String celsius = textCelsius.getText();
					Temperatura temp1 = new Temperatura();
					double celsiusDouble = Double.valueOf(celsius);
					temp1.setCelsius(celsiusDouble);
					double fahreinheit = temp1.converterParaFahreinheit();

					labelResultado.setText(fahreinheit + " FAHREINHEIT");
					labelResultado.setVisible(true);
					labelMensagemErro.setVisible(false);
					// envia dados para servidores sem recarregar a página
				} catch (Exception ex) {
					labelResultado.setVisible(false);
					labelMensagemErro.setVisible(true);
				}

			}
		});

		// Configura a ação de um botão
		buttonKelvin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// Protege o usuario de pos respostas que sejam exceção no programa

				try {
					String celsius = textCelsius.getText();
					Temperatura temp2 = new Temperatura();
					double celsiusDouble = Double.valueOf(celsius);
					temp2.setCelsius(celsiusDouble);
					double kelvin = temp2.converteParaKelvin();

					labelResultado.setText(kelvin + " KELVIN");
					labelResultado.setVisible(true);
					labelMensagemErro.setVisible(false);
					// envia dados para servidores sem recarregar a página
				} catch (Exception ex) {
					labelResultado.setVisible(false);
					labelMensagemErro.setVisible(true);
				}
			}
		});

		tela.setVisible(true);

	}

}