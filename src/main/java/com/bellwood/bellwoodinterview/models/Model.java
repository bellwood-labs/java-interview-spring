package com.bellwood.bellwoodinterview.models;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@Builder
@EqualsAndHashCode
public class Model {
    private final Type type;
    // other instance variables.
}
