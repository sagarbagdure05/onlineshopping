package com.milan.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.milan.shoppingbackend.dao.CategoryDAO;
import com.milan.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {
		Category category = new Category();
		// adding first category
		category.setId(1);
		category.setName("Telivision");
		category.setDescription("some description");
		category.setImageURL("");

		categories.add(category);

		// second category

		category = new Category();

		category.setId(2);
		category.setName("Mobile");
		category.setDescription("some description");
		category.setImageURL("");

		categories.add(category);

		category = new Category();

		category.setId(3);
		category.setName("Laptop");
		category.setDescription("some description");
		category.setImageURL("");

		categories.add(category);
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		// enhanced for loop
		for (Category category : categories) {

			if (category.getId() == id)
				return category;
		}
		return null;
	}

}
