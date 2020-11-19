package com.restapi.myblog.payload;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Tadi's
 * Tega Isiboge
 * */

@EqualsAndHashCode(callSuper = true)
@Data
public abstract class UserDateAuditPayload extends DateAuditPayload {

    private Long createdBy;

    private Long updatedBy;
}
