package io.github.andreepdias.http;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter{

    @Override
    public void post(String url, Map<String, Object> dados) {
        try {
            URL urlDaAPI = new URL(url);
            URLConnection connection = urlDaAPI.openConnection();
            connection.connect();
        } catch (Exception e) {
            throw  new RuntimeException("Erro ao enviar requisição HTTP", e);
        }
    }
}
