package com.realdolmen;

import org.dbunit.database.DatabaseConfig;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.ext.mysql.MySqlDataTypeFactory;
import org.dbunit.operation.DatabaseOperation;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by TLAAU71 on 4/11/2014.
 */
public class ImportPersistenceTest extends PersistenceTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before
    public void loadDataSet() throws Exception{
        logger.info("loading dataSet");

        Connection jdbcConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rdfleettest", "root", "root");
        IDatabaseConnection connection = new DatabaseConnection(jdbcConnection);

        Connection productionConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rdfleet", "root", "root");
        IDatabaseConnection con = new DatabaseConnection(productionConnection);
        String[] tables = {"fleet_option","pack","custompack","custompack_fleet_option","carmodel","car","employee", "employee_car"};
        IDataSet dataSet = con.createDataSet(tables);

        //set factorytype in dbconfig to remove warning
        DatabaseConfig dbConfig = connection.getConfig();
        dbConfig.setProperty(DatabaseConfig.PROPERTY_DATATYPE_FACTORY, new MySqlDataTypeFactory());

        DatabaseOperation.CLEAN_INSERT.execute(connection,dataSet);
    }

}
