package com.andemar.patternstrategy1.service;

import com.andemar.patternstrategy1.domain.MessageStrategy;

public interface PrintMessageService {

  String printMessage(MessageStrategy messageStrategy);
}
