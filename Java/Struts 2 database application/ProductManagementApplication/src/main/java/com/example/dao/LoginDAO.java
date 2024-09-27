package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.example.dbutil.DBUtil;
import com.example.pojo.LoginInfo;

public class LoginDAO {

    public static boolean isUserValid(LoginInfo userDetails)
    {
        boolean validStatus = false;

        String query = "SELECT * FROM login_info WHERE user_name = ? AND password = ?";
        try (Connection conn = DBUtil.getConnction();
            PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setString(1, userDetails.getUserName());
            ps.setString(2, userDetails.getPassword());

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    validStatus = true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            return validStatus;
        }
    }
}
