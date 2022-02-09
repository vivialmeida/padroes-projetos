package atv7.data;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataBrasil extends Data{

	public DataBrasil(LocalDate data) {
		super(data);
	}

	@Override
	public String getData() {
		Locale local = new Locale("pt","BR");
		return SimpleDateFormat.getDateInstance(
				SimpleDateFormat.FULL,local).format(Date.valueOf(data));
	}
	
	@Override
	public String toString() {
		return this.getData();
	}

}
