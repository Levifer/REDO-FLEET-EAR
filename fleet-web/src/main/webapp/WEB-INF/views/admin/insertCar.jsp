<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--String brand, String name, Enums.CarType type, Enums.Fuel fuelType,
 Date year, int quarter, int minKm, int maxKm, int deliveryTime, int fiscalHp,
  int co2, int category, String imageUrl, Pack pack--%>

<form:form>

    <label><spring:message code="car.brand"/></label>
    <form:input path="brand" />
    <label><spring:message code="car.name"/></label>
    <form:input path="name" />
    <label><spring:message code="car.type"/></label>
    <form:input path="type" />
    <label><spring:message code="car.fuel"/></label>
    <form:input path="fuel" />
    <label><spring:message code="car.year"/></label>
    <form:input path="year" />
    <label><spring:message code="car.quarter"/></label>
    <form:input path="quarter" />
    <label><spring:message code="car.minKm"/></label>
    <form:input path="minKm" />
    <label><spring:message code="car.maxKm"/></label>
    <form:input path="maxKm" />
    <label><spring:message code="car.minKm"/></label>
    <form:input path="minKm" />
</form:form>
