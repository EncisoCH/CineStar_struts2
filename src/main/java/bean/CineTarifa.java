package bean;

import java.util.ArrayList;
import java.util.List;

public class CineTarifa {
String DiasSemana="", Precios="";

    public CineTarifa() {  }

    public CineTarifa( String DiasSemana, String Precio ) {
        this.DiasSemana = DiasSemana;
        this.Precios = Precio;
    }

    public String getDiasSemana() {
        return DiasSemana;
    }

    public void setDiasSemana(String DiasSemana) {
        this.DiasSemana = DiasSemana;
    }

    public String getPrecios() {
        return Precios;
    }

    public void setPrecios(String Precios) {
        this.Precios = Precios;
    }

    public List<CineTarifa> getCineTarifaList( String[][] mRegistros ) {
        if ( mRegistros == null ) return null;

        List<CineTarifa> lstCineTarifa = new ArrayList<>();
        for( String[] aCineTarifa : mRegistros )
            lstCineTarifa.add( new CineTarifa( aCineTarifa[0], aCineTarifa[1] ) );

        return lstCineTarifa;
    }

}
