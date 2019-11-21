package model;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Loueur {
	
	@Autowired
	List<BienImmobilier> biens;

}
