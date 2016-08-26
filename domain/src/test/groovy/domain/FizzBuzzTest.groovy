package domain

import spock.lang.Specification

class FizzBuzzTest extends Specification {
    def "Exec"() {

        expect:
        FizzBuzz.exec(input).equals(result)

        where:
        input || result
        6     || "Fizz"
        10    || "Buzz"
        30    || "FizzBuzz"
        2     || "2"
    }
}
