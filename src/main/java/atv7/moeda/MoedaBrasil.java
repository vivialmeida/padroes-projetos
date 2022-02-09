package atv7.moeda;

import java.text.NumberFormat;
import java.util.Locale;

public class MoedaBrasil extends Moeda{

	public MoedaBrasil(Double valor) {
		super(valor);
	}

	@Override
	public String getMoeda() {
		return NumberFormat
				.getCurrencyInstance(new Locale("pt", "BR"))
				.format(this.valor);
	}
	
	@Override
	public String toString() {
		return this.getMoeda();
	}

}
