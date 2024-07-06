<html>
<head>
    <title>
        Login Page
    </title>
</head>
<body>
<div class="container">
<h1 >Welcome to Login Page!</h1>
    <pre>${errorMessage}</pre>
    <form method="post">
        Name: <input type="text" name="name">
        Password: <input type="password" name="password">
        <input type="submit">
    </form>
</div>

<%--    use expression language to get value from model --%>
</body>
</html>