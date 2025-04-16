//package com.digisol.expedia_search.dto;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//
//public class ExpediaResponse {
//    private Offers offers;
//
//    public Offers getOffers() {
//        return offers;
//    }
//
//    public void setOffers(Offers offers) {
//        this.offers = offers;
//    }
//
//    @JsonIgnoreProperties(ignoreUnknown = true)
//    public static class Offers {
//        private List<PackageOffer> Package;
//
//        public List<PackageOffer> getPackage() {
//            return Package;
//        }
//
//        public void setPackage(List<PackageOffer> aPackage) {
//            Package = aPackage;
//        }
//
//    }
//    @JsonIgnoreProperties(ignoreUnknown = true)
//    public class PackageOffer {
//        private HotelInfo hotelInfo;
//        private FlightInfo flightInfo;
//        private PackagePricingInfo packagePricingInfo;
//
//        public HotelInfo getHotelInfo() { return hotelInfo; }
//        public void setHotelInfo(HotelInfo hotelInfo) { this.hotelInfo = hotelInfo; }
//
//        public FlightInfo getFlightInfo() { return flightInfo; }
//        public void setFlightInfo(FlightInfo flightInfo) { this.flightInfo = flightInfo; }
//
//        public PackagePricingInfo getPackagePricingInfo() { return packagePricingInfo; }
//        public void setPackagePricingInfo(PackagePricingInfo packagePricingInfo) { this.packagePricingInfo = packagePricingInfo; }
//
//        // You can add more fields if needed
//    }
//
//    public class HotelInfo{
//
//    }
//}
