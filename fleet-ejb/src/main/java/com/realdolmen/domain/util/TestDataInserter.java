package com.realdolmen.domain.util;

import com.realdolmen.domain.Enums;
import com.realdolmen.domain.car.Car;
import com.realdolmen.domain.carmodel.CarModel;
import com.realdolmen.domain.carmodel.CarModelRepository;
import com.realdolmen.domain.custompack.CustomPack;
import com.realdolmen.domain.custompack.CustomPackRepository;
import com.realdolmen.domain.employee.Employee;
import com.realdolmen.domain.option.Option;
import com.realdolmen.domain.option.OptionRepository;
import com.realdolmen.domain.pack.Pack;
import com.realdolmen.domain.pack.PackRepository;
import com.sun.xml.internal.bind.v2.TODO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.math.BigDecimal;
import java.util.ArrayList;
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
    @Inject
    private CarModelRepository carModelRepository;
    @Inject
    private CustomPackRepository customPackRepository;
    @PersistenceContext(unitName = "production")
    private EntityManager entityManager;


    public void insertCarmodels() {
        insertAudiA3();
        insertAVWGolf();
        insertIbiziaSt();
        insertVWBeetle();
        insertVwTouran();
        insertAudiA4Berline();
        insertAudiQ3();
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

        for (int i = 1; i < 8; i++) {
            CarModel carModel = entityManager.find(CarModel.class,i);
            Option aBS = new Option(Enums.Technical.BRAKES.getLabel(), "ABS", description, randomGenerator(), carModel);
            Option eSP = new Option(Enums.Technical.SUPPORT_SYSTEMS.getLabel(), "ESP", description2, randomGenerator(),carModel);
            Option airbag = new Option(Enums.Interior.OTHER.getLabel(), "7 Airbag", description3, randomGenerator(), carModel);
            Option leather = new Option(Enums.Interior.STEERING_WHEEL.getLabel(), "Leather", description4, randomGenerator(), carModel);
            Option pressureMonitoring = new Option(Enums.Exterior.WHEELS.getLabel(), "Pressure monitoring", description5, randomGenerator(), carModel);
            persistForAudiA1(aBS, eSP, airbag, leather, pressureMonitoring);

        }
    }


    public void insertCustomPackOptions(){
        final String description6 = "Autonomous cruise control (also called adaptive or radar cruise control) is an optional cruise control system for road vehicles that automatically adjusts the vehicle speed to maintain a safe distance from vehicles ahead. It makes no use of satellite or roadside infrastructures nor of any cooperative support from other vehicles. Hence control is imposed based on sensor information from on-board sensors only. The extension to cooperative cruise control requires either fixed infrastructure as with satellites, roadside beacons or mobile infrastructures as reflectors or transmitters on the back of other vehicles ahead";
        Option customOptionForVWGolf = new Option(Enums.Technical.SUPPORT_SYSTEMS.getLabel(), "Adaptive cruise control", description6, randomGenerator(), carModelRepository.find(2));
        entityManager.persist(customOptionForVWGolf);

        Option customOptionForIbizaST = new Option(Enums.Interior.OTHER.getLabel(), "Desactiveerbare Passagiersairbag", "Allows you to disable the aibags", randomGenerator(),carModelRepository.find(3));
        entityManager.persist(customOptionForIbizaST);

        Option customOptionForVWBeetle = new Option(Enums.Technical.SUPPORT_SYSTEMS.getLabel(), "Hill Hold Control", "Automatically brakes when you're on a hill so you don't roll away", randomGenerator(),carModelRepository.find(4));
        entityManager.persist(customOptionForVWBeetle);

        Option customOptionForAudiA4 = new Option(Enums.Technical.CHASSIS.getLabel(), "SportChasis", "Lowered the chasis for better aerodynamica", randomGenerator(),carModelRepository.find(5));
        entityManager.persist(customOptionForAudiA4);

        Option customOptionForAudiQ3 = new Option(Enums.Exterior.WHEELS.getLabel(), "alu tims 10 spikes Design 17\"", "nice rims", randomGenerator(),carModelRepository.find(6));
        entityManager.persist(customOptionForAudiQ3);

    }

    public void persistForAudiA1(Option aBS, Option eSP, Option airbag, Option leather, Option pressureMonitoring) {
        entityManager.persist(aBS);
        entityManager.persist(eSP);
        entityManager.persist(airbag);
        entityManager.persist(leather);
        entityManager.persist(pressureMonitoring);
    }


    public void insertAPack() {
        CarModel carModel = entityManager.find(CarModel.class, 1);
        List<Option> optionsFromTheDB = optionRepository.FindByCarModel(carModel.getId());
        Pack packForAudi = new Pack(getPrice(optionsFromTheDB), randomGenerator(), randomGenerator(), randomGenerator(), optionsFromTheDB);
        entityManager.persist(packForAudi);
        logger("INSERTING A PACK FOR AUDI A3");

        CarModel carModelForVolkswagen = entityManager.find(CarModel.class, 2);
        List<Option> optionsFromDBForVW = optionRepository.FindByCarModel(carModelForVolkswagen.getId());
        Pack packForVW = new Pack(getPrice(optionsFromDBForVW), randomGenerator(), randomGenerator(), randomGenerator(), optionsFromDBForVW);
        entityManager.persist(packForVW);
        logger("INSERTING A PACK FOR VWGolf");


        CarModel carModelForSeat = entityManager.find(CarModel.class, 3);
        List<Option> optionsFromDBForSeat = optionRepository.FindByCarModel(carModelForSeat.getId());
        Pack packForSeat = new Pack(getPrice(optionsFromDBForSeat), randomGenerator(), randomGenerator(), randomGenerator(), optionsFromDBForSeat);
        entityManager.persist(packForSeat);
        logger("INSERTING A PACK FOR SEAT IBIZA");

        CarModel carModelVWBeetle = entityManager.find(CarModel.class, 4);
        List<Option> optionsFromDBForVWBeetle = optionRepository.FindByCarModel(carModelVWBeetle.getId());
        Pack packForVWBeetle = new Pack(getPrice(optionsFromDBForVWBeetle), randomGenerator(), randomGenerator(), randomGenerator(), optionsFromDBForVWBeetle);
        entityManager.persist(packForVWBeetle);
        logger("INSERTING A PACK FOR VW BEETLE");

        CarModel carModelForVWTouran = entityManager.find(CarModel.class, 5);
        List<Option> optionsFromDBForVWTouran = optionRepository.FindByCarModel(carModelForVWTouran.getId());
        Pack packForVWTouran = new Pack(getPrice(optionsFromDBForVWTouran), randomGenerator(), randomGenerator(), randomGenerator(), optionsFromDBForVWTouran);
        entityManager.persist(packForVWTouran);
        logger("INSERTING A PACK FOR VW TOURAN");

        CarModel carModelForAudiA4Berline = entityManager.find(CarModel.class, 6);
        List<Option> optionsFromDBForAudiA4Berline = optionRepository.FindByCarModel(carModelForAudiA4Berline.getId());
        Pack packForAudiA4Berline = new Pack(getPrice(optionsFromDBForAudiA4Berline), randomGenerator(), randomGenerator(), randomGenerator(), optionsFromDBForAudiA4Berline);
        entityManager.persist(packForAudiA4Berline);
        logger("INSERTING A PACK FOR AUDI A4 BERLINE");

        CarModel carModelForAudiQ3 = entityManager.find(CarModel.class, 7);
        List<Option> optionsFromDBForAudiQ3 = optionRepository.FindByCarModel(carModelForAudiQ3.getId());
        Pack packForAudiAudiQ3 = new Pack(getPrice(optionsFromDBForAudiQ3), randomGenerator(), randomGenerator(), randomGenerator(), optionsFromDBForAudiQ3);
        entityManager.persist(packForAudiAudiQ3);
        logger("INSERTING A PACK FOR AUDI Q3");

    }


    private void insertAudiA3() {
        //AUDI
        CarModel carModel = new CarModel("Audi", "A3", Enums.CarType.HATCHBACK, Enums.Fuel.DIESEL, new Date(), 2, 140000, 180000, 20, 9, 88, 2, "");
        entityManager.persist(carModel);
        logger("INSERTING CARMODEL AUDI A3");

    }

    private void insertAVWGolf() {
        CarModel carModel2 = new CarModel("Volkswagen", "Golf 7 1,6 TDI 105pk/CV Highline", Enums.CarType.HATCHBACK, Enums.Fuel.DIESEL, new Date(), 2, 140000, 180000, 16, 9, 99, 2, "");
        entityManager.persist(carModel2);
        logger("INSERTING A SECOND CAR WITH AN UPDATED PACK");

    }

    private void insertIbiziaSt() {
        CarModel carModel = new CarModel("Seat", "Ibiza St 1,6TDi 105pk/CV Style", Enums.CarType.BREAK, Enums.Fuel.BENZINE, new Date(), 2, 140000, 180000, 14, 7, 92, 2, "");
        entityManager.persist(carModel);
        logger("INSERTING A Ibiza St CarModel");
    }

    private void insertVWBeetle() {
        CarModel carModel = new CarModel("Volkswagen", "BEETLE 1,6 CRTDI 105 pk 5 v Design", Enums.CarType.COUPE, Enums.Fuel.DIESEL, new Date(), 3, 140000, 180000, 20, 9, 113, 3, "");
        entityManager.persist(carModel);
        logger("INSERTING A VW Beetle CarModel");
    }

    private void insertVwTouran() {
        CarModel carModel = new CarModel("Volkswagen", "Touran 1,6TDi 105pk/CV Trendline Bluemotion", Enums.CarType.MONOVOLUME, Enums.Fuel.DIESEL, new Date(), 1, 140000, 180000, 20, 9, 121, 4, "");
        entityManager.persist(carModel);
        logger("INSERTING A VW Touran CarModel");

    }

    private void insertAudiA4Berline() {
        CarModel carModel = new CarModel("Audi", "A4 Berline 2,0 TDIe ultra 136 pk/cv", Enums.CarType.BERLINE, Enums.Fuel.DIESEL, new Date(), 4, 180000, 200000, 16, 9, 104, 5, "");
        entityManager.persist(carModel);
        logger("INSERTING A Audi A4 Berline CarModel");
    }

    private void insertAudiQ3() {
        CarModel carModel = new CarModel("Audi", "Q3 2,0 TDI 136 pk/cv", Enums.CarType.JEEP, Enums.Fuel.DIESEL, new Date(), 4, 180000, 200000, 20, 11, 137, 6, "");
        entityManager.persist(carModel);
        logger("INSERTING A Audi Q3 CarModel");
    }

    public void insertCustomPack() {
        List<Option> optionListForCustomPack = new ArrayList<>();
        optionListForCustomPack.add(optionRepository.find(37));
        CustomPack customPack = new CustomPack(optionListForCustomPack);
        entityManager.persist(customPack);
    }


    public void updateCarModelsWithADefaultPack() {

        for (int i = 1; i < 8; i++) {
            CarModel audiA1 = entityManager.find(CarModel.class,i);
                Pack packForAudiA1 = entityManager.find(Pack.class,i);
                audiA1.setPack(packForAudiA1);
                entityManager.merge(audiA1);
        }
        logger("UPDATED CARMODELS WITH A DEFAULTPACK");
    }

    public void insertCar() {
        Car car = new Car(carModelRepository.find(3), randomGenerator().intValue(), new Date(),entityManager.find(CustomPack.class,1));
        entityManager.persist(car);
    }

    public void insertEmployees() {
        List<Enums.Roles> rolesList = new ArrayList<>();
        rolesList.add(Enums.Roles.EMPLOYEE);
        Employee employeeApproved = new Employee("Benjamine", "Pieteraerents", "employeeApproved@hotmail.com", "employeeApproved", "AT47", 2, rolesList, Enums.Status.APPROVED);
        entityManager.persist(employeeApproved);
        Employee employeeDisapproved = new Employee("Aveline", "Estie", "employeeDisapproved@hotmail.com", "employeeDisapproved", "AT46", 2, rolesList, Enums.Status.DISAPPROVED);
        entityManager.persist(employeeDisapproved);
        List<Enums.Roles> rolesArrayList = new ArrayList<>();
        rolesArrayList.add(Enums.Roles.EMPLOYEE);
        rolesArrayList.add(Enums.Roles.FLEET_MANAGER);
        Employee leasingManager = new Employee("Tim", "Lemahieu", "leasingManager@hotmail.com", "leasingManager", "AU71", 2, rolesArrayList, Enums.Status.APPROVED);
        entityManager.persist(leasingManager);
        logger("INSERTING EMPLOYEES");
    }


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

    public void logger(String info) {
        logger.info("/////************************************" + info + "*************************************/////\"); ");

    }
}
