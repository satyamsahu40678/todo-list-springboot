<%@include file="common/header.jspf"%>
<%@include file="common/navigation.jspf" %>

<div class="container">
<h1 class="mt-4">Your Todos</h1>
<table class="table table-striped table-hover mt-4">
<thead class="thead-dark">
<tr>
<%--            <th>Id</th>--%>
    <th>Description</th>
    <th>Target Date</th>
    <th>Done?</th>
    <th>Delete</th>
    <th>Update</th>
</tr>
</thead>
<tbody>
<c:forEach items="${todos}" var="todo">
    <tr>
<%--                <td>${todo.id}</td>--%>
        <td>${todo.description}</td>
        <td>${todo.targetDate}</td>
        <td>${todo.done}</td>
        <td><a href="delete-todo?id=${todo.id}" class="btn btn-warning">Delete Todo</a> </td>
        <td><a href="update-todo?id=${todo.id}" class="btn btn-success">Update Todo</a> </td>
    </tr>
</c:forEach>
</tbody>
</table>
<a href="add-todo" class="btn btn-success">Add Todo</a>
</div>

<%@include file="common/footer.jspf"%>
