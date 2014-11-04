<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<div class="row">
    <div class="col-md-12"><h2><spring:message code="car.flowTitle.start"/></h2></div>
</div>
<div class="row">
    <div class="col-sm-6">
        <h3><spring:message code="car.brand"/></h3>

        <div class="row">
            <div class="col-sm-6 col-xs-6">
                <a href="car?brand=audi">
                    <img src="<%=request.getContextPath() %>/resources/img/logo/audi.png"
                         class="img-responsive" alt="audi"/>
                </a>
            </div>
            <div class="col-sm-6 col-xs-6">
                <a href="car?brand=seat">
                    <img src="<%=request.getContextPath() %>/resources/img/logo/seat.png"
                         class="img-responsive" alt="seat"/>
                </a>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-6 col-xs-6">
                <a href="car?brand=skoda">
                    <img src="<%=request.getContextPath() %>/resources/img/logo/skoda.png"
                         class="img-responsive" alt="skoda"/>
                </a>
            </div>
            <div class="col-sm-6 col-xs-6">
                <a href="car?brand=volkswagen">
                    <img src="<%=request.getContextPath() %>/resources/img/logo/volkswagen.png"
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
                    <img src="<%=request.getContextPath() %>/resources/img/type/berline.png"
                         class="img-responsive" alt="berline"/>
                </a>
            </div>
            <div class="col-xs-6">
                <h4>Break</h4>
                <a href="car?type=break">
                    <img src="<%=request.getContextPath() %>/resources/img/type/break.png"
                         class="img-responsive" alt="break"/>
                </a>
            </div>
        </div>
        <div class="row">
            <div class="col-xs-6">
                <h4>Coup&eacute;</h4>
                <a href="car?type=coupe">
                    <img src="<%=request.getContextPath() %>/resources/img/type/coupe.png"
                         class="img-responsive" alt="coupe"/>
                </a>
            </div>
            <div class="col-xs-6">
                <h4>Hatchback</h4>
                <a href="car?type=hatchback">
                    <img src="<%=request.getContextPath() %>/resources/img/type/hatchback.png"
                         class="img-responsive" alt="hatchback"/>
                </a>
            </div>
        </div>
        <div class="row">
            <div class="col-xs-6">
                <h4>Jeep</h4>
                <a href="car?type=jeep">
                    <img src="<%=request.getContextPath() %>/resources/img/type/jeep.png"
                         class="img-responsive" alt="jeep"/>
                </a>
            </div>
            <div class="col-xs-6">
                <h4>Monovolume</h4>
                <a href="car?type=monovolume">
                    <img src="<%=request.getContextPath() %>/resources/img/type/monovolume.png"
                         class="img-responsive" alt="monovolume"/>
                </a>
            </div>
        </div>
    </div>
</div>