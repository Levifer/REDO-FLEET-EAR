<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--String brand, String name, Enums.CarType type, Enums.Fuel fuelType,
 Date year, int quarter, int minKm, int maxKm, int deliveryTime, int fiscalHp,
  int co2, int category, String imageUrl, Pack pack--%>
<spring:url value="/admin/car" var="url" />
<form:form commandName="carModel" action="${url}">

    <label><spring:message code="car.brand"/></label>
    <form:input path="brand" />
    <label><spring:message code="car.name"/></label>
    <form:input path="name" />
    <label><spring:message code="car.type"/></label>
    <form:select path="type">
        <c:forEach var="type" items="${typeList}">
            <form:option value="${type}"><c:out value="${type}"/></form:option>
        </c:forEach>
    </form:select>
    <label><spring:message code="car.fuel"/></label>
    <form:select path="fuelType">
        <c:forEach var="fuel" items="${fuelList}">
            <form:option value="${fuel}"><c:out value="${fuel}"/></form:option>
        </c:forEach>
    </form:select>
    <label><spring:message code="car.year"/></label>
    <form:input path="year" />
    <label><spring:message code="car.quarter"/></label>
    <form:input path="quarter" />
    <label><spring:message code="car.minKm"/></label>
    <form:input path="minKm" />
    <label><spring:message code="car.maxKm"/></label>
    <form:input path="maxKm" />
    <label><spring:message code="car.deliveryTime"/></label>
    <form:input path="deliveryTime" />
    <label><spring:message code="car.fiscalHp"/></label>
    <form:input path="fiscalHp"/>
    <label><spring:message code="car.co2"/></label>
    <form:input path="co2" />
    <label><spring:message code="car.category"/></label>
    <form:input path="category" />
    <label><spring:message code="car.pack"/></label>
    <form:select path="pack">
        <form:option value="${pack}"/>
    </form:select>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <input type="submit" value="<spring:message code="carmodel.add"/>" />
</form:form>
