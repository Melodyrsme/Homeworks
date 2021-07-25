package dao.impl;

import dao.BaseDao;
import dao.NewsDao;
import model.News;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class NewsDaoImpl extends BaseDao implements NewsDao {
    List<News> newsList = new ArrayList<>();

    @Override
    public List<News> getAll() {
        List<News> newsList = new ArrayList<>();
        Connection connection = null;
        ResultSet resultSet = null;
        Statement statement = null;
        try {
            connection = connect();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM student_group");
            while (resultSet.next())
                newsList.add(new News(
                        resultSet.getInt("id"),
                        resultSet.getString("title_news"),
                        resultSet.getString("text_news"),
                        resultSet.getDate("publication_time")));

            if (newsList.size() > 0)
                return newsList;
            else
                return null;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public boolean createNewNews(News news) {
        return false;
    }

    @Override
    public boolean deleteNews(int id) {
        return false;
    }

    @Override
    public boolean updateNews(int id, News news) {
        return false;
    }
}