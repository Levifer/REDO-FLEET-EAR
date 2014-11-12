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
        <br/>
        <div class="alert alert-warning">
            <spring:message code="message.required"/>
        </div>
        <c:if test="${optionsSelected.equals('no')}">
            <div class="alert alert-error alert-dismissible" role="alert">
                <button type="button" class="close" data-dismiss="alert"><span aria-hidden="true">&times;</span><span
                        class="sr-only">Close</span></button>
                <spring:message code="message.selectOptions"/>
            </div>
        </c:if>
        <spring:url value="/admin/carmodel" var="url"/>
        <form:form commandName="carModel" action="${url}/add">
            <div class="form-group">
                <label><spring:message code="car.brand"/> <span class="text-danger">*</span></label>
                <form:input path="brand" class="form-control" required="required"/>
            </div>
            <div class="form-group">
                <label><spring:message code="car.name"/> <span class="text-danger">*</span></label>
                <form:input path="name" class="form-control" required="required"/>
            </div>
            <div class="form-group">
                <label><spring:message code="car.type"/> <span class="text-danger">*</span></label>
                <form:select path="type" class="form-control" required="required">
                    <c:forEach var="type" items="${typeList}">
                        <form:option value="${type}"><c:out value="${type}"/></form:option>
                    </c:forEach>
                </form:select>
            </div>
            <div class="form-group">
                <label><spring:message code="car.fuel"/> <span class="text-danger">*</span></label>
                <form:select path="fuelType" class="form-control" required="required">
                    <c:forEach var="fuel" items="${fuelList}">
                        <form:option value="${fuel}"><c:out value="${fuel}"/></form:option>
                    </c:forEach>
                </form:select>
            </div>
            <div class="form-group">
                <label><spring:message code="car.year"/> <span class="text-danger">*</span></label>
                <form:input path="year" class="form-control" required="required"/>
            </div>
            <div class="form-group">
                <label><spring:message code="car.quarter"/> <span class="text-danger">*</span></label>
                <form:input path="quarter" class="form-control" required="required"/>
            </div>
            <div class="form-group">
                <label><spring:message code="car.minKm"/> <span class="text-danger">*</span></label>
                <form:input path="minKm" class="form-control" required="required"/>
            </div>
            <div class="form-group">
                <label><spring:message code="car.maxKm"/> <span class="text-danger">*</span></label>
                <form:input path="maxKm" class="form-control" required="required"/>
            </div>
            <div class="form-group">
                <label><spring:message code="car.deliveryTime"/> <span class="text-danger">*</span></label>
                <form:input path="deliveryTime" class="form-control" required="required"/>
            </div>
            <div class="form-group">
                <label><spring:message code="car.fiscalHp"/> <span class="text-danger">*</span></label>
                <form:input path="fiscalHp" class="form-control" required="required"/>
            </div>
            <div class="form-group">
                <label><spring:message code="car.co2"/> <span class="text-danger">*</span></label>
                <form:input path="co2" class="form-control" required="required"/>
            </div>
            <div class="form-group">
                <label><spring:message code="car.category"/> <span class="text-danger">*</span></label>
                <form:input path="category" class="form-control" required="required"/>
            </div>
            <h3>Pack</h3>

            <div class="form-group">
                <label><spring:message code="car.pack.price"/> <span class="text-danger">*</span></label>

                <div class="input-group">
                    <span class="input-group-addon">€</span>
                    <form:input path="pack.price" class="form-control" required="required"/>
                </div>
            </div>
            <div class="form-group">
                <label><spring:message code="car.pack.benefitPrice"/> <span class="text-danger">*</span></label>

                <div class="input-group">
                    <span class="input-group-addon">€</span>
                    <form:input path="pack.benefitPrice" class="form-control" required="required"/>
                </div>
            </div>
            <div class="form-group">
                <label><spring:message code="car.pack.upgrade"/> <span class="text-danger">*</span></label>

                <div class="input-group">
                    <span class="input-group-addon">€</span>
                    <form:input path="pack.upgrade" class="form-control" required="required"/>
                </div>
            </div>
            <div class="form-group">
                <label><spring:message code="car.pack.downgrade"/> <span class="text-danger">*</span></label>

                <div class="input-group">
                    <span class="input-group-addon">€</span>
                    <form:input path="pack.downgrade" class="form-control" required="required"/>
                </div>
            </div>
            <div class="form-group">
                <h3><spring:message code="car.pack.options"/> <span class="text-danger">*</span></h3>

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