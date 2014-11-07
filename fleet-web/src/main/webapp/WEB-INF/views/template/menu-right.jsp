<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:if test="${not empty pageContext.request.userPrincipal}">
    <li><a><c:out value="${pageContext.request.userPrincipal.name}" /></a></li>
</c:if>
<c:choose>
    <c:when test="${isLoggedIn}">
        <li>
            <c:url var="logoutUrl" value="/logout"/>
            <form action="${logoutUrl}"
                  method="post">
            <input type="submit" value="Log out" />
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>
        </li>
    </c:when>
    <c:otherwise>
        <li><a href="<%=request.getContextPath() %>/login">Login</a></li>
    </c:otherwise>
</c:choose>