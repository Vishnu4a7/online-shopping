package net.vis.shoppingbackend.dao;

import java.util.List;

import net.vis.shoppingbackend.dto.Category;

public interface CategoryDao {

	List<Category> list();

	Category getId(int id);

}
