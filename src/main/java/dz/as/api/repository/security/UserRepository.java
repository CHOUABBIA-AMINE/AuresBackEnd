/**
 *	
 *	@author		: CHOUABBIA Amine
 *
 *	@Name		: UserRepository
 *	@CreatedOn	: 08-31-2024
 *
 *	@Type		: Interface
 *	@Layaer		: Repository
 *	@Goal		: Security
 *
 **/

package dz.as.api.repository.security;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import dz.as.api.model.security.User;

@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);
    
    @RestResource(rel ="inList", path = "inList")
    Page<User> findByUsernameContaining(@Param("filter") String filter_01, Pageable page);
    
}