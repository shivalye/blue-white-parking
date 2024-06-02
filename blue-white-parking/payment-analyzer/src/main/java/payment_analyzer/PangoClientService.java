package payment_analyzer;

import java.time.LocalDateTime;
import telran.parking.dto.CameraDto;

public interface PangoClientService {
	CameraDto isPaid(long cameraId, long slotId, String carNumber, LocalDateTime timeStamp);
}
