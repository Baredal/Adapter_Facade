package ua.edu.ucu.apps.task3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor
public class BrandFetchEnricher {
    private static final String url = "https://brandfetch.com/";
    
    @SneakyThrows
    public Map<String, String> scrape(String domain) {

        Document htmlContent = Jsoup.connect(url + domain)
        .userAgent("Mozilla")
        .header("Accept", "text/html")
        .header("Accept-Encoding", "gzip,deflate")
        .header("Accept-Language", "uk-UA")
        .ignoreContentType(true)
        .get();
        

        Map<String, String> data = new HashMap<>();
        StringBuilder description = new StringBuilder();
        
        String name = htmlContent.getElementsByClass("sc-71c58ef3-0 lfirpY").text();
        String logo = htmlContent.select(".sc-e757139f-2.iFJobI img").first().attr("src");
        String companySpecifics = htmlContent.getElementsByClass("sc-1201eaf9-0 jzfcbK").first().text();

        Elements descriptionDivs = htmlContent.getElementsByClass("sc-1201eaf9-0 boNALy");

        for (Element element : descriptionDivs) {
            String info = element.text();
            description.append(info);
        }
        
        data.put("name", name);
        data.put("domain", domain);
        data.put("description", description.toString());
        data.put("logoUrl", logo);
        data.put("specifics", companySpecifics);

        return data;
    }

}
