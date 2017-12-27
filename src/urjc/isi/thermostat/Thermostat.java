package urjc.isi.thermostat;

public class Thermostat {
	
	public enum PartOfDay {
		Sleep, Wake;
	}
	
	public enum Temp {
		High, Low;
	}
	
	private PartOfDay partOfDay;
	private Temp temp;
	
	public Thermostat() {
		partOfDay = PartOfDay.Wake;
		temp = Temp.Low;
	}
	
	public PartOfDay getPartOfDay () {
		return partOfDay;
	}
	
	public Temp getTemp () {
		return temp;
	}
	
	public void advance () {
		if (partOfDay == PartOfDay.Sleep) {
			partOfDay = PartOfDay.Wake;
		} else {
			partOfDay = PartOfDay.Sleep;
		}
	}
	
	public void up () {
		temp = Temp.High;
	}
	
	public void down () {
		temp = Temp.Low;
	}

}
