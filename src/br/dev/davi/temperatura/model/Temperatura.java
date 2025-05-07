package br.dev.davi.temperatura.model;

public class Temperatura {
   private double celcius;
   
   public void Temperaturadouble(double celsius) {
	   this.celcius = celsius;
   }
   public double toFahrenheit() {
	return (celcius * 9/5) + 32;
   }
   public double Kelvin() {
	   return celcius + 273.15;
   }
   public boolean Valid() {
	   return celcius >= -273.15;
   }
   public double getCelcius() {
	   return celcius;
   }
public double converterParaFahreinheit() {
	// TODO Auto-generated method stub
	return 0;
}
public void setCelsius(double fahreinheit) {
	// TODO Auto-generated method stub
	
}

   }
	