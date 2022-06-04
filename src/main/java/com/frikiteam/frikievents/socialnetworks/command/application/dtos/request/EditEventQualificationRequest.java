package com.frikiteam.frikievents.socialnetworks.command.application.dtos.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EditEventQualificationRequest {

    private String eventQualificationId;
    private Integer starsQuantity;


    public EditEventQualificationRequest() {
    }

    public EditEventQualificationRequest(String eventQualificationId, Integer starsQuantity) {
        this.eventQualificationId = eventQualificationId;
        this.starsQuantity = starsQuantity;
    }
}
