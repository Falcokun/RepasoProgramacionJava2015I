package ppt.uno;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by Ricardo on 01/05/2015.
 * Repaso Java
 */
public class TryCatch {
    public static void main(String[] args) {
        try (
                BufferedReader inputReader = Files.newBufferedReader(
                        Paths.get(new URI("file:///C:/temp/wlpoxy.log")),
                        Charset.defaultCharset());
                BufferedWriter outputWriter = Files.newBufferedWriter(
                        Paths.get(new URI("file:///C:/temp/wlpoxy.bak")),
                        Charset.defaultCharset())) {
            String inputLine;
            while ((inputLine = inputReader.readLine()) != null) {
                outputWriter.write(inputLine);
                outputWriter.newLine();
            }
            System.out.println("Cppy Complete");
        } catch (URISyntaxException | IOException ex) {
            ex.printStackTrace();
        }
    }
}
