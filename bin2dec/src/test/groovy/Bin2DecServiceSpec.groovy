import bin2dec.Service.Bin2DecService
import spock.lang.Specification
import spock.lang.Subject

class Bin2DecServiceSpec extends Specification{

    @Subject
    def bin2DecService

    def setup() {
        bin2DecService = new Bin2DecService()
    }


    def 'Given a valid binary input a decimal is returned' () {

        given: "a valid binary input"
        def binaryInput = "1110"

        when: "translateBinary is called"
        def result = bin2DecService.translateBinary(binaryInput)

        then: "a decimal is returned"
        result == 14

    }
}
