package org.istv.spring.AirBnB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import model.BienImmobilier;
import service.BienService;

@Service
public class InMemoryBienService implements BienService{

	static Map<Long, BienImmobilier> BienDB = new HashMap<>();

	@Override
	public List<BienImmobilier> findAll() {
		return new ArrayList<>(BienDB.values());
	}

	@Override
	public void saveAll(List<BienImmobilier> biens) {
		long nextId = getNextId();
		for(BienImmobilier bien : biens) {
			if(bien.getId() == 0) {
				bien.setId(nextId++);
			}
		}
		
		Map<Long, BienImmobilier> bienMap = biens.stream()
				.collect(Collectors.toMap(BienImmobilier::getId, Function.identity()));
		
		BienDB.putAll(bienMap);
		
	}
	
	private Long getNextId() {
		return BienDB.keySet()
				.stream()
				.mapToLong(value -> value)
				.max()
				.orElse(0) + 1;
	}

	
	
	
}
