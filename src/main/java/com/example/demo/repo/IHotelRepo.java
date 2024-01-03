package com.example.demo.repo;

import com.example.demo.repo.modelo.Hotel;

public interface IHotelRepo {
	
	public void crear(Hotel hotel);
	public Hotel buscar(Integer id);
	public void modificar(Hotel hotel);
	public void elimiar(Integer id);

}
