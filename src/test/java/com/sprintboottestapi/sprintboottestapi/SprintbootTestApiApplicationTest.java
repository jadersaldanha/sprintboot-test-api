package com.sprintboottestapi.sprintboottestapi;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sprintboottestapi.sprintboottestapi.models.Product;
import com.sprintboottestapi.sprintboottestapi.repositories.ProductRepository;


@RunWith(SpringRunner.class)
@DataMongoTest
public class SprintbootTestApiApplicationTest {

	@Autowired
	private ProductRepository productRepository;

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Before
	public void clearBeforeInit() {
		clearDb();
	}
	
	@After
	public void clearAfterInit() {
		clearDb();
	}

	@Test
	public void createShouldPersistData() {
		Product product = new Product("Alderaan", "te", 1.2, "mountains");
		product = this.productRepository.save(product);

		assertThat(product.getId()).isNotNull();
		assertThat(product.getProdName()).isEqualTo("Alderaan");
		assertThat(product.getProdDesc()).isEqualTo("te");
		assertThat(product.getProdPrice()).isEqualTo(1.2);
		assertThat(product.getProdImage()).isEqualTo("mountains");
	}

	@Test
	public void deleteShouldRemoveData() {
		Product product = new Product("Alderaan", "te", 1.2, "mountains");
		product = this.productRepository.save(product);

		productRepository.delete(product);

		assertThat(productRepository.findOne(product.getId())).isNull();
	}

	
	private void clearDb() {
		this.productRepository.deleteAll();
	}
}

