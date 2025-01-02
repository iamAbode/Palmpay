package org.gateway.palmpay.response;

import lombok.Data;

/**
 * @Author ABODE
 * @Date 2024/12/23 5:35 AM
 */
@Data
public class PolicyStatusData {

    private String effectiveDate;
    private String expiryDate;
    private String status;
    private String trackNumber;

}
