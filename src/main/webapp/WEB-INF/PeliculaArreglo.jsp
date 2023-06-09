<%@page import="bean.Pelicula"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="s" uri="/struts-tags" %>
    
<% Pelicula Pelicula = ( Pelicula ) session.getAttribute( "data" ); %>
<br/><h1>Cartelera</h1><br/>

<div class="contenido-pelicula">
    <div class="datos-pelicula">
        <h2><%= Pelicula.getTitulo() %></h2>
        <p><%= Pelicula.getSinopsis() %></p>
        <br/>
        <div class="tabla">
            <div class="fila">
                <div class="celda-titulo">T�tulo Original :</div>
                <div class="celda"><%= Pelicula.getTitulo() %></div>
            </div>
            <div class="fila">
                <div class="celda-titulo">Estreno :</div>
                <div class="celda"><%= Pelicula.getFechaEstreno() %></div>
            </div>
            <div class="fila">
                <div class="celda-titulo">G�nero :</div>
                <div class="celda"><%= Pelicula.getGeneros() %></div>
            </div>
            <div class="fila">
                <div class="celda-titulo">Director :</div>
                <div class="celda"><%= Pelicula.getDirector() %></div>
            </div>
            <div class="fila">
                <div class="celda-titulo">Reparto :</div>
                <div class="celda"><%= Pelicula.getReparto() %></div>
            </div>
        </div>
    </div>
    <img src="img/pelicula/<%= Pelicula.getIdPelicula() %>.jpg" width="160" height="226"><br/><br/>
</div>
<div class="pelicula-video">
    <!-- <iframe width="580" height="400" src="http://www.youtube.com/v/6maujJFcuxA" frameborder="0" allowfullscreen></iframe> -->
    <embed src="http://www.youtube.com/v/<%= Pelicula.getLink() %>" type="application/x-shockwave-flash" allowscriptaccess="always" allowfullscreen="true" width="580" height="400">
</div>