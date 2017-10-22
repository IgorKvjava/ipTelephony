
<%@include file="/WEB-INF/jsp/header.jsp" %>
<html>
<head>
    <title>LOGIN</title>
</head>
<body>
<div class="blockIndex">
    <h2>LOGIN</h2>
    <form action="mainUserPage" method="POST" >
            <label>Your LOGIN:
                <br>
            </label>
            <input type="text" name="login" value="" size="15" maxlength="15"/>
            <br>
            <label>Your  Password :
                <br>
            </label>
            <input type="password" name="password" value=""  size="15" maxlength="15"/>
            <p>
           <%-- <input type="hidden" name="do" value="login"/>--%>
            <input type="submit" name = "ok" value="Sign In" />
            </p>
    </form>
    <form action="registrationPage" method="GET">
        <input type="hidden" name="login" value="" >
        <input type="submit" name="ok" value="Sign up"/>
    </form>
    </div>
</body>
</html>
