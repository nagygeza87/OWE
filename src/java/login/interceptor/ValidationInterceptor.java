/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package login.interceptor;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import java.util.Map;

/**
 *
 * @author geza
 */

public class ValidationInterceptor extends AbstractInterceptor {

    public ValidationInterceptor() {
    }

    @Override
    public void destroy() {
        
    }

    @Override
    public void init() {
        
    }

    public String intercept(ActionInvocation actionInvocation) throws Exception {
        String result = null;
        Map session = actionInvocation.getInvocationContext().getSession();
        if (session != null && session.get("user")!= null){
            result = actionInvocation.invoke();
        } else {
            result = "VALIDATION";
        }
        return result;
    }

}