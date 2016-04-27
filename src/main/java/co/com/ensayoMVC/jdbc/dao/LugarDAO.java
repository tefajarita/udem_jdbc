package co.com.ensayoMVC.jdbc.dao;

import java.util.ArrayList;

import co.com.ensayoMVC.jdbc.entity.Lugar;

public interface LugarDAO {

	/*
	 * Obteniene un lugar dado el id
	 * @Params
	 * */
	
	public Lugar findLugarById(int lugarId);
	public ArrayList<Lugar> findLugarByIdList();
	public void insert(Lugar lugar);
	
}
