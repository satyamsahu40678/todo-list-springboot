<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

<div class="container mt-4">
    <h1>Welcome, ${name}</h1>
    <%-- <div>Your password: ${password}</div> --%>
    <p><a href="list-todos" class="btn btn-primary mt-3">Manage Your Todos</a></p>
</div>

<%@ include file="common/footer.jspf" %>
