package com.andemar.patternstrategy1.service.impl;

import static com.andemar.patternstrategy1.util.strategy.SelectStrategyUtil.selectStrategy;

import com.andemar.patternstrategy1.domain.MessageStrategy;
import com.andemar.patternstrategy1.service.PrintMessageService;
import com.andemar.patternstrategy1.util.strategy.PrintMessageStrategy;
import org.springframework.stereotype.Service;

@Service
public class PrintMessageServiceImpl implements PrintMessageService {

  @Override
  public String printMessage(MessageStrategy messageStrategy) {

    PrintMessageStrategy printMessageStrategy = selectStrategy(messageStrategy.getStrategy());

    return printMessageStrategy.printMessage(messageStrategy.getMessage());
  }
}
