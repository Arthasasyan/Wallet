package org.turingsquad.docs.rus.inn;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.turingsquad.docs.PersonalDocument;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
@SuperBuilder
public class INN extends PersonalDocument {
    private final String INNNumber;
}
