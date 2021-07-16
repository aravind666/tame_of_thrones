package com.aravind.tot.domain;

public class Message {
  private final Integer cipher;
  private final String content;
  private final Kingdom to;
  private final Kingdom from;
  private Boolean acknowledged;

  public Message(String content, Kingdom to, Kingdom from, Boolean acknowledged) {
    this.cipher = to.getEmblem().length();
    this.content = content;
    this.to = to;
    this.from = from;
    this.acknowledged = acknowledged;
  }

  public Integer getCipher() {
    return cipher;
  }

  public String getContent() {
    return content;
  }

  public Kingdom getTo() {
    return to;
  }

  public Kingdom getFrom() {
    return from;
  }

  public Boolean getAcknowledged() {
    return acknowledged;
  }

  public void setAcknowledged(Boolean acknowledged) {
    this.acknowledged = acknowledged;
  }
}
