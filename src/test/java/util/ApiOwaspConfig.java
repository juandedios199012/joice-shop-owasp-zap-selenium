package util;

public class ApiOwaspConfig {

    public static final String START_SCANNING = EnvConfig.OWASP_ZAP + "/JSON/ascan/action/scan/?url=%s";
    public static final String PROGRESS = EnvConfig.OWASP_ZAP + "/JSON/ascan/view/status/?scanId=%s";
    public static final String GET_LIST_VULNERABILITY = EnvConfig.OWASP_ZAP + "/HTML/ascan/view/scanProgress/?scanId=%s";
    public static final String GET_REPORT = EnvConfig.OWASP_ZAP + "/OTHER/core/other/htmlreport/?";
}
