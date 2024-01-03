package com.example.demo.service;

import com.example.demo.repo.modelo.Hotel;

public interface IHotelService {
	
	public void ingresar(Hotel hotel);
	public Hotel selecionar(Integer id);
	public void actualizar(Hotel hotel);
	public void borrar(Integer id);


}
