package org.turingsquad.docs.rus.passports;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
@SuperBuilder
public class CitizenPassport extends Passport {
    private final String placeOfRegistration;
}
