package com.ananda.AnandaJava.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.ananda.AnandaJava.body.AuthTokenBody;

@Service
public class JwtService {
	
//	 	@Value("${security.jwt.secret-key}")
	 	@Value("xxxxyyyyzzz")
	    private String secretKey;

	    @Value("3600000")
//	    @Value("${security.jwt.expiration-time}")
	    private long jwtExpiration;

	    public String extractUsername(String token) {
	        return extractClaim(token, Claims::getSubject);
	    }

	    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
	        final Claims claims = extractAllClaims(token);
	        return claimsResolver.apply(claims);
	    }

	    public String generateToken(AuthTokenBody authTokenBody) {
	    	System.out.print("authTokenBody>>>" + authTokenBody);
	        return generateToken(new HashMap<>(), authTokenBody);
	    }

//	    private String generateToken(Object object, AuthTokenBody authTokenBody) {
//			// TODO Auto-generated method stub
//			return null;
//		}

		public String generateToken(Map<String, Object> extraClaims, AuthTokenBody authTokenBody) {
	        return buildToken(extraClaims, authTokenBody, jwtExpiration);
	    }

	    public long getExpirationTime() {
	        return jwtExpiration;
	    }

	    private String buildToken(
	            Map<String, Object> extraClaims,
	            AuthTokenBody authTokenBody,
	            long expiration
	    ) {
	        return Jwts
	                .builder()
	                .setClaims(extraClaims)
	                .setSubject(authTokenBody.getEmail())
	                .setIssuedAt(new Date(System.currentTimeMillis()))
	                .setExpiration(new Date(System.currentTimeMillis() + expiration))
	                .signWith(getSignInKey(), SignatureAlgorithm.HS256)
	                .compact();
	    }

	    public boolean isTokenValid(String token, AuthTokenBody authTokenBody) {
	        final String username = extractUsername(token);
	        return (username.equals(authTokenBody.getEmail())) && !isTokenExpired(token);
	    }

	    private boolean isTokenExpired(String token) {
	        return extractExpiration(token).before(new Date());
	    }

	    private Date extractExpiration(String token) {
	        return extractClaim(token, Claims::getExpiration);
	    }

	    private Claims extractAllClaims(String token) {
	        return Jwts
	                .parserBuilder()
	                .setSigningKey(getSignInKey())
	                .build()
	                .parseClaimsJws(token)
	                .getBody();
	    }

	    private Key getSignInKey() {
	        byte[] keyBytes = Decoders.BASE64.decode("Keyss232xgxfgsxfgd34345fgdfxfgdfgdrg6546gdfxrfg34ec123");
	        return Keys.hmacShaKeyFor(keyBytes);
	    }
}
