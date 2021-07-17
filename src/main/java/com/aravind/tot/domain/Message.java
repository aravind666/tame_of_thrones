package com.aravind.tot.domain;

import java.util.Objects;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Message)) {
      return false;
    }
    Message message = (Message) o;
    return Objects.equals(getCipher(), message.getCipher())
        && Objects.equals(getContent(), message.getContent())
        && Objects.equals(getTo(), message.getTo())
        && Objects.equals(getFrom(), message.getFrom())
        && Objects.equals(getAcknowledged(), message.getAcknowledged());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getCipher(), getContent(), getTo(), getFrom(), getAcknowledged());
  }

  public Boolean getAcknowledged() {
    return acknowledged;
  }

  public void setAcknowledged(Boolean acknowledged) {
    this.acknowledged = acknowledged;
  }
}
