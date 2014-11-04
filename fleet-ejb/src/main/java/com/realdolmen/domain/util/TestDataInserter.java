package com.realdolmen.domain.util;

import com.realdolmen.domain.Enums;
import com.realdolmen.domain.carmodel.CarModel;
import com.realdolmen.domain.employee.Employee;
import com.realdolmen.domain.option.Option;
import com.realdolmen.domain.option.OptionRepository;
import com.realdolmen.domain.pack.Pack;
import com.realdolmen.domain.pack.PackRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Created by BPTAT47 on 31/10/2014.
 */
@Stateless
public class TestDataInserter {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Inject
    private OptionRepository optionRepository;
    @Inject
    private PackRepository packRepository;
    @PersistenceContext(unitName = "production")
    private EntityManager entityManager;

    public BigDecimal randomGenerator() {
        return new BigDecimal(new Random().nextInt(500));
    }

    public BigDecimal getPrice(List<Option> options) {
        BigDecimal totalPrice = new BigDecimal(0);
        for (Option option : options) {
            totalPrice = totalPrice.add(option.getPrice());
        }
        return totalPrice.multiply(new BigDecimal(0.9));
    }

    public void insertOptions() {
        final String description =
                "Anti-lock braking system (ABS) is an automobile safety system that allows the wheels on a motor vehicle to maintain tractive contact with the road surface according to driver inputs while braking, " +
                        "preventing the wheels from locking up (ceasing rotation) and avoiding uncontrolled skidding. " +
                        "It is an automated system that uses the principles of threshold braking and cadence braking which were practiced by skillful drivers with previous generation braking systems. " +
                        "It does this at a much faster rate and with better control than a driver could manage.";

        final String description2 = "Electronic stability control (ESC), also referred to as electronic stability program (ESP) or dynamic stability control (DSC), is a computerized technology [1][2] that improves a vehicle's stability by detecting and reducing loss of traction (skidding)." +
                " When ESC detects loss of steering control";
        final String description3 = "An airbag is a vehicle safety device. It is an occupant restraint system consisting of a flexible fabric envelope or cushion designed to inflate rapidly during an automobile collision. " +
                "Its purpose is to cushion occupants during a crash and provide protection to their bodies when they strike interior objects such as the steering wheel or a window. " +
                "Modern vehicles may contain multiple airbag modules in various side and frontal locations of the passenger seating positions, and sensors may deploy one or more airbags in an impact zone at variable rates based on the type, angle and severity of impact; the airbag is designed to only inflate in moderate to severe frontal crashes." +
                " Airbags are normally designed with the intention of supplementing the protection of an occupant who is correctly restrained with a seatbelt. Most designs are inflated through pyrotechnic means and can only be operated once. Newer side-impact airbag modules consist of compressed air cylinders that are triggered in the event of a side impact vehicle impact.";
        final String description4 = "A steering wheel (also called a driving wheel or a hand wheel) is a type of steering control in vehicles and vessels (ships and boats).\n" +
                "Steering wheels are used in most modern land vehicles, including all mass-production automobiles, as well as busses, light and heavy trucks, and tractors. The steering wheel is the part of the steering system that is manipulated by the driver; the rest of the steering system responds to such driver inputs. This can be through direct mechanical contact as in recirculating ball or rack and pinion steering gears, without or with the assistance of hydraulic power steering, HPS, or as in some modern production cars with the assistance of computer controlled motors, known as Electric Power Steering.";
        final String description5 = "A tire pressure monitoring system (TPMS) is an electronic system designed to monitor the air pressure inside the pneumatic tires on various types of vehicles. TPMS report real-time tire-pressure information to the driver of the vehicle, either via a gauge, a pictogram display, or a simple low-pressure warning light. TPMS can be divided into two different types — direct (dTPMS) and indirect (iTPMS). TPMS are provided both at an OEM (factory) level as well as an aftermarket solution. ";
        Option option = new Option(Enums.Technical.BRAKES.getLabel(), "ABS", description, randomGenerator());
        Option option2 = new Option(Enums.Technical.SUPPORT_SYSTEMS.getLabel(), "ESP", description2, randomGenerator());
        Option option3 = new Option(Enums.Interior.OTHER.getLabel(), "7 Airbag", description3, randomGenerator());
        Option option4 = new Option(Enums.Interior.STEERING_WHEEL.getLabel(), "Leather", description4, randomGenerator());
        Option option5 = new Option(Enums.Exterior.WHEELS.getLabel(), "Pressure monitoring", description5, randomGenerator());
        entityManager.persist(option);
        entityManager.persist(option2);
        entityManager.persist(option3);
        entityManager.persist(option4);
        entityManager.persist(option5);
        logger.info("/////************************************INSERTING OPTIONS*************************************/////\"); ");
    }

    public void insertAPack() {
        List<Option> optionsFromTheDB = optionRepository.findAll();
        Pack pack = new Pack(getPrice(optionsFromTheDB), randomGenerator(), randomGenerator(), randomGenerator(), optionsFromTheDB);
        entityManager.persist(pack);
        Pack pack2 = new Pack(getPrice(optionsFromTheDB), randomGenerator(), randomGenerator(), randomGenerator(), optionsFromTheDB);
        entityManager.persist(pack2);
        logger.info("/////************************************INSERTING A PACK*************************************/////\"); ");

    }

    public void insertACarModel() {
        CarModel carModel = new CarModel("Audi", "A3 sportback 1,6 tdi 105 pk ultra attraction", Enums.Fuel.DIESEL, new Date(), 2, 140000, 180000, 20, 9, 88, 2, "", packRepository.findAll().get(0));
        entityManager.persist(carModel);
        logger.info("/////************************************INSERTING A CARMODEL*************************************/////\"); ");

    }

    public void insertASecondCarModelWithAnUpdatedPack() {
        final String description6 = "Autonomous cruise control (also called adaptive or radar cruise control) is an optional cruise control system for road vehicles that automatically adjusts the vehicle speed to maintain a safe distance from vehicles ahead. It makes no use of satellite or roadside infrastructures nor of any cooperative support from other vehicles. Hence control is imposed based on sensor information from on-board sensors only. The extension to cooperative cruise control requires either fixed infrastructure as with satellites, roadside beacons or mobile infrastructures as reflectors or transmitters on the back of other vehicles ahead";
        Option option6 = new Option(Enums.Technical.SUPPORT_SYSTEMS.getLabel(), "Adaptive cruise control", description6, randomGenerator());
        entityManager.persist(option6);
        Pack packRetrievedFromDB = packRepository.findAll().get(1);
        packRetrievedFromDB.getOptions().add(optionRepository.findAll().get(5));
        packRepository.update(packRetrievedFromDB);
        CarModel carModel2 = new CarModel("Volkswagen", "Golf 7 1,6 TDI 105pk/CV Highline", Enums.Fuel.DIESEL, new Date(), 2, 140000, 180000, 16, 9, 99, 2, "", packRepository.findAll().get(0));
        entityManager.persist(carModel2);
        logger.info("/////************************************INSERTING A SECOND CAR WITH AN UPDATED PACK*************************************/////\"); ");

    }

    public void insertEmployees() {
        Employee employeeApproved = new Employee("Benjamine", "Pieteraerents", "employeeApproved@hotmail.com", "employeeApproved", "AT47", 2, Enums.Roles.EMPLOYEE, Enums.Status.APPROVED);
        entityManager.persist(employeeApproved);
        Employee employeeDisapproved = new Employee("Aveline", "Estie", "employeeDisapproved@hotmail.com", "employeeDisapproved", "AT46", 2, Enums.Roles.EMPLOYEE, Enums.Status.DISAPPROVED);
        entityManager.persist(employeeDisapproved);
        Employee leasingManager = new Employee("Tim", "Lemahieu", "leasingManager@hotmail.com", "leasingManager", "AU71", 2, Enums.Roles.FLEET_MANAGER, Enums.Status.APPROVED);
        entityManager.persist(leasingManager);
        logger.info("/////************************************INSERTING EMPLOYEES*************************************/////\"); ");

    }
}
