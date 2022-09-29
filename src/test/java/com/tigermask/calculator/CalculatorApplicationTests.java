package com.tigermask.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CalculatorApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
    void testSum() {
		var calculator = new Calculator();
		assertThat(calculator.sum(2, 3)).isEqualByComparingTo(5);
        
    }

}
