<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<div class="row">
    <div class="col-sm-12"><h2>${car.brand} ${car.name} (${car.year.year}")</h2></div>
</div>
<div class="row">
    <div class="col-sm-3 col-xs-6">
        <img src="<%=request.getContextPath() %>/resources/img/logo/${fn:toLowerCase(car.brand)}.png" class="img-responsive"/>
    </div>
    <div class="col-sm-5">
        <p>${car.brand} ${car.name} (${car.type})</p>
    </div>

    <div class="col-sm-3 col-sm-offset-1">
        <p>${car.brand} ${car.name} (${car.type})</p>
    </div>
</div>
<%--<div class="row">--%>
    <%--<form:form>--%>
        <%--<input type="submit" value="Back" name="_eventId_back"--%>
               <%--class="btn btn-danger" />--%>
        <%--<c:choose>--%>
            <%--<c:when test="${isLoggedIn == true}">--%>
                <%--<input type="submit" value="Order this car!" name="_eventId_next"--%>
                       <%--class="btn btn-success" />--%>
            <%--</c:when>--%>
            <%--<c:otherwise>--%>
                <%--<input type="submit" value="Log in to order this car!" name="_eventId_login"--%>
                       <%--class="btn btn-warning" />--%>
            <%--</c:otherwise>--%>
        <%--</c:choose>--%>
    <%--</form:form>--%>
<%--</div>--%>