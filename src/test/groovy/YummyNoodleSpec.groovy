import geb.spock.GebReportingSpec
//import geb.spock.GebSpec


class YummyNoodleSpec extends GebReportingSpec {

    /* def "can get to the shopping basket"() {
        when:
        to YummyNoodleHomePage

        and:
        showBasket.click()
        
				then:
        title == "Yummy Noodle Bar"
 				
    }
		def "return to shopping"() {
				when:
				to YummyNoodleBasketPage

				and:
				continueShoppingButton.click()

				then:
				title == "Spring"
}
*/
		def "choose a menu item"() {
				when:
				to YummyNoodleHomePage

				and:
				thirdMenuItem.click()

				then:
				showBasketLargeButton.exists()
}
}