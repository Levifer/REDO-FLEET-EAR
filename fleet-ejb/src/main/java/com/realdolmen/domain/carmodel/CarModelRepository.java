package com.realdolmen.domain.carmodel;

import com.realdolmen.domain.AbstractRepository;

import javax.ejb.Stateless;
import java.util.List;

/**
 * Created by TLAAU71 on 30/10/2014.
 */
@Stateless
public class CarModelRepository extends AbstractRepository<CarModel>{

    public List<CarModel> findAllByType(String type){
        return entityManager.createNamedQuery("CarModel.findAllByType",CarModel.class)
                .setParameter("type",type)
                .getResultList();
    }

    public List<CarModel> findAllByBrand(String brand){
     return entityManager.createNamedQuery("CarModel.findAllByBrand",CarModel.class)
             .setParameter("brand",brand)
             .getResultList();
    }
}
