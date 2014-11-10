<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="row">
    <div class="col-md-12"><h2><spring:message code="car.list.title"/></h2></div>
</div>
<div class="row">
    <div class="col-md-12">
        <p>${error}</p>
        <c:if test="${error==null}">
        <table class="table">
            <tr>
                <th><spring:message code="car.brand"/></th>
                <th><spring:message code="car.model"/></th>
                <th><spring:message code="car.type"/></th>
                <th>&nbsp;</th>
            </tr>
            <c:forEach var="carModel" items="${carModels}">
                <tr>
                    <td>${carModel.brand}</td>
                    <td>${carModel.name}</td>
                    <td>${carModel.type}</td>
                    <td>
                        <a href="car/${carModel.id}"><spring:message code="actions.details" /></a>
                    </td>
                </tr>
            </c:forEach>
        </table>
        </c:if>
    </div>
</div>