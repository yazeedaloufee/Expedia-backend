package com.digisol.expedia_search.service;

import com.digisol.expedia_search.util.ExpediaApiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PackageService {

    private final ExpediaApiClient apiClient;

    @Autowired
    public PackageService(ExpediaApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public String searchPackages(String origin, String destination) {
        return apiClient.fetchPackageDeals(origin, destination);
    }
}
