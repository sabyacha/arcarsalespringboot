package com.Banking.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.Banking.modal.RetrieveImage;
import com.Banking.repository.ImageRepository;
@Service
@Transactional
public class ImageRetrieveService {
	
	private final ImageRepository ImageRepository;
	
	public ImageRetrieveService(ImageRepository ImageRepository) {
		this.ImageRepository=ImageRepository;
	}
	

	public void saveMyUser(RetrieveImage RetrieveImage ) {
		ImageRepository.save(RetrieveImage);
	}
	
	
	public Optional<RetrieveImage> editUser(int id) { 
		return ImageRepository.findById(id);//userRepository.findOne(id); 
	}
	

	
	
	
	}
