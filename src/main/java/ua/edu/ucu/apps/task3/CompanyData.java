package ua.edu.ucu.apps.task3;

import lombok.Builder;

@Builder
public class CompanyData {
    private String name;
    private String domain;
    private String description;
    private String logo;
    private String companySpecifics;

    @Override
    public String toString() {
        return "Name of the company: "
                + name
                + "\n"
                + "\n"
                + "Domain: "
                + domain
                + "\n"
                + "\n"
                + "Description: "
                + description
                + "\n"
                + "\n"
                + "Logo URL: "
                + logo
                + "\n"
                + "\n"
                + "Company's specifics: "
                + companySpecifics
                + "\n";
    }
}
