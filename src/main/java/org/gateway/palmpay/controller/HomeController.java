package org.gateway.palmpay.controller;

import org.gateway.palmpay.request.PolicyStatusRequest;
import org.gateway.palmpay.response.PolicyStatusData;
import org.gateway.palmpay.response.PolicyStatusResponse;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @Author ABODE
 * @Date 2024/12/22 8:32 PM
 */
@RestController
@RequestMapping("home")
public class HomeController {

    @GetMapping("land")
    public String getHomepage(){
        return "Welcome to Palmpay Testing AWS page";
    }

    @PostMapping("policyStatus")
    public ResponseEntity<PolicyStatusResponse> getPolicyStatus(@RequestBody PolicyStatusRequest request){

        PolicyStatusResponse policyStatus = new PolicyStatusResponse();
        policyStatus.setStatus(true); policyStatus.setMessage("Successful");

        PolicyStatusData data = new PolicyStatusData();
        data.setEffectiveDate("2024-01-31");
        data.setExpiryDate("2078-01-01");
        data.setStatus("ACTIVE");
        data.setTrackNumber("5013089512");
        policyStatus.setData(data);

        ResponseEntity<PolicyStatusResponse> response = new ResponseEntity(policyStatus, HttpStatusCode.valueOf(200));
        return response;
    }
}
