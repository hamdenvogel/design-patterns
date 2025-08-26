package br.com.cod3r.chain.process;

import br.com.cod3r.chain.process.service.GenericService;
import br.com.cod3r.chain.process.service.ProcessContext;
import br.com.cod3r.chain.process.service.ServicesCatalog;

public class Client {

	public static void main(String[] args) {
		ProcessContext ctx = new ProcessContext();
		ctx.put("email", "anotherUser@email.com");
		ctx.put("password", "1234");
		Object response = GenericService.run(ServicesCatalog.saveUserProcess, ctx);
		System.out.println(response);
		
		ctx.reset();
		ctx.put("email", "anotherUser@email.com");
		ctx.put("password", "1234");
		ctx.put("name", "Another User");
		response = GenericService.run(ServicesCatalog.saveUserProcess, ctx);
		System.out.println(response);
		
		ctx.reset();
		ctx.put("email", "User3@email.com");
		//ctx.put("password", "123456");
		ctx.put("name", "Another User3");
		response = GenericService.run(ServicesCatalog.saveUserProcess, ctx);
		System.out.println(response);
	}
}
