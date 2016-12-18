/*
 * Copyright Telrock Communications Limited 2008 * 
 *
 * $Header:  $
 * $Revision:  $
 * $Date:  $ 
 * 
 */
package org.mattd.service;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import com.telrock.tsys_accounts.soap.SendMessageText;

@Component
public class SendTextMessageConvertor implements Processor
{

	@Override
	public void process(Exchange exchange) throws Exception
	{
		SendMessageText messageText = (SendMessageText) exchange.getIn().getBody();

		Message message = new Message();
		message.setBody(messageText.getMessageText());
		message.setRecipient(messageText.getSenderId());
		exchange.getIn().setBody(message);
	}

}
