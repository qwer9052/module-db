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
    FREE(1, "자유"),//
    COMPANY(2, "회사"),//
    FOOD(3, "먹방"),//
    REAL_ESTATE(4, "부동산"),//
    STOCK(5, "주식/투지"),//
    DATE(6, "썸연애"),//
    HOBBY(7, "취미"),//
    SHOPPING(8, "쇼핑"),//
    PET(9, "반려동물"),//
    SPORTS(10, "스포츠"),//
    MILITARY(11, "군대"),//
    RECRUITMENT(12, "채용");

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
