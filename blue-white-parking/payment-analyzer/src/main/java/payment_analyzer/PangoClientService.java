package payment_analyzer;

import java.time.LocalDateTime;

public interface PangoClientService {
	boolean isPaid(long cameraId, long slotId, String carNumber, LocalDateTime timeStamp);
}
