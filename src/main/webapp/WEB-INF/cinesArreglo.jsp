<%@ page pageEncoding="UTF-8" %>

<%@ taglib prefix="s" uri="/struts-tags" %>

<br/><h1>Nuestros Cines</h1><br/>
<% String[][] cines = ( String[][] ) session.getAttribute("cines");
   for ( String[] aCines : cines ) {%>
<div class="contenido-cine">
    <img src="img/cine/<%= aCines[0] %>.1.jpg" width="227" height="170"/>
    <div class="datos-cine">
        <h4><%= aCines[1] %></h4><br/>
        <span><%= aCines[4] %> - <%= aCines[6] %><br/><br/>Teléfono: <%= aCines[5] %></span>
    </div>
    <br/>
    <a href="svlCine?idCine=<%= aCines[0] %>">
        <img src="img/varios/ico-info2.png" width="150" height="40"/>
    </a>
</div>
<% } %>