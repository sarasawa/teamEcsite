package com.internousdev.texas.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.texas.dto.MCategoryDTO;
import com.internousdev.texas.util.DBConnector;

public class MCategoryDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();

	public ArrayList<MCategoryDTO> getMCategoryInfo(){
		ArrayList<MCategoryDTO> mCategoryDTOList = new ArrayList<MCategoryDTO>();

		String sql = "SELECT * FROM m_category ";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()){
				MCategoryDTO dto = new MCategoryDTO();

				dto.setId(resultSet.getInt("id"));
				dto.setCategoryId(resultSet.getInt("category_id"));
				dto.setCategoryName(resultSet.getString("category_name"));
				dto.setCategoryDescription(resultSet.getString("category_description"));
				mCategoryDTOList.add(dto);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{

				connection.close();

			}catch(SQLException e){

				e.printStackTrace();
			}
		}
		return mCategoryDTOList;

	}

}
