package telran.parking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.cloud.stream.binder.test.*;
import org.springframework.context.annotation.Import;

import telran.parking.servise.PangoProviderClientService;

@SpringBootTest
@Import(TestChannelBinderConfiguration.class)
class PaymentAnalyzerControllerTest {
	@MockBean
	PangoProviderClientService clientService;
	@Autowired
	InputDestination producer;
	@Autowired
	OutputDestination consumer;
	@Test
	void loadApplicationContext() {
		assertNotNull(clientService);
	}
	

}
