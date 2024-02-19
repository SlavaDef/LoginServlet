<html>
<body>
<% String login = (String)session.getAttribute("user_login"); %>
<h1> <%= login %>, answer please on two questions:</h1>
<h1>Red or black?</h1>
<div>
    <input type="radio" id="first" name="play" value="red" checked />
    <label for="first">red</label>
</div>
<div>
    <input type="radio" id="second" name="play" value="black" checked />
    <label for="second">black</label>
</div>
<h1>Not or many? </h1>
<div>
    <input type="radio" id="thert" name="play" value="not" checked />
    <label for="thert">not</label>
</div>
<div>
    <input type="radio" id="four" name="play" value="many" checked />
    <label for="four">many</label>
</div>
<br>Click this link to <a href="/login?a=exit">logout</a>
</body>
</html>
