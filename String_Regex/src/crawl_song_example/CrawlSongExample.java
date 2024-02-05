package crawl_song_example;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSongExample {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");

            HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();

            conn.setRequestMethod("GET");
            conn.connect();

            conn.disconnect();

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            conn.setRequestMethod("GET");
            conn.connect();

            int responseCode = conn.getResponseCode();
            System.out.println("Phản hồi từ trang web: " + responseCode);

            // open the stream and put it into BufferedReader
            Scanner scanner = new Scanner(new InputStreamReader(conn.getInputStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            // close scanner
            scanner.close();
            // remove all new line
            content = content.replaceAll("\\n+", "");
            // regex
            Pattern p = Pattern.compile("name_song\">(.*?)</a>");
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println(m.group(1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
