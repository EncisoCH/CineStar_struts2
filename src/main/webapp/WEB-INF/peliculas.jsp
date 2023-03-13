<%@page import="bean.Pelicula"%>
<%@page import="java.util.List"%>
<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<br/><h1>Cartelera</h1><br/>

<% List<Pelicula> peliculas = ( List<Pelicula> ) session.getAttribute( "data" );
   for ( Pelicula Pelicula : peliculas ) {%>

<div class="contenido-pelicula">
    <div class="datos-pelicula">
        <h2><%= Pelicula.getTitulo() %></h2><br/>
        <p><%= Pelicula.getSinopsis() %></p>
        <br/>
        <div class="boton-pelicula"> 
            <a href="svlPelicula?id=<%= Pelicula.getIdPelicula() %>" >
                <img src="img/varios/btn-mas-info.jpg" width="120" height="30" alt="Ver info"/>
            </a>
        </div>
        <div class="boton-pelicula"> 
            <a href="http://www.cinestar.com.pe/popups/trailer/<%= Pelicula.getLink() %>" onclick="return hs.htmlExpand(this, { objectType: 'iframe' } )" >
                <img src="img/varios/btn-trailer.jpg" width="120" height="30" alt="Ver trailer"/>
            </a>
        </div> 
    </div>
    <img src="img/pelicula/<%= Pelicula.getIdPelicula() %>.jpg" width="160" height="226"/><br/><br/>
</div>
<% } %>