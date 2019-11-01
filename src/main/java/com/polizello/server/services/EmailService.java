package com.polizello.server.services;

import org.springframework.mail.SimpleMailMessage;

import com.polizello.server.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
