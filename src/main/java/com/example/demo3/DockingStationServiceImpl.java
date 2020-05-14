package com.example.demo3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("dockingStationService")
public class DockingStationServiceImpl implements DockingStationService {

	private final DockingStationRepository dockingStationRepository;
	
	@Autowired
	public DockingStationServiceImpl(DockingStationRepository dockingStationRepository) {
		this.dockingStationRepository = dockingStationRepository;
	}
	
	@Override
	public DockingStation save(DockingStation dockingStation) {
		return dockingStationRepository.save(dockingStation);
	}

	@Override
	public List<DockingStation> getAll() {
		return dockingStationRepository.findAll();
	}

	@Override
	public DockingStation getOne(long id) {
		return dockingStationRepository.findById(id).get();
	}

}
