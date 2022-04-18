package org.sid.web;

import java.util.Collection;

import org.sid.dao.PageRepository;

import org.sid.entities.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:4200")
public class PageRestService {
	Page p = new Page() ;
	@Autowired
	private PageRepository pageRepository;

	@RequestMapping(value = "/page", method = RequestMethod.GET)
	public Collection<Page> getContacts() {
		return pageRepository.findAll();

	}
	@DeleteMapping(value = "/page/{pageId}")
	public void deletePage(@PathVariable("pageId") Long pageId) {
		pageRepository.deleteById(pageId) ;
	}
	
	@RequestMapping(value = "/page/{name}", method = RequestMethod.GET)
	public Collection<Page> getPageByName(@PathVariable String name){
		return pageRepository.findByName(name);
	}
	
	
}
