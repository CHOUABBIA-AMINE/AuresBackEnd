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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Token {
    private String value;
    private String type;
}