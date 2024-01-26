package org.qgeff.designpatterns.creational.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ValuationMapper implements IMapper{
    private static final Mapper MAPPER_NAME = Mapper.VALUATION;

    @Override
    public String getMapperName() {
        return MAPPER_NAME.name();
    }

    @Override
    public void map() {
        log.info("I'm mapping {}", MAPPER_NAME);
    }
}
