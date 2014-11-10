<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"  %>
<%-- Variables --%>
<spring:url var="loginUrl" value="/login"/>
<spring:url var="adminUrl" value="/admin"/>
<spring:url var="logoutUrl" value="/logout"/>
<spring:message var="logoutValue" code="menu.logout"/>

<%-- Page --%>
<c:choose>
    <c:when test="${not empty pageContext.request.userPrincipal}">
        <li><p><span class="glyphicon glyphicon-user"></span> <sec:authentication property="principal.username" /></p></li>
        <sec:authorize access="hasRole('ROLE_FLEET_MANAGER')">
            <li>
                <a href="${adminUrl}/carmodel"><span class="glyphicon glyphicon-lock"></span> Admin</a>
            </li>
        </sec:authorize>
        <li>
            <form action="${logoutUrl}" method="post">
                <input type="submit" value="${logoutValue}" />
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            </form>
        </li>
    </c:when>
    <c:otherwise>
        <li>
            <a href="${loginUrl}"><span class="glyphicon glyphicon-log-in"></span> <spring:message code="menu.login"/></a>
        </li>
    </c:otherwise>
</c:choose>