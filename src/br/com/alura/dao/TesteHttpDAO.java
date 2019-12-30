package br.com.alura.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * @author george on 29/12/2019
 * @project Novidades-Java-11
 */
public class TesteHttpDAO {

    public void testaConexaoHttp() throws IOException {
        URL url = new URL("http://www.google.com.br");
        URLConnection urlConnection = url.openConnection();
        BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    public void testaConexaoHttp2() throws IOException, InterruptedException, URISyntaxException {
        URI uri = new URI("https://www.google.com.br");

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest req = HttpRequest.newBuilder(uri).GET().build();

        HttpResponse<String> resp = client.send(req, HttpResponse.BodyHandlers.ofString());

        System.out.println(resp.body());
    }

}
