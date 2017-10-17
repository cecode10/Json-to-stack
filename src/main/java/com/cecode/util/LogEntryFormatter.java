package com.cecode.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

import com.cecode.domain.LogEntry;

public class LogEntryFormatter {

    public static String[] extractStackFromJson(String json) throws IOException {

        final BufferedReader br = new BufferedReader(new StringReader(json));
        final StringBuilder sb = new StringBuilder();
        String line;

        while((line=br.readLine()) != null) {
            sb.append(line.trim());
        }
        final String cleanNewLines = sb.toString().replaceAll("(\\\\n\\\\t|\\\\n)", " ");

        final Gson gson = new GsonBuilder().create();
        final LogEntry logEntry;
        try {
            logEntry = gson.fromJson(cleanNewLines, LogEntry.class);
        } catch (JsonSyntaxException e) {
            System.out.println("NO EXCEPTION ELEMENT FOUND IN THE LOG ENTRY");
            throw e;
        }
        final String exception = logEntry.getException();
        return exception.split("] ");
    }
}

