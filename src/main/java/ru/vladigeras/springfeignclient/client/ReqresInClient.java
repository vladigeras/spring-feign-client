package ru.vladigeras.springfeignclient.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import ru.vladigeras.springfeignclient.configuration.ReqresInClientConfig;
import ru.vladigeras.springfeignclient.model.*;

import java.util.List;

/**
 * @author vladi_geras on 11.01.2020
 */
@FeignClient(value = "reqresIn", url = "${reqresInApi.url}", configuration = ReqresInClientConfig.class)
public interface ReqresInClient {
	@GetMapping("/users")
	PageResponse<List<User>> getUsers(@RequestParam(name = "page") int page);

	@GetMapping("/users/{id}")
	DataResponse<User> getUser(@PathVariable(name = "id") Long id);

	@PostMapping("/users")
	CreateUserResponse createUser(@RequestBody CreateUser user);
}
