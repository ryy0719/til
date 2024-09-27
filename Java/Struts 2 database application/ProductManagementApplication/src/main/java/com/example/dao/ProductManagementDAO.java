package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.example.dbutil.DBUtil;
import com.example.pojo.Product;

public class ProductManagementDAO {

    public static List<Product> getAllProducts(String name, String category, String createdDate)
    {
        List<Product> productList = new ArrayList<Product>();
        StringBuilder query = new StringBuilder("SELECT * FROM product");
        List<String> conditions = new ArrayList<>();

        // search func
        if (name != null && !name.isEmpty()) {
            conditions.add("name LIKE ?");
        }
        if (category != null && !category.isEmpty()) {
	          conditions.add("category LIKE ?");
	      }
  	    if (createdDate != null && !createdDate.isEmpty()) {
  	        conditions.add("created_date LIKE ?");
  	    }
  	    if (!conditions.isEmpty()) {
  	        query.append(" WHERE ");
  	        query.append(String.join(" AND ", conditions));
  	    }

        try (Connection conn = DBUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement(query.toString()) {

            // パラメータの設定
            int paramIndex = 1;
            if (name != null && !name.isEmpty()) {
                ps.setString(paramIndex++, "%", + name + "%");
            }
  	        if (category != null && !category.isEmpty()) {
  	            ps.setString(paramIndex++, "%" + category + "%");
  	        }
  	        if (createdDate != null && !createdDate.isEmpty()) {
  	            ps.setString(paramIndex++, "%" + createdDate + "%");
  	        }

            ResultSet rs = ps.executeQuery();
            while (rs.next())
            {
                Product product = new Product(
                    rs.getString("id"),
                    rs.getString("name"),
                    rs.getString("category"),
                    rs.getInt("price"),
                    rs.getString("created_date"));
                productList.add(product);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return productList;
    }

  	public static Product getProductById(String id)
  	{
    		Product product = null;
    		try (Connection conn = DBUtil.getConnection();
      			PreparedStatement ps = conn.prepareStatement("SELECT * FROM product WHERE id = ?")) {
      
      			ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
      				  product = new Product(
        					rs.getString("id"),
        					rs.getString("name"),
        					rs.getString("category"),
        					rs.getInt("price"),
        					rs.getString("created_date")); 
            }
        } catch(Exception e) {
          e.printStackTrace();
        }
  
    		return product;
  	}

	public static int addProduct(Product product) {
  		int status = 0;
  		try (Connection conn = DBUtil.getConnection();
    			PreparedStatement ps = conn.prepareStatement("INSERT INTO product VALUES(?, ?, ?, ?, ?)")) {
    
    			ps.setString(1, product.getId());
    			ps.setString(2, product.getName());
    			ps.setString(3, product.getCategory());
    			ps.setInt(4, product.getPrice());
    			ps.setString(5, product.getCreatedDate());
    			status = ps.executeUpdate();
  		} catch (Exception e) {
  			  e.printStackTrace();
  		}
  		return status;
	}

	public static int updateProduct(Product product) {
  		int status = 0;
  		try (Connection conn = DBUtil.getConnection();
    			PreparedStatement ps = conn.prepareStatement("UPDATE product SET name=?, category=?, price=? WHERE id=?")) {
    
    			ps.setString(1, product.getName());
    			ps.setString(2, product.getCategory());
    			ps.setInt(3, product.getPrice());
    			ps.setString(4, product.getId());
    			status = ps.executeUpdate();
  		} catch (Exception e) {
  			  e.printStackTrace();
  		}
  		return status;
	}

  	public static int deleteProduct(String id) {
    		int status = 0;
    		try (Connection conn = DBUtil.getConnection();
      			PreparedStatement ps = conn.prepareStatement("DELETE FROM product WHERE id=?")) {
      
      			ps.setString(1, id);
      			status = ps.executeUpdate();
    		} catch (Exception e) {
    			  e.printStackTrace();
    		}
    		return status;
  	}
}
