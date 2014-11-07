<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%-- Variables --%>
<spring:url value="/resources/img" var="imgUrl"/>

<%-- Page --%>
<div class="row">
    <div class="col-sm-12"><h2>${car.brand} ${car.name} (${car.year.year}")</h2></div>
</div>
<div class="row">
    <div class="col-sm-3 col-xs-6">
        <img src="${imgUrl}/car/${car.imageUrl}" class="img-responsive"/>
        <img src="${imgUrl}/logo/${fn:toLowerCase(car.brand)}.png" class="img-responsive"/>
    </div>
    <div class="col-sm-5">
        <table class="table">
            <tr>
                <td>Fuel</td>
                <td>${car.fuelType}</td>
            </tr>
            <tr>
                <td>Delivery time (months)</td>
                <td>${car.deliveryTime}</td>
            </tr>
            <tr>
                <td>Fiscal HP</td>
                <td>${car.fiscalHp}</td>
            </tr>
            <tr>
                <td>CO2 emission</td>
                <td>${car.co2} g/km</td>
            </tr>
            <tr>
                <td>Category</td>
                <td>${car.category}</td>
            </tr>
        </table>
        <ul>
        <c:forEach var="option" items="${car.pack.options}">
            <li>${option.name}</li>
        </c:forEach>
        </ul>
    </div>

    <div class="col-sm-3 col-sm-offset-1">
        <spring:url value="/carorder/order" var="orderUrl"/>
        <spring:message code="actions.order" var="orderAction"/>
        <form:form action="${orderUrl}" method="POST">
            <input type="submit" value="Order now!" class="btn btn-primary"/>
        </form:form>
    </div>

</div>