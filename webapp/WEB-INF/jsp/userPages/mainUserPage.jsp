<%@include file="/WEB-INF/jsp/header.jsp" %>
<html>
<head>
    <title>Welcome: </title>
</head>
<body>
<div class="block">
    <p>
    <form action="indexPage" method="GET">
        <input type="hidden" name="param" value="">
        <input type="submit" name="ok" value="Exit"/>
    </form>
    </p>
    Welcome:
    <br>
    <table border="1" align="center">
        <caption>User</caption>
        <tr>
            <th>Id</th>
            <th>login</th>
            <th>pass</th>
            <th>user name</th>
            <th>role</th>
        <tr>
            <th>${user.id}</th>
            <th>${user.login}</th>
            <th>${user.password}</th>
            <th>${user.userName}</th>
            <th>${user.role}</th>
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
