package org.qgeff.designpatterns.creational.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GenericMapper implements IMapper{
    private static final Mapper MAPPER_NAME = Mapper.GENERIC;

    @Override
    public String getMapperName() {
        return MAPPER_NAME.name();
    }

    @Override
    public void map() {
        log.info("I'm mapping {}", MAPPER_NAME);
    }
}
