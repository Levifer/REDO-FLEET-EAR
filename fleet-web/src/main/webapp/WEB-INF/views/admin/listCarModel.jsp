<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<spring:url value="/admin/carmodel" var="carmodelUrl"/>
<div class="row">
    <div class="col-sm-12"><h2><spring:message code="admin.carmodel.title"/></h2></div>
</div>
<div class="row">
    <div class="col-sm-3 col-sm-offset-9 text-right"><a href="${carmodelUrl}/new" class="btn btn-success"><spring:message code="admin.carmodel.new"/></a></div>
</div>
<div class="row">
    <div class="col-sm-12">
        <p>${error}</p>
        <c:if test="${error==null}">
        <table class="table">
            <tr>
                <th><spring:message code="car.brand"/></th>
                <th><spring:message code="car.model"/></th>
                <th><spring:message code="car.type"/></th>
                <th><spring:message code="car.year"/></th>
                <th><spring:message code="car.fuel"/></th>
                <th>&nbsp;</th>
            </tr>
            <c:forEach var="car" items="${carModels}">
                <tr>
                    <td>${car.brand}</td>
                    <td>${car.name}</td>
                    <td>${car.type}</td>
                    <td>${car.year.year}</td>
                    <td>${car.fuelType}</td>
                    <td>
                        <a href="${carmodelUrl}/${car.id}"><spring:message code="actions.update" /></a>
                    </td>
                </tr>
            </c:forEach>
        </table>
        </c:if>
    </div>
</div>