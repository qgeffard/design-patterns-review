package org.qgeff.designpatterns.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.List;


@AllArgsConstructor
@Setter
@ToString
public class IceCreamCone implements Cloneable {
    private boolean withChocolate;
    private List<String> flavors;

    public Object clone() {
        return new IceCreamCone(this.withChocolate, this.flavors.stream().toList());
    }
}
