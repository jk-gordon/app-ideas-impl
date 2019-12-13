import bin2dec.Service.Bin2DecService
import spock.lang.Specification
import spock.lang.Subject
import spock.lang.Unroll

class Bin2DecServiceSpec extends Specification{

    @Subject
    def bin2DecService

    def setup() {
        bin2DecService = new Bin2DecService()
    }


    @Unroll
    def 'Given a valid binary input a decimal is returned' () {

        given: "a valid binary input"
        def binaryInput = input

        when: "translateBinary is called"
        def result = bin2DecService.translateBinary(binaryInput)

        then: "a decimal is returned"
        result == expectedResult

        where:
        input  | expectedResult
        "1110" | 14
        "1111" | 15
        "001"  | 1
        "111"  | 7

    }
}
