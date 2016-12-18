/*
 * Copyright Telrock Communications Limited 2008 * 
 *
 * $Header:  $
 * $Revision:  $
 * $Date:  $ 
 * 
 */
package org.mattd;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class Application
{
	private static final Logger LOG = LoggerFactory.getLogger(Application.class);

	// --------------------------------------------------------------------------------------------------

	public static void main(String[] args)
	{
		LOG.info("Booting MattApp with args: {}", Arrays.toString(args));
		SpringApplication.run(Application.class, args);
	}
}
