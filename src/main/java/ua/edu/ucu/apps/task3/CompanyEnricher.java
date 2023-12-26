package ua.edu.ucu.apps.task3;

import java.util.Map;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CompanyEnricher {

    public CompanyData enrich(String domain) {
        
        BrandFetchEnricher brandFetchEnricher = new BrandFetchEnricher();
        Map<String, String> data = brandFetchEnricher.scrape(domain);
        return CompanyData.builder()
                .name(data.get("name"))
                .domain(data.get("domain"))
                .logo(data.get("logoUrl"))
                .description(data.get("description"))
                .companySpecifics(data.get("specifics"))
                .build();
        
    }
}
