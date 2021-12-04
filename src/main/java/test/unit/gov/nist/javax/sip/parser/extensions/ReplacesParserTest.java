package test.unit.gov.nist.javax.sip.parser.extensions;

import gov.nist.javax.sip.parser.extensions.ReplacesParser;
import test.unit.gov.nist.javax.sip.parser.ParserTestCase;

public class ReplacesParserTest extends ParserTestCase {

    public void testParser() {
        String to[] =
        {   "Replaces: 12345th5z8z\n",
            "Replaces: 12345th5z8z;to-tag=tozght6-45;from-tag=fromzght789-337-2\n",
        };

        super.testParser(ReplacesParser.class,to);


    }

}
