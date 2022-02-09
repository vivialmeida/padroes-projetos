package atv7.factories;

import atv7.data.Data;
import atv7.data.DataEUA;
import atv7.moeda.Moeda;
import atv7.moeda.MoedaUSA;

import java.time.LocalDate;

public class LocalidadeEUA implements LocalidadeAbstractFactory{
	private LocalDate date;
	private Double valor;
	
	public LocalidadeEUA(LocalDate date, Double valor) {
		this.date = date;
		this.valor = valor;
	}
	@Override
	public Data getData() {
		return new DataEUA(date);
	}

	@Override
	public Moeda getMoeda() {
		return new MoedaUSA(valor);
	}

}
