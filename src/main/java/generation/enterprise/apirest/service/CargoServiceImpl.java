package generation.enterprise.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import generation.enterprise.apirest.model.Cargo;
import generation.enterprise.apirest.repository.CargoRepository;

@Service
public class CargoServiceImpl implements CargoService {

	@Autowired
	CargoRepository cargoRepository;

	@Override
	public List<Cargo> findAll() {
		return cargoRepository.findAll();
	}

}
