<%@include file="/WEB-INF/jsp/header.jsp" %>
<html>
<head>
    <title>LOGIN ${lang} Enter password</title>
</head>
<body>
<div class="block">
    <form action="userEditPage" method="POST">
        <p>
            <label>Your LOGIN: ${login}<br></label>
        </p>
        <label>Your ${lang} Password:<br></label>
        <input type="text" name="password" value="" size="15" maxlength="15"/>
            <input type="submit" value="Sign Up"/>
        </p>
    </form>

    <form action="indexPage" method="GET">
        <input type="hidden" name="param" value="" >
        <input type="submit" name="ok" value="Exit"/>
    </form>
    <%--<c:if test="${checkInUserMessage != null}">
        <h1><fmt:message key="${checkInUserMessage}" bundle="${lang}"/></h1>
    </c:if>--%>
</div>
</body>
</html>
