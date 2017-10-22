<%@include file="/WEB-INF/jsp/header.jsp" %>
<html>
<head>
    <title>PersonalProfile</title>
</head>
<body>
<div class="block">
    <form action="userEditPage" method="POST">
        <table border="1" align="center">
            <caption>PersonalProfile</caption>
            <tr>
                <th>ID</th>
                <th>Login</th>
                <th>Password</th>
                <th>Name</th>
                <th>role</th>
                <th>Phone Book</th>
            </tr>
            <tr>
                <td>${id}
                </td>
                <td>${login}
                </td>
                <td><input type="text" name="password" value="${password}"/>
                </td>
                <td><input type="text" name="name" value="${name}"/>
                </td>
                <td>${role}
                </td>
                <td>${phoneBookEntityList}
                </td>
            </tr>
        </table>
        <p>
            <input type="submit" value="Edit"/>
        </p>
    </form>
    <form action="indexPage" method="GET">
        <input type="hidden" name="param" value="" >
        <input type="submit" name="ok" value="Exit"/>
    </form>
</div>
</body>
</html>
