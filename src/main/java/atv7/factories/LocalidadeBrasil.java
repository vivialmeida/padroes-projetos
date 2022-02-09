package atv7.factories;

import atv7.data.Data;
import atv7.data.DataBrasil;
import atv7.moeda.Moeda;
import atv7.moeda.MoedaBrasil;
import java.time.LocalDate;

public class LocalidadeBrasil implements LocalidadeAbstractFactory{
	private LocalDate date;
	private Double valor;
	
	public LocalidadeBrasil(LocalDate date, Double valor) {
		this.date = date;
		this.valor = valor;
	}
	
	
	@Override
	public Data getData() {
		return new DataBrasil(date);
	}

	@Override
	public Moeda getMoeda() {
		return new MoedaBrasil(valor);
	}

}
