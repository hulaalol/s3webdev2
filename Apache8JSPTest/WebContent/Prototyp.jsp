<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>


<jsp:useBean id="p" class="databeans.Person"/>
<jsp:setProperty property="*" name="p"/>
<%@ page import ="java.util.ArrayList" %>


<%


ArrayList people = (ArrayList) session.getAttribute("people");

if(people==null){
	people = new ArrayList();
	session.setAttribute("people", people);
}

String action = request.getParameter("action");

if (action != null){
	
	
	
	if(action.equals("Abesenden")){
		
		session.setAttribute("person",p);
		people.add(p);
		session.setAttribute("people",people);
		
		p = new databeans.Person();

	}else if(action.equals("Wiederherstellen")){
		p = (databeans.Person) session.getAttribute("person");
		if(p == null){
			p = new databeans.Person(); //Leerstrings
		}
	}
	
	
	
}



%>

<body>

<form action="http://localhost:8080/Apache8JSPTest/Prototyp.jsp" method="post">
<table>
	<tr>
		<td>Name:</td>
		<td><input type="text" name="name" size="30" value="<%=p.getName()%>"/></td>
	</tr>
	<tr>
		<td>Vorname:</td>
		<td><input type="text" name="vorname" size="30" value="<%=p.getVorname()%>"/></td>
	</tr>
	<tr>
		<td>Adresse:</td>
		<td><input type="text" name="adresse" size="30" value="<%=p.getAdresse()%>"/></td>
	</tr>
	<tr>
		<td><input type="submit" name="action" value="Absenden"/></td>
		<td><input type="submit" name="action" value="Wiederherstellen"/></td>
	</tr>
</table>
</form>


<%
if (people.size() > 0){
%>

<table>


<% for (int i=0;i<people.size();i++){
%>

<tr>
<td>
<%((databeans.Person)people.get(i)).getName();%>
</td>
<td>
</td>
<%((databeans.Person)people.get(i)).getVorname();%>
<td>
<%((databeans.Person)people.get(i)).getAdresse();%>
</td>
</tr>

<%} %>
</table>

<% } %>

</body>
</html>