<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:choose>
    <c:when test="${loggedIn.equals('yes')}">
        <li><a href="<%=request.getContextPath() %>">Logout</a></li>
    </c:when>
    <c:otherwise>
        <li><a href="<%=request.getContextPath() %>/login">Login</a></li>
    </c:otherwise>
</c:choose>