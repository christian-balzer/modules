package com.example.modules;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface FooMapper {

    Foo toFoo(FooDto dto);
}
