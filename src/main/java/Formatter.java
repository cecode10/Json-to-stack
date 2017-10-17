import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

public class Formatter {

    public static void main(String[] args) throws IOException {

        final Properties props = new Properties();
        props.load(Formatter.class.getResourceAsStream("application.properties"));
        final String pathToFile = (String) props.get("project.basedir");

        final String fileContent = new String(
                Files.readAllBytes(Paths.get(pathToFile + "/src/main/resources/logentry.json")));

        final BufferedReader br = new BufferedReader(new StringReader(fileContent));
        final StringBuilder sb = new StringBuilder();
        String line;

        while((line=br.readLine()) != null){
            sb.append(line.trim());
        }
        final String cleanNewLines = sb.toString().replaceAll("(\\\\n\\\\t|\\\\n)", " ");

        final Gson gson = new GsonBuilder().create();
        final LogEntry logEntry;
        try {
            logEntry = gson.fromJson(cleanNewLines, LogEntry.class);
        } catch (JsonSyntaxException e) {
            System.out.println("NO EXCEPTION ELEMENT FOUND IN THE LOG ENTRY");
            return;
        }
        
        final String exception = logEntry.getException();
        final String[] slittedString = exception.split("] ");

        for (final String newLine : slittedString) {
            System.out.println(newLine);
        }
    }
}

