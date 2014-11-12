package com.realdolmen.domain.option;

import com.realdolmen.domain.AbstractRepository;
import com.realdolmen.domain.Enums;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by TLAAU71 on 30/10/2014.
 */
@Stateless
public class OptionRepository extends AbstractRepository<Option> {


    public List<Option> FindByType(String type){
        return entityManager.createQuery("Select o from Option o where o.type = :tp",Option.class)
                .setParameter("tp",type)
                .getResultList();
    }

    public List<Option> FindByName(String name){
        return entityManager.createQuery("Select o from Option Where o.name like :name",Option.class)
                .setParameter("name","%"+name+"%")
                .getResultList();
    }

    public List<Option> FindByCarModel(Integer id){
        return  entityManager.createNamedQuery("Option.findOptionByCarModel",Option.class).setParameter("id",id).getResultList();
    }
}
