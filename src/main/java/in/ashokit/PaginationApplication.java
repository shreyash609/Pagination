package in.ashokit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Employee;
import in.ashokit.service.EmpService;

@SpringBootApplication
public class PaginationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(PaginationApplication.class, args);
		
		EmpService bean = ctxt.getBean(EmpService.class);
		
		List<Employee> empWithPagination = bean.getEmpWithPagination(5, 2);
		
		empWithPagination.forEach(e->System.out.println(e));
	}

}
