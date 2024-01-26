package org.qgeff.designpatterns.creational.factory;

public class MapperFactory {

    private MapperFactory() {
        throw new IllegalStateException("Factory class");
    }

    public static IMapper getMapper(Mapper name){
        switch (name) {
            case REQUEST:
                return new RequestMapper();
            case EXECUTION:
                return new ExecutionMapper();
            case VALUATION:
                return new ValuationMapper();
            default:
                return new GenericMapper();
        }
    }
}
