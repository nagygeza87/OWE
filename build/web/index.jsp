<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
    <head>
    </head>

    <body>
        <h3>Online Website Editor</h3>
        <p>
            Kérem írja be a következő információkat:
        </p>
        <s:form action="Login" method="POST">
            <s:textfield name="address" label="ftp://"/> <br/>
            <s:textfield name="username" label="felhasználónév" /><br/>
            <s:password name="password" label="password" /> <br/>
            <s:submit value="Bejelentkezés" />
        </s:form>
    </body>
</html>

