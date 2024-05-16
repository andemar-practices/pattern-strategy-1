package com.andemar.patternstrategy1.controller;

import com.andemar.patternstrategy1.domain.MessageStrategy;
import com.andemar.patternstrategy1.service.PrintMessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/print")
@RequiredArgsConstructor
public class PrintMessageController {

  private final PrintMessageService service;

  @PostMapping(value = "/message")
  public ResponseEntity<String> printMessage(@RequestBody MessageStrategy messageStrategy) {
    String messageWithStrategy = service.printMessage(messageStrategy);

    return ResponseEntity.ok(messageWithStrategy);
  }
}
