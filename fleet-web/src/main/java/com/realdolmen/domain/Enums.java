package com.realdolmen.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BPTAT47 on 29/10/2014.
 */
public class Enums {


    public interface TypeInterface{

        String getType();
    }

    public enum Roles {
        EMPLOYEE("employee.name"),
        FLEET_MANAGER("manager.name");

        private final String label;

        Roles(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }

    public enum Status {
        APPROVED("employee.Approved"),
        DISAPPROVED("employee.Disapproved");

        private final String label;

        Status(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }


    public enum CarType{
        BERLINE("CarType.Berline"),
        BREAK("CarType.Break"),
        COUPE("CarType.Coupe"),
        HATCHBACK("CarType.Hatchback"),
        JEEP("CarType.Jeep"),
        MONOVOLUME("CarType.MONOVOLUME");


        private final String label;

        CarType(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }

    public enum Brand{
        AUDI("Brand.Audi"),
        VOLKSWAGEN("Brand.Volkswagen"),
        SEAT("Brand.Seat"),
        SKODA("Brand.Skoda");

        private final String label;

        Brand(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }

    public enum Fuel{
        DIESEL("Fuel.Diesel"),
        BENZINE("Fuel.Benzine");

        private final String label;

        Fuel(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }

    public enum Type implements TypeInterface{
        INTERIOR("Type.Interior"),
        EXTERIOR("Type.Extrior"),
        TECHNICAL("Type.Technical"),
        SEATS("Type.Seats"),
        MEDIA("Type.Media");


        @Override
       public String getType(){
            return  label;
        }

        private final String label;


        Type(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }

    }

    public enum Interior{
         MIRROR("Interior.Mirror",Type.INTERIOR),
         DECORATIONPANEL("Interior.DecorationPanel",Type.INTERIOR),
         HEADLINING("Interior.Headling",Type.INTERIOR),
         CARPET("Interior.Carpet",Type.INTERIOR),
         LUGGAGE_COMPARTMENT_FLOOR("Interior.LuggageCompartmentFloor",Type.INTERIOR),
         LUGGAGE_FORMAT("Interior.LuggageFormat",Type.INTERIOR),
         SOLAR_BLINDS("Interior.SolarBlinds",Type.INTERIOR),
         AIRCO("Interior.Airco",Type.INTERIOR),
         OTHER("Interior.Other",Type.INTERIOR),
         STEERING_WHEEL("Interior.SteeringWheel",Type.INTERIOR);

        private final String label;
        private Type interior;

        Interior(String label, Type interior) {
            this.label = label;
            this.interior = interior;
        }
        public String getLabel() {
            return label;
        }

        public Type getInterior() {
            return Type.INTERIOR;
        }
    }

    public enum Seats{
        LUMBAR_SUPPORT("Seats.LumbarSupport",Type.SEATS),
        CENTER_ARMREST("Seats.CenterArmrest",Type.SEATS),
        SEAT_ADJUSTMENT("Seats.SeatAdjustment",Type.SEATS),
        SEAT_HEATING("Seats.SeatHeating",Type.SEATS),
        HIGHCHAIR("Seats.HighChair",Type.SEATS),
        COATING("Seats.Coating",Type.SEATS),
        OTHERS("Seats.Others",Type.SEATS);

        private final String label;
        private Type interior;

        Seats(String label, Type interior) {
            this.label = label;
            this.interior = interior;
        }
        public String getLabel() {
            return label;
        }

        public Type getInterior() {
            return interior;
        }
    }

    public enum Exterior{
        WINDOWS("Exterior.Windows",Type.EXTERIOR),
        MIRRORS("Exterior.Mirrors",Type.EXTERIOR),
        MODEL_IDENTIFIER("Exterior.ModelIdentifier",Type.EXTERIOR),
        HEADLIGHTS("Exterior.Headlights",Type.EXTERIOR),
        SUNROOF("Exterior.Sunroof",Type.EXTERIOR),
        WHEELS("Exterior.Wheels",Type.EXTERIOR),
        OTHERS("Exterior.Others",Type.EXTERIOR);

        private final String label;
        private Type interior;

        Exterior(String label, Type interior) {
            this.label = label;
            this.interior = interior;
        }
        public String getLabel() {
            return label;
        }

        public Type getInterior() {
            return interior;
        }
    }

    public enum Technical implements TypeInterface{

        CHASSIS("Technical.Chassis",Type.TECHNICAL),
        BRAKES("Technical.Brakes",Type.TECHNICAL),
        INNOVATIVE_CHASSIS_SYSTEMS("Technical.InnovativeChassisSystems",Type.TECHNICAL),
        SUPPORT_SYSTEMS("Technical.SupportSystems",Type.TECHNICAL),
        OTHERS("Technical.Others",Type.TECHNICAL);


        private final String label;
        private Type technical;

        Technical(String label, Type technical) {
            this.label = label;
            this.technical = technical;
        }

        public String getLabel() {
            return label;
        }

        @Override
        public String getType() {
            return technical.getType();
        }
    }


    public enum Media{

        GPS("Media.Gps",Type.MEDIA),
        RADIO("Media.Radio",Type.MEDIA),
        PHONE("Media.Phone",Type.MEDIA),
        SPEAKERS("Media.Speakers",Type.MEDIA),
        OTHERS("Media.Others",Type.MEDIA);

        private final String label;
        private Type media;

        Media(String label, Type media) {
            this.label = label;
            this.media = media;
        }

        public String getLabel() {
            return label;
        }

        public Type getMedia() {
            return Type.MEDIA;
        }


    }


}
