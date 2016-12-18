/*
 * Copyright Telrock Communications Limited 2008 * 
 *
 * $Header:  $
 * $Revision:  $
 * $Date:  $ 
 * 
 */
package org.mattd;

import org.apache.camel.CamelContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig
{

	@Autowired
	private CamelContext camelContext;

	// --------------------------------------------------------------------------------------------------

}
