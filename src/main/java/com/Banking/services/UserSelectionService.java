package com.Banking.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;


import com.Banking.modal.UserSelection;
import com.Banking.repository.UserSelectionRepository;
@Service
@Transactional
public class UserSelectionService {
	
	private final UserSelectionRepository Selected;
	
	public UserSelectionService(UserSelectionRepository Selected) {
		this.Selected=Selected;
	}
	
	public void saveMySelection(UserSelection UserSelection ) {
		Selected.save(UserSelection);
	}
	
	public void deleteMySelection(int id) {
		Selected.deleteById(id);
	}
	
	
	public Optional<UserSelection> editUser(int id) { 
		return Selected.findById(id);//userRepository.findOne(id); 
	}
	

	
	
	
	}
