package log;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class EventLogger {
	FileHandler filehandler;
	LogManager logmanager;
	Logger logger;
	
	public EventLogger(String fileName) {
		//EventLogger���� �����̸��� �־��ֵ��� �Ѵ�.
		try {
			logmanager = LogManager.getLogManager();//logmanager�� ���� ���� �־��ش�.
			logger = logmanager.getLogger(Logger.GLOBAL_LOGGER_NAME);
			filehandler = new FileHandler(fileName);
			filehandler.setFormatter(new SimpleFormatter());
			logger.addHandler(filehandler);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//getlog�� ���� �� log�޽���
	public void log(String logMessage) {
		logger.info(logMessage);
	}

}
