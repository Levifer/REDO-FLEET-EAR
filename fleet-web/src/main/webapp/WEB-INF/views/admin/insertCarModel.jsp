<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--String brand, String name, Enums.CarType type, Enums.Fuel fuelType,
 Date year, int quarter, int minKm, int maxKm, int deliveryTime, int fiscalHp,
  int co2, int category, String imageUrl, Pack pack--%>
<spring:url value="/admin/carmodel" var="url"/>
<div class="row">
    <div class="col-sm-12">
        <h2><spring:message code="admin.carmodel.new"/></h2>
    </div>
    <div class="col-sm-3 col-sm-offset-9">
        <a href="${url}" class="btn btn-danger pull-right">Back to overview</a>
    </div>
    <div class="col-sm-12">
        <spring:url value="/admin/carmodel" var="url"/>
        <form:form commandName="carModel" action="${url}/add">
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
            <h3>Pack</h3>
            <div class="form-group">
                <label>Price</label>

                <div class="input-group">
                    <span class="input-group-addon">€</span>
                    <form:input path="pack.price" class="form-control"/>
                </div>
            </div>
            <div class="form-group">
                <label>Benefit price</label>

                <div class="input-group">
                    <span class="input-group-addon">€</span>
                    <form:input path="pack.benefitPrice" class="form-control"/>
                </div>
            </div>
            <div class="form-group">
                <label>Upgrade</label>

                <div class="input-group">
                    <span class="input-group-addon">€</span>
                    <form:input path="pack.upgrade" class="form-control"/>
                </div>
            </div>
            <div class="form-group">
                <label>Downgrade</label>

                <div class="input-group">
                    <span class="input-group-addon">€</span>
                    <form:input path="pack.downgrade" class="form-control"/>
                </div>
            </div>
            <div class="form-group">
                <h3>Options</h3>

                <div class="options">
                    <c:forEach var="option" items="${optionsList}">
                        <form:checkbox path="pack.options.option" value="${option.OPTIONID}"
                                       label=" ${option.name} (€${option.price})" cssStyle="font-weight: normal;"/><br/>
                    </c:forEach>
                </div>
            </div>

            <div class="form-group">
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                <input type="submit" value="<spring:message code="carmodel.add"/>" class="btn btn-primary"/>
            </div>
        </form:form>
    </div>
</div>