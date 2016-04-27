/**
 * 
 */
package co.com.ensayoMVC.jdbc.dao;

import co.com.ensayoMVC.jdbc.entity.Lugar;

import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;



/**
 * @author TEFAJARITA
 *
 */
public class JDBCLugarDAO implements LugarDAO {

	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource){
		this.dataSource=dataSource;
		
	}
	
	public void insert(Lugar lugar){
		
		String sql ="INSERT INTO lugar (nombre,direccion, dir_lat, dir_lon, telefono, descripcion, horario, correo) VALUES ( ?, ?,?, ?, ?, ?, ?, ?)";
		Connection conn = null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		 try {
			conn=(Connection) dataSource.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1,lugar.getNombre());
			ps.setString(2, lugar.getDireccion());
			ps.setLong(3, lugar.getAlt());
			ps.setLong(4, lugar.getLon());
			ps.setString(5, lugar.getTelefono());
			ps.setString(6, lugar.getDescripcion());
			ps.setString(7, lugar.getHorario());
			ps.setString(8, lugar.getCorreo());
			rs=ps.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			
			if(conn!=null || ps!=null || rs !=null){
			try {
				conn.close();
				ps.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
			
		}
		
	}
	public Lugar findLugarById(int lugarId) {
		String sql="SELECT * FROM lugar WHERE id= ?";
		Connection conn= null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		Lugar lugar = null;
		
		try {
			conn=(Connection) dataSource.getConnection();
			
			ps=conn.prepareStatement(sql);				
			ps.setInt(1, lugarId);
			rs= ps.executeQuery();
			if(rs.next()){
				lugar= new Lugar(rs.getString("nombre"),
								rs.getString("direccion"),
								rs.getLong("dir_lat"),
								rs.getLong("dir_lon"),
								rs.getString("telefono"),
								rs.getString("descripcion"),
								rs.getString("horario"),
								rs.getString("correo"));
				
			}
			
			return lugar;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}finally{
				if(conn!=null || rs!=null || ps!=null){
					try {
						conn.close();
						rs.close();
						ps.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			
		}
		
	}
	
	
	public Lugar editLugar (int lugarId){
/*		String sql="UPDATE lugar"+
				   "SET
`id` = <{id: }>,
`nombre` = <{nombre: }>,
`direccion` = <{direccion: }>,
`dir_lat` = <{dir_lat: }>,
`dir_lon` = <{dir_lon: }>,
`telefono` = <{telefono: }>,
`descripcion` = <{descripcion: }>,
`horario` = <{horario: }>,
`correo` = <{correo: }>
WHERE `id` = <{expr}>;";
*/		return null;
		
	}
	
	
	public ArrayList<Lugar> findLugarByIdList() {
		String sql="SELECT * FROM lugar ";
		ArrayList<Lugar> lugares= new ArrayList<Lugar>();
		Connection conn= null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		Lugar lugar = null;
		
		try {
			conn=(Connection) dataSource.getConnection();
			
			ps=conn.prepareStatement(sql);				
			rs= ps.executeQuery();
			if(rs.next()){
				lugar= new Lugar(rs.getString("nombre"),
								rs.getString("direccion"),
								rs.getLong("dir_lat"),
								rs.getLong("dir_lon"),
								rs.getString("telefono"),
								rs.getString("descripcion"),
								rs.getString("horario"),
								rs.getString("correo"));
				lugares.add(lugar);
				
			}
			
			return lugares;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}finally{
				if(conn!=null || rs!=null || ps!=null){
					try {
						conn.close();
						rs.close();
						ps.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			
		}
		
	}
	
}
