<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--String brand, String name, Enums.CarType type, Enums.Fuel fuelType,
 Date year, int quarter, int minKm, int maxKm, int deliveryTime, int fiscalHp,
  int co2, int category, String imageUrl, Pack pack--%>
<spring:url value="/admin/carmodel" var="url"/>
<div class="row">
    <h2><spring:message code="admin.carmodel.update"/></h2>
    <a href="${url}">Back to overview</a>
    <form:form commandName="carModel" action="${url}/update">
        <form:input path="id" class="hidden"/>
        <div class="form-group">
            <label><spring:message code="car.brand"/></label>
            <form:input path="brand" class="form-control"/>
        </div>
        <div class="form-group">
            <label><spring:message code="car.name"/></label>
            <form:input path="name" class="form-control"/>
        </div>
        <div class="form-group">
            <label><spring:message code="car.type"/></label>
            <form:select path="type" class="form-control">
                <c:forEach var="type" items="${typeList}">
                    <form:option value="${type}"><c:out value="${type}"/></form:option>
                </c:forEach>
            </form:select>
        </div>
        <div class="form-group">
            <label><spring:message code="car.fuel"/></label>
            <form:select path="fuelType" class="form-control">
                <c:forEach var="fuel" items="${fuelList}">
                    <form:option value="${fuel}"><c:out value="${fuel}"/></form:option>
                </c:forEach>
            </form:select>
        </div>
        <div class="form-group">
            <label><spring:message code="car.year"/></label>
            <form:input path="year" class="form-control"/>
        </div>
        <div class="form-group">
            <label><spring:message code="car.quarter"/></label>
            <form:input path="quarter" class="form-control"/>
        </div>
        <div class="form-group">
            <label><spring:message code="car.minKm"/></label>
            <form:input path="minKm" class="form-control"/>
        </div>
        <div class="form-group">
            <label><spring:message code="car.maxKm"/></label>
            <form:input path="maxKm" class="form-control"/>
        </div>
        <div class="form-group">
            <label><spring:message code="car.deliveryTime"/></label>
            <form:input path="deliveryTime" class="form-control"/>
        </div>
        <div class="form-group">
            <label><spring:message code="car.fiscalHp"/></label>
            <form:input path="fiscalHp" class="form-control"/>
        </div>
        <div class="form-group">
            <label><spring:message code="car.co2"/></label>
            <form:input path="co2" class="form-control"/>
        </div>
        <div class="form-group">
            <label><spring:message code="car.category"/></label>
            <form:input path="category" class="form-control"/>
        </div>
        <%--<div class="form-group">--%>
            <%--<label><spring:message code="car.pack"/></label>--%>
            <%--<form:select path="pack" class="form-control">--%>
                <%--<form:option value="${pack}"/>--%>
            <%--</form:select>--%>
        <%--</div>--%>
        <div class="form-group">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            <input type="submit" value="<spring:message code="carmodel.update"/>" class="btn btn-primary"/>
        </div>
    </form:form>
</div>