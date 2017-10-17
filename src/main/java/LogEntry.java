public class LogEntry {

    String level;
    String timeUTC;
    String timeUnix;
    String appID;
    String hub;
    String environment;
    String host;
    String logID;
    String transactionID;
    String logMessage;
    String origin;
    String threadID;
    String exception;
    String cdll_version;

    public String getLevel() {
        return level;
    }

    public void setLevel(final String level) {
        this.level = level;
    }

    public String getTimeUTC() {
        return timeUTC;
    }

    public void setTimeUTC(final String timeUTC) {
        this.timeUTC = timeUTC;
    }

    public String getTimeUnix() {
        return timeUnix;
    }

    public void setTimeUnix(final String timeUnix) {
        this.timeUnix = timeUnix;
    }

    public String getAppID() {
        return appID;
    }

    public void setAppID(final String appID) {
        this.appID = appID;
    }

    public String getHub() {
        return hub;
    }

    public void setHub(final String hub) {
        this.hub = hub;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(final String environment) {
        this.environment = environment;
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public String getLogID() {
        return logID;
    }

    public void setLogID(final String logID) {
        this.logID = logID;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(final String transactionID) {
        this.transactionID = transactionID;
    }

    public String getLogMessage() {
        return logMessage;
    }

    public void setLogMessage(final String logMessage) {
        this.logMessage = logMessage;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(final String origin) {
        this.origin = origin;
    }

    public String getThreadID() {
        return threadID;
    }

    public void setThreadID(final String threadID) {
        this.threadID = threadID;
    }

    public String getException() {
        return exception;
    }

    public void setException(final String exception) {
        this.exception = exception;
    }

    public String getCdll_version() {
        return cdll_version;
    }

    public void setCdll_version(final String cdll_version) {
        this.cdll_version = cdll_version;
    }
}
