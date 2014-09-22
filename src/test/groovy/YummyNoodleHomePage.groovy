import geb.Page

class YummyNoodleHomePage extends Page {

    static at = { title == "Yummy Noodle Bar" }

    static content = {
       // manualsMenu { module MenuModule, $("#header-content ul li", 0) }
        homeButton { $(href: "/") }
				showBasketNavButton { $(href: "/showBasket") }
				springButton { $("a", class: "btn btn-primary btn-large")}
				firstMenuItem { $("input", value: "YM1").sibling("input", value: "Add to basket")}
				secondMenuItem { $("input", value: "YM2").sibling("input", value: "Add to basket")}
				thirdMenuItem  { $("input", value: "YM3").sibling("input", value: "Add to basket")}
				showBasketLargeButton { $("a", class: "btn btn-primary btn-larg", href: "/showBasket")}

    }
}
