<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Index</title>
</head>
<body>
<h1>Welcome</h1>
<p><a href="<s:url action='message'/>">Hello World</a></p>

<s:form action="inscription">
    <s:textfield name="user.nom" label="Nom" requiredLabel="true"/>
    <s:textfield name="user.email" label="Email" requiredLabel="true"/>
    <s:password name="user.motdepasse" label="Mot de passe" requiredLabel="true"/>
    <s:password name="confirmation" label="Confirmer le mot de passe" requiredLabel="true"/>
    <s:submit value="OK"/>
</s:form>

</body>
</html>