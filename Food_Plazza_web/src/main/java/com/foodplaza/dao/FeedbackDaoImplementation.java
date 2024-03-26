package com.foodplaza.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.foodplaza.pojo.Feedback;
import com.foodplaza.utility.Db_utility;

public class FeedbackDaoImplementation implements FeedbackDao {

	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String sql;
	int row;
	
	@Override
	public boolean addfeedback(Feedback feedback) {
		try {
			con=Db_utility.getConnect();
			sql="insert into feedback (name,email,ranks,review,suggestion) values(?,?,?,?,?)";
			ps=con.prepareStatement(sql);
			ps.setString(1,feedback.getName());
			ps.setString(2, feedback.getEmailid());
			ps.setInt(3, feedback.getRank());
			ps.setString(4, feedback.getReview());
			ps.setString(5, feedback.getSuggestion());
			
			row=ps.executeUpdate();
			if (row>0) {
				return true;
			}else {
				return false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Feedback> getAllFeedback() {
		List<Feedback> li=new ArrayList<Feedback>();
		try {
			con=Db_utility.getConnect();
			sql="select * from feedback";
			ps=con.prepareStatement(sql);
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				Feedback feedback=new Feedback();
				feedback.setName(rs.getString("name"));
				feedback.setEmailid(rs.getString("email"));
				feedback.setRank(rs.getInt("ranks"));
				feedback.setReview(rs.getString("review"));
				feedback.setSuggestion(rs.getString("suggestion"));
				li.add(feedback);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return li;
	}

}
