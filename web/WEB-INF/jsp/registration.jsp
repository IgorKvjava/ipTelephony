<%@include file="/WEB-INF/jsp/header.jsp" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<div class="block">
    <form action="passwordPage" method="POST">
        <p>
            <label>Your LOGIN<br></label>
            <input type="text" name="login" value="" size="15" maxlength="15"/>
        <%--</p>
        <c:if test="${login_used != null}">
            <h1>${login_used}</h1>
        </c:if>
        <p>--%>
            <input type="submit" value="Accept"/>
        </p>
    </form>
    <form action="indexPage" method="GET">
        <input type="hidden" name="param" value="" >
        <input type="submit" name="ok" value="Exit"/>
    </form>
</div>
</body>
</html>
