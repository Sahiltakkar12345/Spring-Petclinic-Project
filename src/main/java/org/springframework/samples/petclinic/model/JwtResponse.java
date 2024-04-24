package org.springframework.samples.petclinic.model;


import lombok.*;
import lombok.Builder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JwtResponse {
    private String username;
    private String jwtToken;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getJwtToken() {
		return jwtToken;
	}
	public String setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
		return jwtToken;
	}
	public JwtResponse(String username, String jwtToken) {
		super();
		this.username = username;
		this.jwtToken = jwtToken;
	}
	public JwtResponse() {
		super();
	}
	 public static JwtResponse builder() {
	        return new JwtResponse();
	    }

	  public JwtResponse jwtToken(String jwtToken) {
          this.jwtToken = jwtToken;
          return this;
      }

      public JwtResponse username(String username) {
          this.username = username;
          return this;
      }

      public JwtResponse build() {
          return new JwtResponse(username, jwtToken);
      }
    
}