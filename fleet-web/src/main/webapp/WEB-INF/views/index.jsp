<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%-- Variables --%>
<spring:url value="/resources/img" var="imgUrl"/>

<c:if test="${carOrder.equals('yes')}">
    <div class="row">
        <br/>
        <div class="alert alert-success alert-dismissible" role="alert">
            <button type="button" class="close" data-dismiss="alert"><span aria-hidden="true">&times;</span><span
                    class="sr-only">Close</span></button>
            <spring:message code="message.order"/>
        </div>
    </div>
</c:if>
<%-- Page --%>
<div class="row">
    <div class="col-md-12"><h2><spring:message code="car.details.title"/></h2></div>
</div>
<div class="row">
    <div class="col-sm-6">
        <h3><spring:message code="car.brand"/></h3>

        <div class="row">
            <div class="col-sm-6 col-xs-6">
                <a href="car?brand=audi">
                    <img src="${imgUrl}/logo/audi.png"
                         class="img-responsive" alt="audi"/>
                </a>
            </div>
            <div class="col-sm-6 col-xs-6">
                <a href="car?brand=seat">
                    <img src="${imgUrl}/logo/seat.png"
                         class="img-responsive" alt="seat"/>
                </a>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-6 col-xs-6">
                <a href="car?brand=skoda">
                    <img src="${imgUrl}/logo/skoda.png"
                         class="img-responsive" alt="skoda"/>
                </a>
            </div>
            <div class="col-sm-6 col-xs-6">
                <a href="car?brand=volkswagen">
                    <img src="${imgUrl}/logo/volkswagen.png"
                         class="img-responsive" alt="volkswagen"/>
                </a>
            </div>
        </div>
    </div>
    <div class="col-sm-6">
        <h3><spring:message code="car.type"/></h3>

        <div class="row">
            <div class="col-xs-6">
                <h4>Berline</h4>
                <a href="car?type=berline">
                    <img src="${imgUrl}/type/berline.png"
                         class="img-responsive" alt="berline"/>
                </a>
            </div>
            <div class="col-xs-6">
                <h4>Break</h4>
                <a href="car?type=break">
                    <img src="${imgUrl}/type/break.png"
                         class="img-responsive" alt="break"/>
                </a>
            </div>
        </div>
        <div class="row">
            <div class="col-xs-6">
                <h4>Coup&eacute;</h4>
                <a href="car?type=coupe">
                    <img src="${imgUrl}/type/coupe.png"
                         class="img-responsive" alt="coupe"/>
                </a>
            </div>
            <div class="col-xs-6">
                <h4>Hatchback</h4>
                <a href="car?type=hatchback">
                    <img src="${imgUrl}/type/hatchback.png"
                         class="img-responsive" alt="hatchback"/>
                </a>
            </div>
        </div>
        <div class="row">
            <div class="col-xs-6">
                <h4>Jeep</h4>
                <a href="car?type=jeep">
                    <img src="${imgUrl}/type/jeep.png"
                         class="img-responsive" alt="jeep"/>
                </a>
            </div>
            <div class="col-xs-6">
                <h4>Monovolume</h4>
                <a href="car?type=monovolume">
                    <img src="${imgUrl}/type/monovolume.png"
                         class="img-responsive" alt="monovolume"/>
                </a>
            </div>
        </div>
    </div>
</div>