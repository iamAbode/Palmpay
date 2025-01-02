package org.gateway.palmpay.response;

import lombok.Data;

/**
 * @Author ABODE
 * @Date 2024/12/23 5:30 AM
 */
@Data
public class PolicyStatusResponse {

    private boolean status;
    private String message;
    private PolicyStatusData data;

}
