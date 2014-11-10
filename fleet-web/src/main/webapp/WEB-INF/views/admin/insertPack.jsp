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

                <div class="input-group">
                    <span class="input-group-addon">€</span>
                    <form:input path="price" class="form-control"/>
                </div>
            </div>
            <div class="form-group">
                <label>Benefit price</label>

                <div class="input-group">
                    <span class="input-group-addon">€</span>
                    <form:input path="benefitPrice" class="form-control"/>
                </div>
            </div>
            <div class="form-group">
                <label>Upgrade</label>

                <div class="input-group">
                    <span class="input-group-addon">€</span>
                    <form:input path="upgrade" class="form-control"/>
                </div>
            </div>
            <div class="form-group">
                <label>Downgrade</label>

                <div class="input-group">
                    <span class="input-group-addon">€</span>
                    <form:input path="downgrade" class="form-control"/>
                </div>
            </div>
            <div class="form-group">
                <h3>Options</h3>

                <div class="options">
                    <c:forEach var="option" items="${optionsList}">
                        <form:checkbox path="options.option" value="${option.OPTIONID}"
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