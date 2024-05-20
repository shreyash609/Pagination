package in.ashokit.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Employee;
import in.ashokit.repo.EmpRepo;

@Service
public class EmpService {

	private EmpRepo empRepo;

	public EmpService(EmpRepo empRepo) {
		this.empRepo=empRepo;
	}	

   //pageNo will start from 0
	public List<Employee> getEmpWithPagination(Integer pagesize,Integer pageNo){
		
		PageRequest of = PageRequest.of(pageNo-1, pagesize);
		
		Page<Employee> findAll = empRepo.findAll(of);
		
		return findAll.getContent();
	}
}
