<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="row">
    <div class="col-md-12"><h2>LOGIN TO ORDER!</h2></div>
</div>
<div class="row">
    <h2>Some day, you can log in here to order your car.</h2>
</div>
<c:if test="${param.error}">
    <div class="row">
        <div class="alert alert-danger"><spring:message code="error.onLogin"/></div>
    </div>
</c:if>
<c:if test="${param.logout}">
    <div class="row">
        <div class="alert alert-danger">You have been logged out.</div>
    </div>
</c:if>
<div class="row">
    <form name='f' action="processLogin" method='POST'>
        <div class="form-group">
            <label for="email">Email</label>
            <input class="form-control" type="text" id="email" name="email"/>
        </div>
        <div class="form-group">
            <label for="password">Password</label>
            <input class="form-control" type="password" id="password" name="password"/>
        </div>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
        <div class="form-group">
            <input name="submit" type="submit" value="Login!" class="btn btn-primary"/>
        </div>
    </form>
</div>
