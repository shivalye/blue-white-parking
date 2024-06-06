package telran.parking.servise;

import telran.parking.dto.ParkingDto;

public interface PangoProviderClientService {
	ParkingDto isPaid(ParkingDto parkingData);
	ParkingDto isReDetect(ParkingDto parkingData);
}
