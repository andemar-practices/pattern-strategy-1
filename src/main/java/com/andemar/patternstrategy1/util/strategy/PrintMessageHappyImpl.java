package com.andemar.patternstrategy1.util.strategy;

import com.andemar.patternstrategy1.domain.enums.PrintMessageStrategyEnum;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class PrintMessageHappyImpl implements PrintMessageStrategy {

  @Override
  public String printMessage(String message) {
    return String.format("The message is: %s, with state %s", message, PrintMessageStrategyEnum.HAPPY);
  }
}
