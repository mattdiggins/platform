/*
 * Copyright Telrock Communications Limited 2008 * 
 *
 * $Header:  $
 * $Revision:  $
 * $Date:  $ 
 * 
 */
package org.mattd.service;

public class Message {
	private String id;

	private String body;

	private String recipient;

	// --------------------------------------------------------------------------------------------------

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TestThing [id=");
		builder.append(id);
		builder.append(", body=");
		builder.append(body);
		builder.append(", recipient=");
		builder.append(recipient);
		builder.append("]");
		return builder.toString();
	}

	// --------------------------------------------------------------------------------------------------

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

}
