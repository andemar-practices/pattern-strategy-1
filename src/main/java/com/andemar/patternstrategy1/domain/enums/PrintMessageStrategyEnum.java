package com.andemar.patternstrategy1.domain.enums;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public enum PrintMessageStrategyEnum {
  HAPPY("Happy!"),
  SAD("Sad :("),
  DEFAULT("Default");

  final String message;

  PrintMessageStrategyEnum(String message) {
    this.message = message;
  }
}
