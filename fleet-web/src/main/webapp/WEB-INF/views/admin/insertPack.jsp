<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--String brand, String name, Enums.CarType type, Enums.Fuel fuelType,
 Date year, int quarter, int minKm, int maxKm, int deliveryTime, int fiscalHp,
  int co2, int category, String imageUrl, Pack pack--%>
<spring:url value="/admin/pack" var="url"/>
<div class="row">
    <div class="col-sm-12">
        <h2>New pack</h2>
    </div>
    <div class="col-sm-3 col-sm-offset-9">
        <a href="${url}" class="btn btn-danger pull-right">Back to overview</a>
    </div>
    <div class="col-sm-12">
        <form:form commandName="pack" action="${url}/add">
            <div class="form-group">
                <label>Price</label>
                <form:input path="price" class="form-control"/>
            </div>
            <div class="form-group">
                <label>Benefit price</label>
                <form:input path="benefitPrice" class="form-control"/>
            </div>
            <div class="form-group">
                <label>Options</label>
                <form:select path="options.option" class="form-control" multiple="multiple" name="options">
                    <c:forEach var="option" items="${optionsList}">
                        <form:option value="${option.OPTIONID}"><c:out value="${option.name} (${option.type})"/></form:option>
                    </c:forEach>
                </form:select>
            </div>
            <div class="form-group">
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                <input type="submit" value="<spring:message code="carmodel.add"/>" class="btn btn-primary"/>
            </div>
        </form:form>
    </div>
</div>