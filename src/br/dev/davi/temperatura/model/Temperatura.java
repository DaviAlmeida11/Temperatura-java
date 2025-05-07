package br.dev.davi.temperatura.model;

//Torna a celsius privado
public class Temperatura {
	private double celsius;

	//Metodos Get e Set para acessar e atribuir valores
	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(double celsius) {
		this.celsius = celsius;

	}
	//Calcula a conversão Kelvin 
	public double converteParaKelvin() {
		double kelvin = celsius + 273.15;
		return kelvin;
	}
	//Calcula a conversão para Fahreinhei
	public double converterParaFahreinheit() {
		double fahreinheit = (celsius * 9 / 5) + 32;
		return fahreinheit;
	}
}
