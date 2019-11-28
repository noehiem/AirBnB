package org.istv.spring.AirBnB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import model.Locataire;
import service.LocataireService;

@Service
public class InMemoryLocataireService implements LocataireService{
	
	static Map<Long, Locataire> locataireDB = new HashMap<>();

	@Override
	public List<Locataire> findAll() {
		return new ArrayList<>(locataireDB.values());
	}

	@Override
	public void saveAll(List<Locataire> locataires) {
		long nextId = getNextId();
        for (Locataire locataire : locataires) {
            if (locataire.getId() == 0) {
            	locataire.setId(nextId++);
            }
        }

        Map<Long, Locataire> locataireMap = locataires.stream()
            .collect(Collectors.toMap(Locataire::getId, Function.identity()));

        locataireDB.putAll(locataireMap);
		
	}
	
	private Long getNextId() {
        return locataireDB.keySet()
            .stream()
            .mapToLong(value -> value)
            .max()
            .orElse(0) + 1;
    }

}
