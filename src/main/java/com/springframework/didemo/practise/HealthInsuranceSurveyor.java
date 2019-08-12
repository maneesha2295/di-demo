package com.springframework.didemo.practise;

public class HealthInsuranceSurveyor extends InsuranceSurveyor{
    @Override
    public boolean isValidClaim() {
        System.out.println("HealthInsuranceSurveyor: validation health insurance claim..");
        return true;
    }

}
