package com.ananda.AnandaJava.config;

import com.google.cloud.secretmanager.v1.SecretManagerServiceClient;
import com.google.cloud.secretmanager.v1.SecretVersionName;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.api.client.util.Value;
import com.google.cloud.secretmanager.v1.AccessSecretVersionResponse;
//import com.ananda.AnandaJava.body.SecretBody;
//import com.ananda.AnandaJava.model.Users;

//import com.ananda.AnandaJava.body.SecretBody;

//import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecretConfig {

    @Value("${don}")
	String don;
	
    @Bean
    public SecretManagerServiceClient secretManagerServiceClient() throws Exception {
        // Create and return an instance of SecretManagerServiceClient
        // System.out.println("secrets >> \n ==========================");
        return SecretManagerServiceClient.create();
    }

    @Bean
    public String mySecret(SecretManagerServiceClient client) throws Exception {
    	
        String projectId = "gcp-training-710"; // Replace with your project ID
        String secretId = "ananda-java-secret";   // Replace with your secret ID
        String versionId = "latest"; // Or specify a version number

        SecretVersionName secretVersionName = SecretVersionName.of(projectId, secretId, versionId);
        
        // Access the secret version
        AccessSecretVersionResponse response = client.accessSecretVersion(secretVersionName);

        String secretBody = response.getPayload().getData().toStringUtf8();
        
        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(secretBody, JsonObject.class);

		System.setProperty("DB_HOST", jsonObject.get("DB_HOST").getAsString());
		System.setProperty("DB_USERNAME", jsonObject.get("DB_USERNAME").getAsString());
		System.setProperty("DB_PASSWORD", jsonObject.get("DB_PASSWORD").getAsString());
		System.setProperty("DB_NAME", jsonObject.get("DB_NAME").getAsString());
		System.setProperty("JAVA_ENV", jsonObject.get("JAVA_ENV").getAsString());
		System.setProperty("jsonObject.get(\"JWT_KEY\").getAsString()", jsonObject.get("JWT_KEY").getAsString());

        System.out.println("secrets >> \n ==========================\n" + response.getPayload().getData().toStringUtf8());
        System.out.println("jsonObject.get(\"DB_HOST\").getAsString() >> \n ==========================\n" + jsonObject.get("DB_HOST").getAsString());
        System.out.println("don >> \n ==========================\n" + don);

        
        return response.getPayload().getData().toStringUtf8();
    }
}
