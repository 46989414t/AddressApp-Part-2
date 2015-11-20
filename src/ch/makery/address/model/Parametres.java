package ch.makery.address.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by 46989414t on 20/11/15.
 */
public class Parametres {
    private final StringProperty ciudad;
    private final StringProperty unidad;
    private final IntegerProperty dias;

    public Parametres(String ciudad, String unidad, Integer dias) {
        this.ciudad = new SimpleStringProperty(ciudad);
        this.unidad = new SimpleStringProperty(unidad);
        this.dias =  new SimpleIntegerProperty(dias);

    }

    public String getCiudad() {
        return this.ciudad.get();
    }

    public StringProperty ciudadProperty() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad.set(ciudad);
    }

    public String getUnidad() {
        return this.unidad.get();
    }

    public StringProperty unidadProperty() {
        return this.unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad.set(unidad);
    }

    public int getDias() {
        return this.dias.get();
    }

    public IntegerProperty diasProperty() {
        return this.dias;
    }

    public void setDias(int dias) {
        this.dias.set(dias);
    }
}
