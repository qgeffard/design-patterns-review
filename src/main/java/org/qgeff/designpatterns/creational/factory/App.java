package org.qgeff.designpatterns.creational.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
    public static void main(String[] args) {
        IMapper executionMapper = MapperFactory.getMapper(Mapper.EXECUTION);
        IMapper requestMapper = MapperFactory.getMapper(Mapper.REQUEST);

        executionMapper.map();
        requestMapper.map();
    }
}
