package com.springframework.didemo.practice;

import com.springframework.didemo.practise.ClaimApprovalManager;
import com.springframework.didemo.practise.HealthInsuranceSurveyor;
import com.springframework.didemo.practise.VehicleInsuranceSurveyor;
import org.junit.Test;

public class ClaimApprovalManagerTest {
   @Test
    public void testPrpcessClaim(){
       HealthInsuranceSurveyor healthInsuranceSurveyor=new HealthInsuranceSurveyor();
       ClaimApprovalManager claim1 = new ClaimApprovalManager();
       claim1.processClaim(healthInsuranceSurveyor);
       VehicleInsuranceSurveyor vehicleInsuranceSurveyor=new VehicleInsuranceSurveyor();
       ClaimApprovalManager claim2=new ClaimApprovalManager();
       claim2.processClaim(vehicleInsuranceSurveyor);
    }
}
