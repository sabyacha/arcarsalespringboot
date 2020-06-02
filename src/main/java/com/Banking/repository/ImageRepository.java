package com.Banking.repository;

import org.springframework.data.repository.CrudRepository;

import com.Banking.modal.RetrieveImage;

public interface ImageRepository extends CrudRepository<RetrieveImage, Integer> {	
	
	
}
