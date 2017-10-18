package com.cecode.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.cecode.exception.BadFormatException;
import com.cecode.exception.NoStackFoundException;
import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

import com.cecode.domain.LogEntry;

public class LogEntryFormatter {

    public static List<String> extractStackFromJson(String json)
            throws IOException, NoStackFoundException, BadFormatException {

        final BufferedReader br = new BufferedReader(new StringReader(json));
        final StringBuilder sb = new StringBuilder();
        String line;

        while((line = br.readLine()) != null) {
            sb.append(line.trim());
        }
        final String cleanNewLines = sb.toString().replaceAll("(\\\\n\\\\t|\\\\n)", " ");

        final Gson gson = new GsonBuilder().create();
        final LogEntry logEntry;
        try {
            logEntry = gson.fromJson(cleanNewLines, LogEntry.class);
        } catch (JsonSyntaxException e) {
            throw new BadFormatException("Not a valid JSON format", e);
        }

        if (logEntry == null || logEntry.getException() == null) {
            throw new NoStackFoundException("No exception element found in the Log entry");
        }
        final String exception = logEntry.getException();
        final String[] result = exception.split("] ");
        return Arrays.stream(result).collect(Collectors.toList());
    }
}

