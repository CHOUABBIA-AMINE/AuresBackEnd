/**
 *	
 *	@author		: CHOUABBIA Amine
 *
 *	@Name		: AuthenticationRequest
 *	@CreatedOn	: 08-31-2024
 *
 *	@Type		: Class
 *	@Layaer		: Configuration
 *	@Goal		: Security
 *
 **/

package dz.as.api.configuration.common.security;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AuthenticationRequest {
    private String username;
    private String password;
}