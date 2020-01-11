package ru.vladigeras.springfeignclient.client;

import feign.FeignException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.vladigeras.springfeignclient.model.*;

import java.util.List;

/**
 * @author vladi_geras on 11.01.2020
 */
@SpringBootTest
public class ReqresInClientTest {

	@Autowired
	private ReqresInClient reqresInClient;

	@Test
	public void getUsers() {
		PageResponse<List<User>> users = reqresInClient.getUsers(1);
		Assertions.assertNotNull(users);
		Assertions.assertNotNull(users.getData());
	}

	@Test
	public void getUser() {
		DataResponse<User> user = reqresInClient.getUser(2L);
		Assertions.assertNotNull(user);
		Assertions.assertNotNull(user.getData());
	}

	@Test
	public void getNotExistingUser() {
		Assertions.assertThrows(FeignException.NotFound.class, () -> {
			DataResponse<User> user = reqresInClient.getUser(23L);
			Assertions.assertNotNull(user);
		});
	}

	@Test
	public void createUser() {
		String name = "Vladislav";
		String job = "Java Developer";
		CreateUserResponse user = reqresInClient.createUser(new CreateUser(name, job));
		Assertions.assertEquals(name, user.getName());
		Assertions.assertEquals(job, user.getJob());
	}
}
