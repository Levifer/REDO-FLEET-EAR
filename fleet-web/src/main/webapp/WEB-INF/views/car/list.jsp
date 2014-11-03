<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="row">
    <div class="col-md-12"><h2><spring:message code="car.flowTitle.list"/></h2></div>
</div>
<div class="row">
    <div class="col-md-12">
        <table class="table">
            <tr>
                <th><spring:message code="car.brand"/></th>
                <th><spring:message code="car.model"/></th>
                <th><spring:message code="car.type"/></th>
                <th>&nbsp;</th>
            </tr>
            <c:forEach var="car" items="${cars}">
                <tr>
                    <td>${car[1]}</td>
                    <td>${car[2]}</td>
                    <td>${car[3]}</td>
                    <td>
                        <a href="car/${car[0]}"><spring:message code="actions.details"/></a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>