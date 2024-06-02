package payment_analyzer;

import java.time.LocalDateTime;
import telran.parking.dto.CameraDto;

public interface RepeatCarDetectionService {
	CameraDto isReDetect(long cameraId, long slotId, String carNumber, LocalDateTime timeStamp);
}
