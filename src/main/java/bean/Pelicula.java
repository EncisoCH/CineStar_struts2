package bean;

public class Pelicula {
	int id, idClasificacion, idEstadoPeli;
    String Titulo="", FechaEstreno="", Director="", Generos="", Duracion="", Link="", Reparto="", Sinopsis="";

    public Pelicula() {    }


    public int getIdPelicula() {
        return id;
    }

    public void setIdPelicula(int idPelicula) {
        this.id = idPelicula;
    }

    public int getIdClasificacion() {
        return idClasificacion;
    }

    public void setIdClasificacion(int idClasificacion) {
        this.idClasificacion = idClasificacion;
    }

    public int getIdEstadoPeli() {
        return idEstadoPeli;
    }

    public void setIdEstadoPeli(int idEstadoPeli) {
        this.idEstadoPeli = idEstadoPeli;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getFechaEstreno() {
        return FechaEstreno;
    }

    public void setFechaEstreno(String FechaEstreno) {
        this.FechaEstreno = FechaEstreno;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public String getGeneros() {
        return Generos;
    }

    public void setGeneros(String Generos) {
        this.Generos = Generos;
    }

    public String getDuracion() {
        return Duracion;
    }

    public void setDuracion(String Duracion) {
        this.Duracion = Duracion;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String Link) {
        this.Link = Link;
    }

    public String getReparto() {
        return Reparto;
    }

    public void setReparto(String Reparto) {
        this.Reparto = Reparto;
    }

    public String getSinopsis() {
        return Sinopsis;
    }

    public void setSinopsis(String Sinopsis) {
        this.Sinopsis = Sinopsis;
    }

    public Pelicula(String[] aRegistro) {
        if ( aRegistro == null ) return;

        id = Integer.parseInt( aRegistro[0] );
        Titulo = aRegistro[1];

        if ( aRegistro.length == 4 ) {
            Sinopsis = aRegistro[2];
            Link = aRegistro[3];
            return;
        }
            FechaEstreno = aRegistro[2];
            Director = aRegistro[3];
            Generos = aRegistro[4];
            idClasificacion = Integer.parseInt( aRegistro[5] );
            idEstadoPeli = Integer.parseInt( aRegistro[6] );
            Duracion = aRegistro[7];
            Link = aRegistro[8];
            Reparto = aRegistro[9];
            Sinopsis = aRegistro[10];
        }


}
