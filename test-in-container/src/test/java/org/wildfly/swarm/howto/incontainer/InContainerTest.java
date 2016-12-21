// ### [package]
package org.wildfly.swarm.howto.incontainer;
// ### [package]

import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.wildfly.swarm.arquillian.DefaultDeployment;

import static org.junit.Assert.assertNotNull;

/**
 * @author Bob McWhirter
 */
// ### [prolog]
@RunWith(Arquillian.class)
@DefaultDeployment
public class InContainerTest {
// ### [prolog]

    // ### [arquillian-resource]
    @ArquillianResource
    InitialContext context;
    // ### [arquillian-resource]

    // ### [test]
    @Test
    public void testDataSourceIsBound() throws Exception {
        DataSource ds = (DataSource) context.lookup("java:jboss/datasources/MyDS");
        assertNotNull( ds );
    }
    // ### [test]
}
