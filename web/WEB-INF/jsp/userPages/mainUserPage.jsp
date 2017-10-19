<%@include file="/jsp/header.jsp" %>
<html>
<head>
    <title>Welcome: </title>
</head>
<body>
<div class="block">
    <p>
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
            <th>login</th>
            <th>pass</th>
        <tr>
        <th>${user.login}</th>
        <th>${user.password}</th>
        </tr>


        <%-- <c:forEach items="${listAllUsers}" var="listUsers">
             <tr>
                 <th>${listUsers.id}</th>
                 <th>${listUsers.login}</th>
             </tr>
         </c:forEach>--%>

    </table>
    <p>
        <%--<form action="<c:url value="/jsp/userPages/userEditDataPage.jsp"/>">
            <input type="submit" value="PersonalProfile"/>
        </form>--%>
    </p>

</div>
</body>
</html>
