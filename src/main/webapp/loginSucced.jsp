<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %><%--
  Created by IntelliJ IDEA.
  User: basti
  Date: 24.01.2023
  Time: 13:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="display:flex;">
<%

    session = request.getSession();


%>
<p>Patient</p>
<p>    ---<%= request.getAttribute("vorname")  %>--- --- <%= request.getAttribute("nachname")%>----  </p>
<p> Patient- Nr:  <%= request.getAttribute("patnr")%></p>
    <p>
    </p>
</div>
<div style="display:flex;">
<p>Kontakt:</p>
    <p>   Straßenname ---------- Hausnummer------ PLZ ---- Stadt------ </p>

</div>
<div style="display:flex;">
<p>geb.:</p>
    <p> 12.123.3412</p>
    <p>Geschlecht:</p>
    <p> <%= request.getAttribute("geschlecht")%></p>
</div>
<div style="display:flex;">
<p>Behandelnder Arzt</p>
    <p> arztname</p>
    <p>Erzeugt am:</p>
    <p> 22.12.34</p>
</div>
<hr/>
<h1>Vorläufiger Arztbrief</h1>
</body>
</html>
