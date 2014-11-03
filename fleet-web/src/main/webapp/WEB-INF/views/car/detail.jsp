<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="row">
    <div class="col-md-12"><h2><spring:message code="car.flowTitle.detail"/></h2></div>
</div>
<div class="row">
    <div class="col-md-6">
        <img src="<%=request.getContextPath() %>/resources/img/logo/audi.jpg" class="img-responsive"/>
    </div>
    <div class="col-md-6">
        <p>Audi</p>
        <p><c:out value="${id}"/></p>
    </div>
</div>
<div class="row">
    <form:form>
        <input type="submit" value="Back" name="_eventId_back"
               class="btn btn-danger" />
        <c:choose>
            <c:when test="${isLoggedIn == true}">
                <input type="submit" value="Order this car!" name="_eventId_next"
                       class="btn btn-success" />
            </c:when>
            <c:otherwise>
                <input type="submit" value="Log in to order this car!" name="_eventId_login"
                       class="btn btn-warning" />
            </c:otherwise>
        </c:choose>
    </form:form>
</div>