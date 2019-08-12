package com.springframework.didemo.practise;

public class VehicleInsuranceSurveyor extends InsuranceSurveyor {
    @Override
    public boolean isValidClaim() {
        System.out.println("VehicleInsuranceSurveyor: validating vehicle insurance claim ");
        return true;
    }
}
