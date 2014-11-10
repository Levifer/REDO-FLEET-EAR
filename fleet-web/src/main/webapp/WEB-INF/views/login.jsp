<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="row">
    <h2><spring:message code="menu.login"/></h2>
</div>
<c:if test="${param.error}">
    <div class="row">
        <div class="alert alert-danger"><spring:message code="error.onLogin"/></div>
    </div>
</c:if>
<c:if test="${param.logout}">
    <div class="row">
        <div class="alert alert-success"><spring:message code="message.logout"/></div>
    </div>
</c:if>
<div class="row">
    <form name='f' action="processLogin" method='POST'>
        <div class="form-group">
            <label for="email"><spring:message code="user.email"/></label>
            <input class="form-control" type="text" id="email" name="email"/>
        </div>
        <div class="form-group">
            <label for="password"><spring:message code="user.password"/></label>
            <input class="form-control" type="password" id="password" name="password"/>
        </div>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
        <div class="form-group">
            <input name="submit" type="submit" value="Login!" class="btn btn-primary"/>
        </div>
    </form>
</div>
