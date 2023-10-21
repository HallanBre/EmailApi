package com.br.email.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.email.models.EmailModel;

public interface EmailRepository  extends JpaRepository<EmailModel, Long>{
    
}
