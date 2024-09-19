package com.ananda.AnandaJava.config;

import com.google.cloud.secretmanager.v1.SecretManagerServiceClient;
import com.google.cloud.secretmanager.v1.SecretVersionName;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.api.client.util.Value;
import com.google.cloud.secretmanager.v1.AccessSecretVersionResponse;

import javax.sql.DataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecretConfig {

    @Value("${gcp.project.id}")
    private String v1;

    @Value("${secret.id}")
    private String v2;

    private String getSecret(SecretManagerServiceClient client, String secretId) throws Exception {

        System.out.println("v1 "+ v1 + "v2"+ v2);
    	
        String projectId = "gcp-training-710"; // Your GCP project ID
        String versionId = "latest"; // Or a specific version

        SecretVersionName secretVersionName = SecretVersionName.of(projectId, secretId, versionId);
        AccessSecretVersionResponse response = client.accessSecretVersion(secretVersionName);
        return response.getPayload().getData().toStringUtf8();
    }

    @Bean
    public SecretManagerServiceClient secretManagerServiceClient() throws Exception {
        return SecretManagerServiceClient.create();
    }

    @Bean
    public DataSource dataSource(SecretManagerServiceClient client) throws Exception {
        String secretBody = getSecret(client, "ananda-java-secret"); // Secret ID 

        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(secretBody, JsonObject.class);

        String dbHost = jsonObject.get("DB_HOST").getAsString();
        String dbUsername = jsonObject.get("DB_USERNAME").getAsString();
        String dbPassword = jsonObject.get("DB_PASSWORD").getAsString();
        String dbName = jsonObject.get("DB_NAME").getAsString();

        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url("jdbc:mysql://" + dbHost + "/" + dbName); 
        dataSourceBuilder.username(dbUsername);
        dataSourceBuilder.password(dbPassword);

        return dataSourceBuilder.build();
    }
}
