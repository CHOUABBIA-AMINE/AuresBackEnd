/**
 *	
 *	@author		: CHOUABBIA Amine
 *
 *	@Name		: RoleRepository
 *	@CreatedOn	: 08-31-2024
 *
 *	@Type		: Interface
 *	@Layaer		: Repository
 *	@Goal		: Security
 *
 **/

package dz.as.api.repository.security;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import dz.as.api.model.security.Role;

@RepositoryRestResource(collectionResourceRel = "role", path = "role")
public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
    
    @RestResource(rel ="inList", path = "inList")
    Page<Role> findByNameContaining(@Param("filter") String filter_01, Pageable page);
    
}