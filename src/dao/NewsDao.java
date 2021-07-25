package dao;

import model.News;

import java.util.List;

public interface NewsDao {
    List<News> getAll();

    boolean createNewNews(News news);

    boolean deleteNews(int id);

    boolean updateNews(int id, News news);
}
