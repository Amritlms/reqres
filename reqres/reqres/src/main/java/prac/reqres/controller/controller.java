package prac.reqres.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import prac.reqres.request.Requestbody1;
import prac.reqres.request.requestbody;
import prac.reqres.response.responsebody;

@RestController
public class controller {
	
	@GetMapping("/emp")
	public requestbody find(requestbody requestbody) {
		return requestbody;
	}
	@PostMapping("/emp")
		public responsebody retrieve (@RequestBody Requestbody1 req) {
		responsebody res=new responsebody();
			res.setEmail_id(req.getEmpdata().getEmail_id());
			res.setPhonenum(req.getEmpdata().getPhonenum());
			return res;
		}
}