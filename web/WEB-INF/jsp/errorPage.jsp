<%@include file="/jsp/header.jsp" %>
<html>
<head>
    <title>ERROR 404</title>
</head>
<body>
<div class="blockIndex">
    <H2>ERROR 404</H2>
    <form action="${pageContext.request.contextPath}/command" method="get">
        <input type="hidden" name="do" value="exit"/>
        <input type="submit" value="Main Page" />
    </form>
</div>
</body>
</html>
