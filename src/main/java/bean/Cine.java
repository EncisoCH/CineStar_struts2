package bean;

import java.util.ArrayList;
import java.util.List;

public class Cine {
	int idCine,Salas,idDistrito;
    String RazonSocial="",Direccion="",Telefonos="",Detalles="";


public Cine() {  }

    public Cine( String[] aRegistro ) {
        setRegistro( aRegistro );
    }

    public int getIdCine() {
        return idCine;
    }

    public void setIdCine(int idCine) {
        this.idCine = idCine;
    }

    public int getSalas() {
        return Salas;
    }

    public void setSalas(int Salas) {
        this.Salas = Salas;
    }

    public int getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(int idDistrito) {
        this.idDistrito = idDistrito;
    }

    public String getRazonSocial() {
        return RazonSocial;
    }

    public void setRazonSocial(String RazonSocial) {
        this.RazonSocial = RazonSocial;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefonos() {
        return Telefonos;
    }

    public void setTelefonos(String Telefonos) {
        this.Telefonos = Telefonos;
    }

    public String getDetalles() {
        return Detalles;
    }

    public void setDetalles(String Detalles) {
        this.Detalles = Detalles;
    }

    private void setRegistro(String[] aRegistro) {

        if (aRegistro == null) return;

            idCine = Integer.parseInt(aRegistro[0]);
            RazonSocial = aRegistro[1];
            Salas = Integer.parseInt(aRegistro[2]);
            idDistrito = Integer.parseInt(aRegistro[3]);
            Direccion = aRegistro[4];
            Telefonos = aRegistro[5];
            Detalles = aRegistro[6];
        }

    public Object[] getRegistro() {
        return new Object[] { idCine,RazonSocial,Salas,idDistrito,Direccion,Telefonos,Detalles};
    }

    public List<Cine> getRegistros( String[][] mRegistros ) {
        if ( mRegistros == null ) return null;

        List<Cine> lstCines = new ArrayList<>();
        for( String[] aCine : mRegistros )
            lstCines.add( new Cine( aCine ));

        return lstCines;
    }

}
