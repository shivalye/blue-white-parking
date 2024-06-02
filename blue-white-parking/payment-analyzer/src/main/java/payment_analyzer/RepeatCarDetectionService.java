package payment_analyzer;

import java.time.LocalDateTime;

public interface RepeatCarDetectionService {
	boolean isReDetect(long cameraId, long slotId, String carNumber, LocalDateTime timeStamp);
}
