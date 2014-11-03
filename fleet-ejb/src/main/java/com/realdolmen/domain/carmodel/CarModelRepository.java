package com.realdolmen.domain.carmodel;

import com.realdolmen.domain.AbstractRepository;
import org.springframework.stereotype.Repository;

import javax.ejb.Stateless;
import java.util.List;

/**
 * Created by TLAAU71 on 30/10/2014.
 */
@Stateless
public class CarModelRepository extends AbstractRepository<CarModel>{

   public CarModel findAllByType(){
      return new CarModel();
   }

    public List<CarModel> findAllByBrand(String brand){
     return   entityManager.createNamedQuery("CarModel.findAllByBrand",CarModel.class)
             .setParameter("brand",brand)
             .getResultList();
    }
}
