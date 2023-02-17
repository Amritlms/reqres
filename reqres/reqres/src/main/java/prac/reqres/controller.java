package prac.reqres;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

public class controller {

	@RestController
	public class assessmentcontroller {
		@PostMapping("/user")
		private pojo getUser(@RequestBody requestbody req) 
		{
			String[] anArray = new String[10];
			{
			}
		
		RestTemplate restTemplate = new RestTemplate();
		pojo pojo=new pojo();
		try {
			responsebody user = restTemplate.getForObject(anArray, req,responsebody.class);
			pojo.setStatus("SUCESSFULLY RUN");
			pojo.setResponse(user);
		}
		catch(Exception e){
			pojo.setStatus("INVALID USER ID PASSWORD");
			
		}
		return pojo;
		}
		}
}

