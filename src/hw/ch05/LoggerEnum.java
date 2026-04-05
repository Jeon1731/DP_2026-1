package hw.ch05;

public enum LoggerEnum {
    INSTANCE;

    private StringBuilder logBuffer;

    private LoggerEnum() {
        System.out.println("[LoggerEnum] 인스턴스를 생성했습니다.");
        logBuffer = new StringBuilder();
    }

    public void log(String message) {
        logBuffer.append("[").append(System.currentTimeMillis()).append("]").append(message).append("\n");
        System.out.println("[LoggerSynchronizedLazy]" + message);
    }

    public String getLog() {
        return logBuffer.toString();
    }
}

/* 사용 방법
LoggerEnum logger = LoggerEnum.INSTANCE;
logger.log("Message");
*/ 
