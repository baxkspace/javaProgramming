import java.util.Scanner;

public class Temperature {
	private double _value;
	
	public Temperature() {
		_value = 0;
	}
	public Temperature(double value) {
		_value = value;
	}
	
	public double getTemperatureFaherenheit() {
		double Faherenheit = _value * 1.8 + 32;
		return Faherenheit;
	}
	
	public double getTemperature() {
		return _value;
	}
	
	public void setValue(double value) {
		_value = value;
	}
	
	public boolean equals(Temperature newTemp) {
		if (newTemp._value == _value)
			return true;
		else return false;
	}
	
	public boolean IsGreaterThan(Temperature newTemp) {
		if (newTemp._value < _value)
			return true;
		else return false;
	}
	
	public boolean IsLessThan(Temperature newTemp) {
		if (newTemp._value > _value)
			return true;
		else return false;
	}
	
	public String toString() {
		String stringTemperature = _value + "도";
		return stringTemperature;
	}
}