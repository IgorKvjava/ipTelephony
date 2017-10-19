<%@include file="/jsp/header.jsp" %>
<html>
<head>
    <title>Welcome: </title>
</head>
<body>
<div class="block">
    <p >
    <form action="${pageContext.request.contextPath}/command" method="get" class="exitBlock">
        <input type="hidden" name="do" value="exit"/>
        <input type="submit" value="Exit"/>
    </form>
    </p>
    Welcome:
    <br>
    <table border="1" align="center">
        <caption>Users</caption>
        <tr>
            <th>ID</th>
            <th>LOGIN</th>
        </tr>
    <c:forEach items="${sessionScope.list}" var="list1">
        <tab:table-body idUser="${list1.id}" loginUser="${list1.login}" />
    </c:forEach>
    </table>
    <p>
    <%--<form action="<c:url value="/jsp/userPages/userEditDataPage.jsp"/>">
        <input type="submit" value="PersonalProfile"/>
    </form>--%>
    </p>

</div>
</body>
</html>
