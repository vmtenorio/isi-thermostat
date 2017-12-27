
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

}
