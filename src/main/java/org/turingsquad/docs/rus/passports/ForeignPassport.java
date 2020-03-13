package org.turingsquad.docs.rus.passports;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
@SuperBuilder
public class ForeignPassport extends Passport {
    private final Date expirationDate;
}
