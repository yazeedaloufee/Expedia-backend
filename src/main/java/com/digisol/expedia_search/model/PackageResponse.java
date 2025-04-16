package com.digisol.expedia_search.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PackageResponse {
    private List<Object> offers;  // Replace Object with a real Offer class if needed
}