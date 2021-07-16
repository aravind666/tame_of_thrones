package com.aravind.tot.service;

import com.aravind.tot.domain.Message;
import com.google.common.collect.MapDifference;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MessageValidator {

  public static Message validate(Message message) {
    Map<String, Long> charCountMapMessage = getCharCountMap(message.getContent());
    Map<String, Long> charCountMapEmblem = getCharCountMap(message.getTo().getEmblem());
    MapDifference<String, Long> intersection =
        Maps.difference(charCountMapMessage, charCountMapEmblem);
    Map<String, MapDifference.ValueDifference<Long>> difference = intersection.entriesDiffering();

    long countOfCharDifferences = difference.entrySet().stream()
        .filter(entry -> entry.getValue().rightValue() <= entry.getValue().leftValue())
        .count();
    Boolean hasEveryCharsInEmblem = intersection.entriesOnlyOnRight().size() == 0;
    Boolean hasLeastSameCount = countOfCharDifferences == difference.size();

    Boolean acknowledged = hasEveryCharsInEmblem && hasLeastSameCount;

    message.setAcknowledged(acknowledged);
    return message;
  }

  private static Map<String, Long> getCharCountMap(String string) {
    return IntStream.range(0, string.length())
        .mapToObj(i -> string.substring(i, i + 1))
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
  }
}
