package com.module.db.common.enums;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RequiredArgsConstructor
public enum Del implements EnumMapperType {

    N(0, "유지"),
    Y(1, "삭제");

    @Getter
    private final int type;
    @Getter
    private final String name;

    private static final Map<String, Del> CACHE_NAME = Stream.of(values())
            .collect(Collectors.toMap(Del::getName, e -> e));

    private static final Map<Integer, Del> CACHE_TYPE = Stream.of(values())
            .collect(Collectors.toMap(Del::getType, e -> e));

    public static Del valueOfName(String name) {
        return CACHE_NAME.get(name);
    }
    public static Del valueOfType(Integer type) {
        return CACHE_TYPE.get(type);
    }

}
