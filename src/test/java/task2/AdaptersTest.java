package task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.task2.Authorization;
import ua.edu.ucu.apps.task2.Database;
import ua.edu.ucu.apps.task2.ReportBuilder;

public class AdaptersTest {

    @Test
    public void testGetUserData() {
        Database db = new Database();
        String userData = db.getUserData();
        Assertions.assertEquals("hello", userData);
    }

    @Test
    public void testGetStaticData() {
        Database db = new Database();
        String staticData = db.getStaticData();
        Assertions.assertEquals("hello2", staticData);
    }

    @Test
    public void testLogin() {
        Database db = new Database();
        Authorization auth = new Authorization();
        Assertions.assertTrue(auth.login(db));
    }

    @Test
    public void testReportBuilder() {
        Database db = new Database();
        ReportBuilder reportBuilder = new ReportBuilder(db);
        Assertions.assertNotNull(reportBuilder);
    }
}

