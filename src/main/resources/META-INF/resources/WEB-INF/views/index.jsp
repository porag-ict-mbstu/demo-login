<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>--%>
<html>
<title>Login Page</title>
<style>

    .login-input{
        padding:5px 10px;
        width:250px;
        border-radius:3px;
        border:1px solid #aaa
    }

   .loin-button{
       background-color: #2778bf;
       color: white;
       border: none !important;
       border-radius: 3px;
       padding: 7px 10px;
       outline: none !important;
   }

   .loin-button:hover{
       background-color: #004ebf;
   }
</style>
<body>
<center>

    <h3 style="margin-top: 100px">Login Here</h3>
    <form method="post" action="/login">
        <p style="color: red">
            <c:out value="${error}"></c:out>
        </p>
        <table>
            <tr>
                <td>
                    <p>User Email :</p>
                </td>
                <td>
                    <input class="login-input" type="email" name="email" placeholder="Enter your email address" required>
                </td>
            </tr>
            <tr>
                <td>
                    <p>Password :</p>
                </td>
                <td>
                    <input class="login-input" type="password" name="password" placeholder="Enter pasword"
                           required minlength="6">
                </td>
            </tr>
            <tr>
                <td>
                    <input class="loin-button" type="submit" value="Login">
                </td>
            </tr>
        </table>

    </form>

</center>
</body>
</html>