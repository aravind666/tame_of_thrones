package com.aravind.tot;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BaseFunctionalTest {
  private final ByteArrayOutputStream modifiedOutputStream = new ByteArrayOutputStream();
  private final ByteArrayOutputStream modifiedErrorStream = new ByteArrayOutputStream();
  private PrintStream originalOutputStream;
  private PrintStream originalErrorStream;

  public void setUpStreams() {
    originalOutputStream = System.out;
    originalErrorStream = System.err;
    System.setOut(new PrintStream(modifiedOutputStream));
    System.setErr(new PrintStream(modifiedErrorStream));
  }

  public void restoreStreams() {
    System.setOut(originalOutputStream);
    System.setErr(originalErrorStream);
  }

  public ByteArrayOutputStream getModifiedOutputStream() {
    return modifiedOutputStream;
  }

  public ByteArrayOutputStream getModifiedErrorStream() {
    return modifiedErrorStream;
  }

  public PrintStream getOriginalOutputStream() {
    return originalOutputStream;
  }

  public PrintStream getOriginalErrorStream() {
    return originalErrorStream;
  }

}
