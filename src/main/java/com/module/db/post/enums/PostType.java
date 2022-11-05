package com.module.db.post.enums;


import com.module.db.common.enums.EnumMapperType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RequiredArgsConstructor
public enum PostType implements EnumMapperType {

    ETC(0, "기타"),
    FREE(1, "자유"),
    COMPANY(2, "회사"),
    FOOD(3, "먹방");

    @Getter
    private final int type;
    @Getter
    private final String name;

    private static final Map<String, PostType> CACHE_NAME = Stream.of(values())
            .collect(Collectors.toMap(PostType::getName, e -> e));

    private static final Map<Integer, PostType> CACHE_TYPE = Stream.of(values())
            .collect(Collectors.toMap(PostType::getType, e -> e));

    public static PostType valueOfName(String name) {
        return CACHE_NAME.get(name);
    }
    public static PostType valueOfType(Integer type) {
        return CACHE_TYPE.get(type);
    }

}
