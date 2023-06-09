<%@page import="bean.CinePelicula"%>
<%@page import="bean.CineTarifa"%>
<%@page import="java.util.List"%>
<%@page import="bean.Cine"%>
<%@ page pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<% Cine cine = ( Cine ) session.getAttribute("cine"); %>

<h2><%= cine.getRazonSocial() %></h2>
<div class="cine-info">
    <div class="cine-info datos">
        <p><%= cine.getDireccion() %> - <%= cine.getDetalles() %></p>
        <p>Teléfono: <%= cine.getTelefonos() %></p>
        <br/>
        <div class="tabla">
            <% List<CineTarifa> lstCineTarifa = ( List<CineTarifa> ) session.getAttribute("lstCineTarifa");
            boolean bolFila = true;
            for( CineTarifa CineTarifa : lstCineTarifa ) { %>
            <div class='<%= bolFila ? "fila" : "fila impar" %>' >
                <div class="celda-titulo"><%= CineTarifa.getDiasSemana() %></div>
                <div class="celda"><%= CineTarifa.getPrecios() %></div>
            </div>
            <% bolFila = !bolFila; } %>
        </div>
        <div class="aviso">
            <p>A partir del 1ro de julio de 2016, Cinestar Multicines realizará el cobro de la comisión de S/. 1.00 adicional al tarifario vigente, a los usuarios que compren sus entradas por el aplicativo de Cine Papaya para Cine Star Comas, Excelsior, Las Américas, Benavides, Breña, San Juan, UNI, Aviación, Sur, Porteño, Tumbes y Tacna.</p>
        </div>
    </div>
    <img src="img/cine/<%= cine.getIdCine() %>.2.jpg"/>
    <br/><br/><h4>Los horarios de cada función están sujetos a cambios sin previo aviso.</h4><br/>
    <div class="cine-info peliculas">
        <div class="tabla">
            <div class="fila">
                <div class="celda-cabecera">Películas</div>
                <div class="celda-cabecera">Horarios</div>
            </div>
            
            <% List<CinePelicula> lstCinePelicula = ( List<CinePelicula> ) session.getAttribute("lstCinePelicula");
            bolFila = false;
            for( CinePelicula CinePelicula : lstCinePelicula ) { %>
            <div class= '<%= bolFila ? "fila" : "fila impar" %>'>
                <div class="celda-titulo"><%= CinePelicula.getTitulo() %></div>
                <div class="celda"><%= CinePelicula.getHorarios() %></div>
            </div>
            <% bolFila = !bolFila; } %>
            
        </div>
    </div>
</div>
<div>
    <img style="float:left;" src="img/cine/<%= cine.getIdCine() %>.3.jpg"/>
    <span class="tx_gris">Precios de los juegos: desde S/1.00 en todos los Cine Star.<br/>
        Horario de atención de juegos es de 12:00 m hasta las 10:30 pm. 
        <br/><br/>
        Visitános y diviértete con nosotros. 
        <br/><br/>
        <b>CINESTAR</b>, siempre pensando en tí. 
    </span>		
</div>