<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h2>Inscription</h2>

    <s:form action="inscription">
        <s:textfield name="user.nom" label="Nom" requiredLabel="true"/>
        <s:textfield name="user.email" label="Email" requiredLabel="true"/>
        <s:password name="user.motdepasse" label="Mot de passe" requiredLabel="true"/>
        <s:password name="confirmation" label="Confirmer le mot de passe" requiredLabel="true"/>
    <s:submit value="OK"/>
    </s:form>
</body>
</html>
