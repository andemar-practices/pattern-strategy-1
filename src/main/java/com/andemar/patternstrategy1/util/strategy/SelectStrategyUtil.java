package com.andemar.patternstrategy1.util.strategy;

import com.andemar.patternstrategy1.domain.enums.PrintMessageStrategyEnum;

public class SelectStrategyUtil {

  public static PrintMessageStrategy selectStrategy(PrintMessageStrategyEnum strategyEnum) {
    PrintMessageStrategy strategySelected;

    switch (strategyEnum) {
      case PrintMessageStrategyEnum.HAPPY -> strategySelected = new PrintMessageHappyImpl();
      case PrintMessageStrategyEnum.SAD -> strategySelected = new PrintMessageSadImpl();
      default -> strategySelected = new PrintMessageDefaultImpl();
    }

    return strategySelected;
  }
}
