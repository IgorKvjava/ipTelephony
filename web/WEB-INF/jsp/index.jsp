<%@include file="/jsp/header.jsp" %>
<html>
<head>
    <title>LOGIN</title>
</head>
<body>
<div class="blockIndex">
    <h2>LOGIN</h2>
    <form action="${pageContext.request.contextPath}/command" method="post" >
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
            <input type="hidden" name="do" value="login"/>
            <input type="submit" value="SignIn" />
            </p>
    </form>
    <form action="${pageContext.request.contextPath}/jsp/registration.jsp" >
        <button type="submit">SignUp</button>
    </form>
    </div>
</body>
</html>
