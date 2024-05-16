package com.andemar.patternstrategy1.domain;

import com.andemar.patternstrategy1.domain.enums.PrintMessageStrategyEnum;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MessageStrategy {
  String message;
  PrintMessageStrategyEnum strategy;
}
