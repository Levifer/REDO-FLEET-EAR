package com.realdolmen.domain.carmodel;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;
import javax.transaction.Transactional;

/**
 * Created by BPTAT47 on 3/11/2014.
 */
@WebService
@Transactional
public class CarModelWebService {

    @Inject
    private CarModelRepository carModelRepository;


}
