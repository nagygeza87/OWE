<%-- 
    Document   : listpagecontent
    Created on : 2010.11.25., 16:11:11
    Author     : Géza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Page contents</title>
    </head>
    <body>
        <s:iterator value="elemek" var="elemek">
            <s:if test="%{#elemek.type == 0}">
                <p><s:property value="%{#elemek.name}" /></p>
            </s:if>
            <s:else>
                <s:url action="ListDirectory" var="dirurl">
                    <s:param name="directory" value="<s:property value=%{#elemek.name} />" />
                </s:url>
                <p><s:a href="%{#dirurl}"><s:param value="%{#elemek.name}" /></s:a></p>
            </s:else>
        </s:iterator>
    </body>
</html>