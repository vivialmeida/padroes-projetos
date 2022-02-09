package atv7.data;

import java.time.LocalDate;

public  abstract class Data {
	protected LocalDate data;
	
	public Data(LocalDate data) {
		this.data = data;
	}
	
    public abstract String getData();
  
}
