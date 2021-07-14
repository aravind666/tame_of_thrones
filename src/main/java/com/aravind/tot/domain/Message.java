package com.aravind.tot.domain;

public class Message {
  private final Integer cipher;
  private final String content;
  private final Kingdom to;
  private final Kingdom from;
  private Boolean valid;

  public Message(String content, Kingdom to, Kingdom from, Boolean valid) {
    this.cipher = to.getEmblem().length();
    this.content = content;
    this.to = to;
    this.from = from;
    this.valid = valid;
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

  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }
}
