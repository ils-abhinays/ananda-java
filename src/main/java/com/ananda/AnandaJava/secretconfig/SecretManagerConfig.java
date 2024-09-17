package com.ananda.AnandaJava.secretconfig;

// import com.google.cloud.secretmanager.v1.SecretManagerServiceClient;
// import com.google.cloud.secretmanager.v1.SecretVersionName;
// // import com.google.api.client.util.Value;
// import com.google.cloud.secretmanager.v1.AccessSecretVersionResponse;
// // import org.springframework.beans.factory.annotation.Value;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// //import org.springframework.core.env.Environment;

// @Configuration
// public class SecretManagerConfig {

// //    @Value("${spring.cloud.gcp.secret-manager.secret-id}")
// //    private String secretId;
    
//     private final String projectId = "gcp-training-710";  // Replace with your project ID
//     private final String secretId = "ananda-java-secret";    // Replace with your secret I
    
//     @Bean
//     String secretValue() {
//         try (SecretManagerServiceClient client = SecretManagerServiceClient.create()) {
//             SecretVersionName secretVersionName = SecretVersionName.of(projectId, secretId, "latest");
//             AccessSecretVersionResponse response = client.accessSecretVersion(secretVersionName);
//             System.out.println("secrets-->> " +  response.getPayload().getData().toStringUtf8());
//             return response.getPayload().getData().toStringUtf8();
//         } catch (Exception e) {
//             throw new RuntimeException("Failed to fetch secret", e);
//         }
//     }
// }


import com.google.cloud.secretmanager.v1.SecretManagerServiceClient;
import com.google.cloud.secretmanager.v1.SecretVersionName;
import com.google.cloud.secretmanager.v1.AccessSecretVersionResponse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class SecretManagerConfig {

    private final Environment environment;

    public SecretManagerConfig(Environment environment) {
        this.environment = environment;
    }

    @Bean
    public String mySecret() throws Exception {
        String projectId = "gcp-training-710"; // Replace with your project ID
        String secretId = "greeting-polish";   // Replace with your secret ID
        String versionId = "1"; // Or specify a version number

        SecretVersionName secretVersionName = SecretVersionName.of(projectId, secretId, versionId);
        
        try (SecretManagerServiceClient client = SecretManagerServiceClient.create()) {
            AccessSecretVersionResponse response = client.accessSecretVersion(secretVersionName);
            return response.getPayload().getData().toStringUtf8();
        }
    }
}
