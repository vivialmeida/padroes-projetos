package atv7.factories;


import atv7.data.Data;
import atv7.moeda.Moeda;

public interface LocalidadeAbstractFactory {

	public Data getData();
	public Moeda getMoeda();
}
