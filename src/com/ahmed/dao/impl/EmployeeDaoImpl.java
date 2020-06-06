package com.ahmed.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Employee;



import com.ahmed.daoo.EmployeeDao;
import com.ahmed.util.DBConnection;

import java.sql.PreparedStatement;




public class EmployeeDaoImpl implements EmployeeDao {

	
	public  int save(Employee e) throws Exception {
		int status = 0;
		String sql = "insert into employeetable(name,password,email,gender,country) values(?,?,?,?,?)";
		try (Connection conn = DBConnection.getConnection();
			PreparedStatement ps =  conn.prepareStatement(sql);){

			ps.setString(1, e.getName());
			ps.setString(2, e.getPassword());
			ps.setString(3, e.getEmail());
			ps.setString(4, e.getGender());
			ps.setString(5, e.getCountry());
			status = ps.executeUpdate();
		}catch(Exception ee) {
			ee.printStackTrace();
			throw ee;
		}
		return status;
	}
	
	
	public  int update(Employee e) throws Exception {
		int status = 0;
		String sql = "update employeetable set name=?, password=?, email=?, gender=?, country=? where id=?";
		try(Connection conn = DBConnection.getConnection();
			PreparedStatement ps =  conn.prepareStatement(sql);) {
			
			ps.setString(1, e.getName());
			ps.setString(2, e.getPassword());
			ps.setString(3, e.getEmail());
			ps.setString(4, e.getGender());
			ps.setString(5, e.getCountry());
			ps.setInt(6, e.getId());
			status = ps.executeUpdate();
		}catch(Exception ee) {
			ee.printStackTrace();
			throw ee;
		}
		return status;
	}
	
	public  int delete(Employee e) throws Exception {
		int status = 0;
		String sql = "delete from employeetable where id=?";
		try(Connection conn = DBConnection.getConnection();
			PreparedStatement ps =  conn.prepareStatement(sql);) {
		
			ps.setInt(1,e.getId());
			status = ps.executeUpdate();
		}catch(Exception ee) {
			ee.printStackTrace();
			throw ee;
		}
		return status;
	}
	
	
	
	public  List<Employee> getAllRecords() throws Exception{
		List<Employee> list = new ArrayList<>();
		String sql = "select * from employeetable";
		try(Connection conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();) {
			
			while(rs.next()) {
				Employee e = new Employee();
				e.setId(rs.getInt("id"));
				e.setName(rs.getString("name"));
				e.setPassword(rs.getString("password"));
				e.setEmail(rs.getString("email"));
				e.setGender(rs.getString("gender"));
				e.setCountry(rs.getString("country"));
				list.add(e);
			}
		}catch(Exception ee) {
			ee.printStackTrace();
			throw ee;
		}
		return list;
	}
	
	public  Employee getRecordsById(int id) throws Exception{
		Employee e = null;
		String sql = "select * from employeetable where id=?";
		try(Connection conn = DBConnection.getConnection();
			PreparedStatement ps =  conn.prepareStatement(sql);){
			
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				e = new Employee();
				e.setId(rs.getInt("id"));
				e.setName(rs.getString("name"));
				e.setPassword(rs.getString("password"));
				e.setEmail(rs.getString("email"));
				e.setGender(rs.getString("gender"));
				e.setCountry(rs.getString("country"));
			}
		} catch(Exception ee) {
			ee.printStackTrace();
			throw ee;
		}
		return e;
}
}