package org.qgeff.designpatterns.creational.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RequestMapper implements IMapper{
    private static final Mapper REQUEST = Mapper.REQUEST;

    @Override
    public String getMapperName() {
        return REQUEST.name();
    }

    @Override
    public void map() {
      log.info("I'm mapping {}", REQUEST);
    }
}
