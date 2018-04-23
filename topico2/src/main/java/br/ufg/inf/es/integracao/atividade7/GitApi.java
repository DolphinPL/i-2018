
package br.ufg.inf.es.integracao.atividade7;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Classe que salva a imagen de perfil do gitHub.
 */
public class GitApi {

  /**
  * Método responsável por buscar e armazenar a foto de perfil de um usuário no git.
  */
  public void buscaArmazenaAvatar() {
    try {
      URL url = new URL("https://github.com/users/kyriosdata");
      HttpURLConnection connection = (HttpURLConnection) url.openConnection();

      connection.setRequestMethod("GET");
      connection.setReadTimeout(15*1000);
      connection.connect();

      reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
      StringBuilder tmp = new StringBuilder();

      String line = null;
      
      while ((line = reader.readLine()) != null) {
        tmp.append(line + "\n");
      }

      String tmp = tmp.toString();

      JsonParser parser = new JsonParser();
      JsonObject gitUserJSON = parser.parse(tmp).getAsJsonObject();
      String avatar = gitUserJSON.get("avatar_url").toString().replaceAll("\"", "");
      String user= gitUserJSON.get("login").toString().replaceAll("\"", "");

      InputStream in = new URL(avatar).openStream();
      Files.copy(in, Paths.get(user+ ".jpg"));
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      reader.close();
    }
  }

}
