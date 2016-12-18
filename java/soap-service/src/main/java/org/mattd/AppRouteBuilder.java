/*
 * Copyright Telrock Communications Limited 2008 * 
 *
 * $Header:  $
 * $Revision:  $
 * $Date:  $ 
 * 
 */
package org.mattd;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.SoapJaxbDataFormat;
import org.apache.camel.model.rest.RestBindingMode;
import org.mattd.service.Message;
import org.mattd.service.SendTextMessageConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.telrock.tsys_accounts.soap.SendMessageText;

@Component
public class AppRouteBuilder extends RouteBuilder
{
	private static final String MEDIA_JSON = "application/json";
	private static final String NEDIA_XML = "application/xml";
	private static final String URI_TOKEN = "/pubTokenNotification";
	private static final String URI_ALERT = "/pubAlertNotification";
	private static final String URI_FRAUD = "/pubFraudNotification";

	@Value("${rest.host}")
	private String host;

	@Value("${rest.port}")
	private int port;

	@Autowired
	private SendTextMessageConvertor sendMessageTextConvertor;

	// --------------------------------------------------------------------------------------------------

	@Override
	public void configure() throws Exception
	{
		restConfiguration().component("jetty").host(host).port(port).contextPath("/service");

		serviceRoutes();

		utilityRoutes();
	}

	// --------------------------------------------------------------------------------------------------

	private void serviceRoutes()
	{
		SoapJaxbDataFormat jaxb = new SoapJaxbDataFormat(SendMessageText.class.getPackage().getName());

		rest(URI_FRAUD).post().consumes(NEDIA_XML).route().id("pubFraudNotification").unmarshal(jaxb)
				.log("Received: ${body}").process(sendMessageTextConvertor);

		rest(URI_ALERT).post().consumes(NEDIA_XML).route().id("pubAlertNotification").unmarshal(jaxb)
				.log("Received: ${body}").process(sendMessageTextConvertor);

		rest(URI_TOKEN).post().consumes(NEDIA_XML).route().id("pubTokenNotification").unmarshal(jaxb)
				.log("Received: ${body}").process(sendMessageTextConvertor);
	}

	// --------------------------------------------------------------------------------------------------

	private void utilityRoutes()
	{
		rest("/Status").bindingMode(RestBindingMode.json).post().type(Message.class).consumes(MEDIA_JSON).route()
				.id("Status").log("Received: ${body}");

		rest("/Metrics").bindingMode(RestBindingMode.json).post().type(Message.class).consumes(MEDIA_JSON).route()
				.id("Metrics").log("Received: ${body}");
	}

}
