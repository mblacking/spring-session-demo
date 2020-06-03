package org.javababe.springsession.config;

import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;

/**
 * @author LS
 * @date 2020/5/14 11:24 星期四
 */
public class SessionInitializer extends AbstractHttpSessionApplicationInitializer {

    public SessionInitializer() {
        super(SpringSessionConfig.class);
    }
}
