<%-- 
    Document   : editfilecontent
    Created on : 2010.12.02., 14:48:47
    Author     : geza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="<s:url value="/content/ckeditor/ckeditor.js" />" ></script>
        <title>Edit content of page.</title>
    </head>
    <body>
        <s:form action="SaveContent">
            <s:hidden  name="filename" value="filename" />
            <div><s:submit action="" value="Save Content" /> <s:a action="ListDirectory" value="Vissza"/></div>
            <s:textarea name="bodycontent" cssClass="ckeditor" cols="150" rows="500" value="%{content}" />
        </s:form>
    </body>
</html>
