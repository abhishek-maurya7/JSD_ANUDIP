package anudip.serviceImpl;

import anudip.Helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import anudip.entity.Customer;
import anudip.service.CustomerService;
import anudip.Helper;

public class CustomerServiceImpl implements CustomerService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean addCustomer(Customer cust) {
		boolean res = false;
		try {
			Connection conn = Helper.createConnection();
			String s = "insert into Customer(cid, cname,cphone,caddr) " + "values(?,?,?,?)";
			PreparedStatement stmt = conn.prepareStatement(s);
			stmt.setInt(1, cust.getCid());
			stmt.setString(2, cust.getCname());
			stmt.setLong(3, cust.getCphone());
			stmt.setString(4, cust.getCaddr());
			stmt.execute();
			res = true;
		}catch(Exception e) {
			System.out.println(e);
		}
		return res;
	}

	@Override
	public boolean editCustomer(int id, long cphone) {
		boolean res = false;
		try {
			Connection conn = Helper.createConnection();
			String s1 = "update customer set cphone = ? where cid = ?";
			PreparedStatement stmt = conn.prepareStatement(s1);
			stmt.setLong(1, cphone);
			stmt.setInt(2, id);
			stmt.executeUpdate();
			res = true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return res;
	}

	@Override
	public boolean removeCustomer(int cid) {
		boolean res = false;
		try {
			Connection conn = Helper.createConnection(); 
			String s2 = "delete from customer where cid = ?";
			PreparedStatement stmt = conn.prepareStatement(s2);
			stmt.setInt(1, cid);
			stmt.execute();
			res = true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return res;
	}

	@Override
	public void showCustomers() {
		try {
			Connection conn = Helper.createConnection();
			Statement stmt = conn.createStatement();
			String s3 = "select * from customer";
			ResultSet rs = stmt.executeQuery(s3);
			while(rs.next()) {
				int cid = rs.getInt(1);
				String cname = rs.getString(2);
				long cphone = rs.getLong(3);
				String caddr = rs.getString(4);
				
				System.out.println(cid + " " + cname + " " + cphone + " " + caddr);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
