import geb.Page

class YummyNoodleBasketPage extends Page {

    static at = { title == "Yummy Noodle Bar" }

    static content = {
        homeButton { $(href: "/") }
				showBasket { $(href: "/showBasket") }
				continueShoppingButton { $("a", class: "btn btn-primary btn-large") }   
}
}
