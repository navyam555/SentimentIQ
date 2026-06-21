package com.sentimentiq.sentimentiq;

import org.springframework.stereotype.Service;

@Service
public class SentimentService {

    public String analyze(String text) {

        text = text.toLowerCase();

        if (text.contains("good") ||
            text.contains("great") ||
            text.contains("excellent") ||
            text.contains("happy")) {
            return "Positive";
        }

        if (text.contains("bad") ||
            text.contains("worst") ||
            text.contains("sad") ||
            text.contains("hate")) {
            return "Negative";
        }

        return "Neutral";
    }
}