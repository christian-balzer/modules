package com.example.modules;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FooService {
    private final FooMapper mapper;

    public Foo convert(FooDto dto) {
        return mapper.toFoo(dto);
    }
}
