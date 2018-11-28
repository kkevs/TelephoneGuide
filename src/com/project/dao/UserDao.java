package com.project.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.common.Commons;
import com.project.db.DBConnnection;
import com.project.model.UserGuide;

@Repository
public class UserDao implements Commons<Integer, UserGuide> {

	@Autowired
	private DBConnnection dbConnnection;

	@Override
	public Integer save(UserGuide t2) throws Exception {
		String sql = "INSERT INTO tbl_user(ad, soyad, gsm) " + " VALUES ('" + t2.getAd() + "', '" + t2.getSoyad() + ""
				+ "','" + t2.getGsm() + "')";
		try {
			PreparedStatement ps = dbConnnection.connect().prepareStatement(sql);
			int bb = ps.executeUpdate(sql);
			return bb;

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	@Override
	public UserGuide getUserById(int id) throws Exception {
		String sql = "SELECT ad FROM tbl_user WHERE id =" + id;
		try {
			PreparedStatement ps = dbConnnection.connect().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			UserGuide userGuide = new UserGuide();
			if (rs.next()) {
				userGuide.setId(rs.getInt("id"));
				userGuide.setAd(rs.getString("ad"));
				userGuide.setGsm(rs.getInt("gsm"));
				userGuide.setSoyad(rs.getString("soyad"));
			}
			rs.close();
			ps.close();
			return userGuide;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public List<UserGuide> getAllUser() throws Exception {

		String sql = "select * from tbl_user";

		try {
			PreparedStatement ps = dbConnnection.connect().prepareStatement(sql);
			ResultSet rs = ps.executeQuery(sql);
			ArrayList<UserGuide> list = new ArrayList<UserGuide>();
			UserGuide ug;
			while (rs.next()) {
				ug = new UserGuide();
				ug.setId(rs.getInt("id"));
				ug.setAd(rs.getString("ad"));
				ug.setGsm(rs.getInt("gsm"));
				ug.setSoyad(rs.getString("soyad"));
				list.add(ug);
			}
			rs.close();
			ps.close();
			return list;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
}
