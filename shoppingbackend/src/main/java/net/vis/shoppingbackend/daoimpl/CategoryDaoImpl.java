package net.vis.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.vis.shoppingbackend.dao.CategoryDao;
import net.vis.shoppingbackend.dto.Category;

@Repository("categoryDao")
public class CategoryDaoImpl implements CategoryDao {

	private static List<Category> categories = new ArrayList<>();

	static {
		Category category = new Category();
		category.setId(1);
		category.setName("Bikes");
		category.setDesc("Yamaha Bikes");
		category.setImageUrl("CAT_1.png");

		categories.add(category);

		category = new Category();
		category.setId(2);
		category.setName("Cars");
		category.setDesc("BMW");
		category.setImageUrl("CAT_2.png");

		categories.add(category);

		category = new Category();
		category.setId(3);
		category.setName("Flights");
		category.setDesc("Indogo");
		category.setImageUrl("CAT_3.png");

		categories.add(category);
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category getId(int id) {
		// enhance for loop
		for (Category category : categories) {
			if (category.getId() == id)
				return category;
		}
		return null;
	}

}
