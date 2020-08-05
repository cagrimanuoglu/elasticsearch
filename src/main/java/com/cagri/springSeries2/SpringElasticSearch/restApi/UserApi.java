package com.cagri.springSeries2.SpringElasticSearch.restApi;

import java.util.Calendar;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cagri.springSeries2.SpringElasticSearch.DataAccess.UserRepository;
import com.cagri.springSeries2.SpringElasticSearch.Entity.User;

@RestController
@RequestMapping("/user")
public class UserApi {

	private UserRepository userRepo;
	
	public UserApi()
	{
		
	}
	
	@Autowired
	public UserApi(UserRepository userRepo) {
	
		this.userRepo = userRepo;
	}
	
	
	@PostConstruct
	public void init()
	{
		User user = new User();
		
		user.setId("k0001");
		user.setName("cagri");
		user.setSurname("manuoglu");
		user.setAddress("yıkıklar bahcesi");
		// user.setBirthdate(Calendar.getInstance().getTime());
		
		userRepo.save(user);
	}
	
	
	
	@GetMapping("/{search}")
	public ResponseEntity<List<User>> getUser(@PathVariable String search)
	{
		List<User> users = userRepo.getByCustomQuery(search);
		return ResponseEntity.ok(users);
	}
	
	
	
	
	
	
	
	
}
