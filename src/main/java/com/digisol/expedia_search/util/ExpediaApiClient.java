package com.digisol.expedia_search.util;



import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class ExpediaApiClient {

    private final RestTemplate restTemplate = new RestTemplate();

    public String fetchPackageDeals(String origin, String destination) {
        String url = UriComponentsBuilder.fromHttpUrl("https://offersvc.expedia.com/offers/v2/getOffers")
                .queryParam("scenario", "deal-finder")
                .queryParam("page", 6)
                .queryParam("uid", "test")
                .queryParam("productType", "Package")
                .queryParam("clientId", "test")
                .queryParam("originCity", origin)
                .queryParam("destinationCity", destination)
                .toUriString();

        return restTemplate.getForObject(url, String.class);
    }
}
