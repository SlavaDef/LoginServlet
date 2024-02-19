<html>
<body>
<h1>Welcome in LasVegas Casino!!!!</h1>

<% String login = (String)session.getAttribute("user_login"); %>

<% if (login == null || "".equals(login)) { %>
<form action="/login" method="POST">
    Login: <input type="text" name="login"><br>
    Password: <input type="password" name="password"><br>
    <input type="submit" name="Submit"/>
</form>
<% } else { %>
<h1>You are logged in as: <%= login %></h1>
<br>Click this link to <a href="/login?a=exit">logout</a>
<% } %>
</body>
</html>
