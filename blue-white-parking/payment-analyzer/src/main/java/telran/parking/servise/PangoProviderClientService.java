package telran.parking.servise;

import java.time.LocalDateTime;

import telran.parking.dto.CameraDto;

public interface PangoProviderClientService {
	CameraDto isPaid(long cameraId, long slotId, String carNumber, LocalDateTime timeStamp);
	CameraDto isReDetect(long cameraId, long slotId, String carNumber, LocalDateTime timeStamp);
}
