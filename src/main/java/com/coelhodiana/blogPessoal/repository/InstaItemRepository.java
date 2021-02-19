package com.coelhodiana.blogPessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coelhodiana.blogPessoal.model.InstaItem;

@Repository
public interface InstaItemRepository extends JpaRepository<InstaItem, Long> {

	public List<InstaItem> findAllByImageContainingIgnoreCase(String image);
	
}
