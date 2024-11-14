package sg.edu.nus.iss.vttp5a_day11l.config;

import org.springframework.web.filter.CommonsRequestLoggingFilter;

public class LoggingConfig {

    public CommonsRequestLoggingFilter loggingFilter() {

        CommonsRequestLoggingFilter crlf = new CommonsRequestLoggingFilter();

        crlf.setIncludeClientInfo(true);
        crlf.setIncludeQueryString(true);
        return crlf;
    }

}
