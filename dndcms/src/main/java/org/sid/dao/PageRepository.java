package org.sid.dao;

import java.util.Collection;

import org.sid.entities.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import antlr.collections.List;
@RepositoryRestResource
@CrossOrigin("http://localhost:4200")
public interface PageRepository extends JpaRepository<Page, Long>{
	
	public Collection<Page> findByName(String name);

}
