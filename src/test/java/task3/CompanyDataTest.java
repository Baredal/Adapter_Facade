package task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.task3.CompanyData;
import ua.edu.ucu.apps.task3.CompanyEnricher;

public class CompanyDataTest {

    @Test
    public void testScrape() {
        CompanyData companyData = new CompanyEnricher().enrich("samsung.com"); 
        Assertions.assertNotNull(companyData);

    }
    
}
