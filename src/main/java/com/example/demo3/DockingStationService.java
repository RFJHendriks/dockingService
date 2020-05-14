package com.example.demo3;

import java.util.List;

public interface DockingStationService {

	DockingStation save(DockingStation dockingStation);

	List<DockingStation> getAll();

	DockingStation getOne(long id);
}
