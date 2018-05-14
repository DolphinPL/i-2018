/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.atividade7;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Classe que salva a imagen de perfil do gitHub.
 */
public class GitApi {


    /**
     * Método princial do programa.
     * @param args user git.
     */
    public static void main(String[] args) {

        try {
            imagemGit(args[0]);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
    * Método de integração com outros métodos.
    */
    private static void imagemGit(String arg) throws IOException {

        InputStream url = getUrl(arg);
        String newString = getJson(url);
        JsonObject gitUsuario = getDadosUsuario(newString);

        String avatar = getDadosChave(gitUsuario, "avatar_url");
        String name = getDadosChave(gitUsuario, "login");
        InputStream salvar = getAvatar(avatar);
        salvarArq(name, salvar);

    }

    /**
     * Metodo responsável por salvar o avatar.
     */
    private static void salvarArq(String name, InputStream salvar) throws IOException {

        Files.copy(salvar, Paths.get(name + ".jpg"));
    }

    private static InputStream getAvatar(String avatar) throws IOException {

        return new URL(avatar).openStream();
    }

    /**
     * Método responsável por separar as informações necessárias.
     */
    private static String getDadosChave(JsonObject gitUsuario, String chave) {

        return gitUsuario.get(chave).toString().replaceAll("\"", "");
    }

    /**
     * Método que extrai informações.
     */
    private static JsonObject getDadosUsuario(String newString) {
        JsonParser dados = new JsonParser();

        return dados.parse(newString).getAsJsonObject();
    }

    /**
     * Método que obtém o Json.
     */
    private static String getJson(InputStream url) throws IOException {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        int aux;
        byte[] dados = new byte[16384];

        while ((aux = url.read(dados, 0, dados.length)) != -1) {
            buffer.write(dados, 0, aux);
        }

        buffer.flush();
        String json = new String(buffer.toByteArray(), StandardCharsets.UTF_8);

        return json;

    }

    /**
     * Método que obtém URL.
     * @param arg usuário.
     */
    private static InputStream getUrl(String arg) throws IOException {

        URL url = new URL(arg);
        HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
        conexao.setRequestMethod("get");
        conexao.setReadTimeout(15*1000);
        conexao.connect();

        return conexao.getInputStream();
    }

}
