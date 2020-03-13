package org.turingsquad.docs.rus.passports;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PassportIssuePlace {
    private final String placeName;
    private final String placeNumber;
}
