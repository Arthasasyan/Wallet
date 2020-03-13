package org.turingsquad.docs.rus.snils;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.turingsquad.docs.PersonalDocument;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
@SuperBuilder
public class Snils extends PersonalDocument {
    private final String number;
    private final String placeOfBirth;
}
