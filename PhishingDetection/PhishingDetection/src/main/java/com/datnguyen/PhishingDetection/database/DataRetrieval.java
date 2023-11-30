package com.datnguyen.PhishingDetection.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataRetrieval {
    public List<URLEntity> getData() {
        List<URLEntity> dataList = new ArrayList<>();

        try (Connection connection = DatabaseConnect.connect()) {
            String sql = "SELECT * FROM dataset";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        URLEntity entity = new URLEntity(resultSet);
                        dataList.add(entity);
                    }
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dataList;
    }
}
