package atv7.moeda;

import java.text.NumberFormat;
import java.util.Locale;

public class MoedaUSA extends Moeda {

	public MoedaUSA(Double valor) {
		super(valor);
	}

	@Override
	public String getMoeda() {
		return NumberFormat
				.getCurrencyInstance(new Locale("en", "US"))
				.format(this.valor);
	}

	@Override
	public String toString() {
		return this.getMoeda();
	}

}
