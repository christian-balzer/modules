package com.example.modules;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static java.util.Objects.nonNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)
@Import({FooMapperImpl.class})
public class FooServiceIT {

    @Autowired
    private FooMapper mapper;

    @Test
    void integrationTest() {
        FooDto dto = FooDto.builder().foo("foo").build();
        Foo result = mapper.toFoo(dto);
        assertTrue(nonNull(result));
        System.out.println("It runs.");
    }
}
