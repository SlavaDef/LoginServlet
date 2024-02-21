<html>
<body>
<form action="casino" method="POST">
<% String login = (String)session.getAttribute("user_login"); %>
<h1> <%= login %>, answer please on two questions:</h1>
<h1>Red or black?</h1>

    Play: <input type="radio" name="play" value="red" checked />Red
    <input type="radio" name="play" value="black" checked />Black
<br><br>

<h1>Not or many? </h1>

   Play2: <input type="radio" name="play2" value="not" checked />Not
    <input type="radio" name="play2" value="many" checked />Many

<br><br>
<input type="submit" value="Submit"/>
<br><br>
<br>Click this link to <a href="/login?a=exit">logout</a>
</form>
</body>
</html>
