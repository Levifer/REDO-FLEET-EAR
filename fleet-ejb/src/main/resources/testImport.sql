/*Inserting options*/
INSERT INTO FLEET_OPTION (id,description, "name", price, "type") VALUES ('15','blablabl', 'bla', '50', 'Technical.Bla');
/*Inserting pack*/
INSERT INTO pack (id,benefitPrice,downgrade,price,"upgrade") VALUES ('15','852','963','951','752');
/*relationship between pack and option*/
INSERT INTO pack_fleet_option(Pack_id,options_id) VALUES (15,15);
/*Inserting carmodel*/
INSERT INTO carmodel(id,brand,category,co2,deliveryTime,fiscalHp,fuelType,imageUrl,maxKm,minKm,quarter,"type", "year", pack_id) VALUES ('15','Ford', '2','115', '25', '7','0', '', '150000','200000','1','Fiesta Titanium', '2014-11-15', '15');
/*Inserting employee*/
INSERT INTO employee(id,category,email,employeeNumber,"name","password", roles, "status", surname) VALUES ('15','2','test@test.Com','XX99','test','test123','FLEET_MANAGER','APPROVED','ting');