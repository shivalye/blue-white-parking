package telran.parking;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.cloud.stream.binder.test.*;
import org.springframework.context.annotation.Import;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.GenericMessage;

import lombok.extern.slf4j.Slf4j;
import telran.parking.dto.ParkingDto;
import telran.parking.servise.PangoProviderClientService;

@SpringBootTest
@Import(TestChannelBinderConfiguration.class)
@Slf4j
class PaymentAnalyzerControllerTest {
	@MockBean
	PangoProviderClientService clientService;
	@Autowired
	InputDestination producer;
	@Autowired
	OutputDestination consumer;
	private ParkingDto parkingData = new ParkingDto(12356, 1, "111", LocalDateTime.now());
	private String consumerBindingName = "parkingAnalyzerConsumer-in-0";

	@BeforeEach
	void setUp() {
		log.info("waiting chanell1");
		when(clientService.isReDetect(parkingData)).thenReturn(parkingData);
	}

	@Test
	void loadApplicationContext() {
		log.info("waiting chanell1");
		assertNotNull(clientService);

	}

	@Test
	void notReDetect() {
		log.info("waiting chanell1");
		producer.send(new GenericMessage<ParkingDto>(parkingData), consumerBindingName);
		Message<byte[]> message = consumer.receive(10, consumerBindingName);
		assertNull(message);
	}

}
