package ru.vladigeras.springfeignclient.configuration;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration for {@link ru.vladigeras.springfeignclient.client.ReqresInClient} client.
 * In this configuration you can override the default properties of feign client such as Logger, Encoder, Decoder,
 * Interceptors, Error handlers, inner Http Client. You should set link to this configuration in client interface
 * definition in {@link ru.vladigeras.springfeignclient.client.ReqresInClient}.
 *
 * @author vladi_geras on 11.01.2020
 */
@Configuration
public class ReqresInClientConfig {

	@Bean
	Logger.Level loggerLevel() {
		return Logger.Level.BASIC;
	}
}
