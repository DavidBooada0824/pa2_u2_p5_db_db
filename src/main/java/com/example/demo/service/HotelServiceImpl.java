package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IHotelRepo;
import com.example.demo.repo.modelo.Hotel;

@Service
public class HotelServiceImpl implements IHotelService {
	
	@Autowired
	private IHotelRepo iHotelRepo;
	@Override
	public void ingresar(Hotel hotel) {
		this.iHotelRepo.crear(hotel);
		
	}

	@Override
	public Hotel selecionar(Integer id) {
		// TODO Auto-generated method stub
		return this.iHotelRepo.buscar(id);
	}

	@Override
	public void actualizar(Hotel hotel) {
		this.iHotelRepo.modificar(hotel);
		
	}

	@Override
	public void borrar(Integer id) {
		this.iHotelRepo.elimiar(id);
		
	}

}
