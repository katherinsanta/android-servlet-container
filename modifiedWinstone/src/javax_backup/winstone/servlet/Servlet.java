/*
 * Copyright 2003-2006 Rick Knowles <winstone-devel at lists sourceforge net>
 * Distributed under the terms of either:
 * - the common development and distribution license (CDDL), v1.0; or
 * - the GNU Lesser General Public License, v2.1 or later
 */
package javax.winstone.servlet;

import java.io.IOException;

/**
 * Basic servlet interface
 * 
 * @author <a href="mailto:rick_knowles@hotmail.com">Rick Knowles</a>
 */
public interface Servlet {
    public void destroy();

    public ServletConfig getServletConfig();

    public String getServletInfo();

    public void init(ServletConfig config) throws ServletException;

    public void service(ServletRequest req, ServletResponse res)
            throws IOException, ServletException;
}
