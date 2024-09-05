package com.example.daangn.house.domain.enumType;

import lombok.Getter;
import org.hibernate.cache.spi.SecondLevelCacheLogger;

@Getter
public enum ApprovalType {

    MONTHLY("월세"),
    CHARTER("전세"),
    SELL("매매"),
    SHORTTERM("단기");

    private String value;
    ApprovalType(String value) {

        this.value = value;
    }

}
