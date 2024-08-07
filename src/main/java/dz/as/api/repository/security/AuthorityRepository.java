/**
 *	
 *	@author		: CHOUABBIA Amine
 *
 *	@Name		: AuthorityRepository
 *	@CreatedOn	: 08-31-2024
 *
 *	@Type		: Interface
 *	@Layaer		: Repository
 *	@Goal		: Security
 *
 **/

package dz.as.api.repository.security;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import dz.as.api.model.security.Authority;

@RepositoryRestResource(collectionResourceRel = "authority", path = "authority")
public interface AuthorityRepository extends JpaRepository<Authority, Long> {

    
}