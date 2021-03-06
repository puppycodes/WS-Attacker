/**
 * WS-Attacker - A Modular Web Services Penetration Testing Framework Copyright
 * (C) 2013 Juraj Somorovsky
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 51
 * Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wsattacker.library.signatureFaking;

import junit.framework.TestCase;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import wsattacker.library.signatureFaking.helper.FileReader;

/**
 * @author Juraj Somorovsky - juraj.somorovsky@rub.de
 * @version 0.1
 */
public class SignatureFakingOracleTest
    extends TestCase
{

    public static final String DIR = "src/test/resources/test-files";

    Logger log = Logger.getLogger( SignatureFakingOracleTest.class );

    private static String LOG_FILE = "logging.properties";

    public SignatureFakingOracleTest()
    {
        PropertyConfigurator.configure( LOG_FILE );
    }

    public void testSignatures()
        throws Exception
    {

        String[] contents = FileReader.readFileContents( DIR );
        // for (String c : contents) {
        SignatureFakingOracle sfo = new SignatureFakingOracle( contents[0] );
        sfo.fakeSignatures();
        System.out.println( sfo.getDocument() );
        // }
    }
}
