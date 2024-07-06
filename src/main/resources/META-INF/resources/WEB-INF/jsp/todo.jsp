<%@include file="common/header.jspf"%>
<%@include file="common/navigation.jspf"%>

<div class="container">
<h1 class="mt-4">Enter Todo Details</h1>
<form:form method="post" modelAttribute="todo" class="mt-4">
    <div class="form-group mb-3">
        <fieldset class="mb-3">
        <label for="description" class="form-label ">Description:</label>
        <form:input type="text" path="description" required="required" class="form-control" />
        <form:errors path="description" cssClass="text-warning" />
        </fieldset>

        <fieldset class="mb-3">
            <label for="targetDate" class="form-label ">Target Date:</label>
            <form:input type="text" path="targetDate" required="required" class="form-control" />
            <form:errors path="targetDate" cssClass="text-warning" />
        </fieldset>

<%--            <label for="id" class="form-label">Id:</label>--%>
        <form:input type="hidden" path="id" required="required" class="form-control" />

<%--            <label for="done" class="form-label">Done:</label>--%>
        <form:input type="hidden" path="done" required="required" class="form-control" />
    </div>
    <button type="submit" class="btn btn-success">Submit</button>
</form:form>
</div>

<%@include file="common/footer.jspf"%>

<script type="text/javascript" >
$('#targetDate').datepicker({
    format: 'yyyy/mm/dd',
});
</script>


